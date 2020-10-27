package com.eomcs.net.ex11.step09;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;

public class CalculatorServer {
  public static void main(String[] args) {
    try(ServerSocket serverSocket = new ServerSocket(80)) {
      System.out.println("서버 실행 중...");
      
      new RequestProcessor(serverSocket.accept()).service();
      
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}
