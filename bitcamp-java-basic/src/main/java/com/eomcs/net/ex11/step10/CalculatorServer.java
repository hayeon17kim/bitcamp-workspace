package com.eomcs.net.ex11.step10;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;

public class CalculatorServer {
  public static void main(String[] args) {
    RequestProcessor requestProcessor = new RequestProcessor();
    try(ServerSocket serverSocket = new ServerSocket(8888)) {
      System.out.println("서버 실행 중...");
      requestProcessor.setSocket(serverSocket.accept());
      requestProcessor.service();
      
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}
