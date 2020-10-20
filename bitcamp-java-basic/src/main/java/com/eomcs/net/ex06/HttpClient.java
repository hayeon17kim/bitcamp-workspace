package com.eomcs.net.ex06;

import java.io.PrintStream;
import java.net.Socket;
import java.util.Scanner;

public class HttpClient {
  public static void main(String[] args) throws Exception{
    Socket socket = new Socket("itempage3.auction.co.kr", 80);
    PrintStream out = new PrintStream(socket.getOutputStream());
    Scanner in = new Scanner(socket.getInputStream());
    
    out.print("GET / HTTP/1.1\r\n");
    out.print("Host: www.danawa.com\r\n");
    out.print("\r\n");
    
    while (true) {
      try {
        System.out.println(in.nextLine());
      } catch (Exception e) {
        break;
      }
    }
    
    out.close();
    in.close();
    socket.close();
  }
}
