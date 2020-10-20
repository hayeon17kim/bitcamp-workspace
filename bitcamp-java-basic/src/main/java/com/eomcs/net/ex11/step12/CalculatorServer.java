package com.eomcs.net.ex11.step12;

import java.net.ServerSocket;


public class CalculatorServer {
  public static void main(String[] args) {
    try(ServerSocket serverSocket = new ServerSocket(8888)) {
      System.out.println("서버 실행 중...");
      while (true) {
        RequestProcessor requestProcessor = new RequestProcessor(serverSocket.accept());
        requestProcessor.start();        
      }
      
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}
