/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package com.eomcs.pms;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import com.eomcs.util.Prompt;

// Stateful 통신 
// => 서버와 연결하여 간단한 메시지 주고 받기
// => 사용자가 입력한 명령을 서버에 전송하기
// => 애플리케이션 아규먼트를 이용하여 서버의 주소를 입력받는다.
public class ClientApp {
  
  static String host;
  static int port;
  static boolean stop;
  public static void main(String[] args) {
    if (args.length != 2) {
      System.out.println("프로그램 사용법:");
      System.out.println("   java -cp ... Client 서버주소 포트번호");
      System.exit(0);
    }
    
    host = args[0];
    port = Integer.parseInt(args[1]);
    
  // 클라이언트가 서버에 stop명령을 보내면 다음 변수를 true로 변경한다.
  

    while (true) {
      String input = Prompt.inputString("명령> ");
      
      if (input.equalsIgnoreCase("quit"))
        break;
      
      request(input);
      
      if (input.equalsIgnoreCase("stop"))
        break;
    }
      
    System.out.println("안녕!");
    
  }
  
  private static void request(String message) {
    try (Socket socket = new Socket(host, port);
        BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        PrintWriter out = new PrintWriter(socket.getOutputStream())) {
      out.println(message);
      out.flush();
      receiveResponse(out, in);
      
    } catch (Exception e) {
      
    }
    
    if (stop) {
      try (Socket socket = new Socket(host, port)) {
        
      } catch (Exception e) {
        
      }
    }
    
  }
  
  
  private static void receiveResponse(PrintWriter out, BufferedReader in) throws Exception {
    while (true) {
      String response = in.readLine();
      if (response.length() == 0) {
        break;        
      }
      else if (response.equals("!{}!")) {
        //사용자로부터 입력을 받아 서버에 보낸다.
        out.println(Prompt.inputString(""));
        out.flush();
      } else {
        System.out.println(response);
      }
    }
  }
}
