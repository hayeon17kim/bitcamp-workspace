package com.eomcs.net.ex02;

import java.net.ServerSocket;
import java.util.Scanner;

public class Server0310{
  public static void main(String[] args) throws Exception {
    Scanner keyboard = new Scanner(System.in);
    
    System.out.println("서버 실행");
    
    ServerSocket ss = new ServerSocket(8888, 2);
    System.out.println("서버 소켓 생성 완료!");
    System.out.println("클라이언트 연결을 기다리는 중...");
    
    // 잠깐 멈추기
    // => 대기열이 꽉 찼을 때 클라이언트 접속 요청은 어떻게 되는가?
    keyboard.nextLine();
    
    ss.close();
    System.out.println("서버 종료!");
    keyboard.close();
  }
}
