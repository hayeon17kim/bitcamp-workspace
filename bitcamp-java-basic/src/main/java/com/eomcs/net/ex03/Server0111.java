package com.eomcs.net.ex03;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Server0111 {
  public static void main(String[] args) {
    Scanner keyboard = null;
    ServerSocket serverSocket = null;
    
    try {
      keyboard = new Scanner(System.in);
      serverSocket = new ServerSocket(8888);
      System.out.println("클라이언트의 연결을 기다리고 있음.");
      
      try(Socket socket = serverSocket.accept();
      OutputStream out = socket.getOutputStream();
      InputStream in = socket.getInputStream();
      ) {
        System.out.println("대기열에서 클라이언트 정보를 꺼내 소켓을 생성하였음");
        System.out.println("클라이언트와 통신할 입출력 스트림이 준비되었음");

        System.out.println("클라이언트가 보낸 1바이트를 기다리고 있음");
        int request = in.read(); // blocking 모드로 작동한다.
        
        System.out.println(request);
        
        System.out.println("데이터를 보내기 전에 잠깐!");
        keyboard.nextLine();
        
        out.write(request);
        
        System.out.println("클라이언트에게 데이터를 보냈음.");
        
      } catch (Exception e) {
        e.printStackTrace();
      } 
      
      
    } catch (Exception e) {
      e.printStackTrace();
    } finally {
      try { keyboard.close(); } catch (Exception e) {}
      try { serverSocket.close(); } catch (Exception e) {}
    }
  }
}
