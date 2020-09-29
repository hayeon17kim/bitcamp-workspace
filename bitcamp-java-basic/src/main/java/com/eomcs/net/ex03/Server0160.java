package com.eomcs.net.ex03;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Server0160 {
  public static void main(String[] args) {
    try (Scanner keyboard = new Scanner(System.in);
        ServerSocket serverSocket = new ServerSocket(8888)) {
      System.out.println("클라이언트와의 연결을 기다리고 있음");
      
      try (Socket socket = serverSocket.accept();
          PrintStream out = new PrintStream(new BufferedOutputStream(socket.getOutputStream()));
          Scanner in = new Scanner(new BufferedInputStream(socket.getInputStream()))) {
        
      } catch (Exception e) {
        e.printStackTrace();
      }
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}
