package com.eomcs.net.ex03;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.Socket;
import java.util.Scanner;

public class Client0130 {
  public static void main(String[] args) {
    try (Scanner keyScan = new Scanner(System.in);
        Socket socket = new Socket("localhost", 8888);
        DataOutputStream out = new DataOutputStream(socket.getOutputStream());
        DataInputStream in = new DataInputStream(socket.getInputStream())) {
      System.out.println("서버와 연결되었고, 입출력 스트림도 준비되었음!");
      System.out.print(">");
      keyScan.nextLine();
      
      out.write(1572939);
      
      System.out.println("서버에 데이터 보냄!");
      byte[] buf = new byte[100];
      int size = in.read(buf);
      System.out.printf("바이트 배열 크기: %d\n", size);
      for (int i = 0; i < size; i++) {
        if (i > 0 && (i % 20) == 0) {
          System.out.println();
        }
        System.out.printf("%x ", buf[i]);
      }
      
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}
