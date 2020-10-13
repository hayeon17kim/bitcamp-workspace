package com.eomcs.pms;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerApp {
  public static void main(String[] args) {
    try (ServerSocket ss = new ServerSocket(8888)){
      System.out.println("서버 실행 중...");
      try (Socket socket = ss.accept();
          BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
          PrintWriter out = new PrintWriter(socket.getOutputStream()))  {
            out.println(in.readLine());
            out.flush();
          } catch (Exception e) {
            
          }
    } catch (Exception e) {
      System.out.println();
    }
  }
}
