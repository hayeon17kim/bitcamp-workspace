package com.eomcs.net.ex03;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Server0120 {
  public static void main(String[] args) {
    try (Scanner keyboard = new Scanner(System.in);
        ServerSocket serverSocket = new ServerSocket(8888)) {
      System.out.println("클라이언트의 연결을 기다리고 있음!");
      try (Socket socket = serverSocket.accept();
          OutputStream out = socket.getOutputStream();
          InputStream in = socket.getInputStream()) {
        System.out.println("대기열에서 클라이언트 정보를 꺼내 소켓을 생성하였음.");
        System.out.println("클라이언트와 통신할 입출력 스트림이 준비되었음.");
        System.out.println("클라이언트가 보낸 100바이트를 기다리고 있음!");
        byte[] buf = new byte[100];
        int size = in.read(buf);
        System.out.printf("읽은 바이트 수: %d\n", size);
        for (int i = 0; i < size; i++) {
          if (i > 0 && (i % 20) == 0) {
            System.out.println();
          }
          System.out.printf("%x ", buf[i]);
        }
        System.out.println("데이터를 보내기 전에 잠깐!");
        keyboard.nextLine();

        out.write(buf, 0, size);

        System.out.println("클라이언트에게 데이터를 보냈음.");
      }
      System.out.println("클라이언트와의 연결을 끊었음");
    }  catch (Exception e) {
      e.printStackTrace();
    }
    System.out.println("서버 종료!");
  }
}
