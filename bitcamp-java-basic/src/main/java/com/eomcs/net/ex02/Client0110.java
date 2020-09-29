package com.eomcs.net.ex02;

import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

public class Client0110 {
  public static void main(String[] args) throws UnknownHostException, IOException {
    Socket socket = new Socket("localhost", 8888);
    
    System.out.println("서버와 연결되었음!");
    socket.close();
    
    System.out.println("서버와 연결을 끊었음!");
    
  }
}
