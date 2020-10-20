package com.eomcs.net.ex11.step06;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.Socket;
import java.util.Scanner;

public class CalculatorClient {
  public static void main(String[] args) {
    try (        Scanner keyboardScanner = new Scanner(System.in);
        Socket socket = new Socket("localhost", 8888);
        PrintStream out = new PrintStream(socket.getOutputStream());
        BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()))) {
          receiveResponse(in); // 서버의 인사말을 출력
          
          while (true) {
            String input = prompt(keyboardScanner);
            if (input == null) {
              continue;
            }
            sendRequest(out, input);
            receiveResponse(in); // 서버의 실행 결과를 출력
            
            if (input.equalsIgnoreCase("quit")) {
              break;
            }
          }
        } catch (Exception e) {
          e.printStackTrace();
        }
  }
  
  static String prompt(Scanner keyboardScanner) {
    System.out.print("계산식> ");
    String input = keyboardScanner.nextLine();
    if (input.split(" ").length != 3) {
      return null;
    }
    return input;
  }
  
  static void sendRequest(PrintStream out, String message) {
    out.println(message);
    out.flush();
  }
  
  static void receiveResponse(BufferedReader in) throws Exception {
    while (true) {
      String input = in.readLine();
      if (input.length() == 0) {
        break;
      }
      System.out.println(input);
    }
  }
}
