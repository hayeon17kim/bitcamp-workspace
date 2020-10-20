package com.eomcs.net.ex11.step01;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.Socket;

public class CalculatorClient {
  public static void main(String[] args) throws Exception {
    try (Socket socket = new Socket("localhost", 8888);
        PrintStream out = new PrintStream(socket.getOutputStream());
        BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()))) {
      
      out.println("계산기 서버에 오신 것을 환영합니다!");
      out.println();
    }
  }
}
