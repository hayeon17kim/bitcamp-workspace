package com.eomcs.net.ex02;

import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Server0410 {
  public static void main(String[] args) throws Exception {
    Scanner keyboard=  new Scanner(System.in);
    
    ServerSocket ss = new ServerSocket(8888, 2);
    System.out.println("서버 소켓 생성 완료!");
    System.out.println("클라이언트 연결을 기다리는 중...");
    
    Socket socekt = ss.accept();
    System.out.println("대기 중인 클라이언트 ");
    
  }
}
