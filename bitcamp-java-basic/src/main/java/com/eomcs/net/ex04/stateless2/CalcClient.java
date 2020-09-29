package com.eomcs.net.ex04.stateless2;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.Socket;
import java.util.Scanner;

public class CalcClient {
  public static void main(String[] args) throws Exception {
    Scanner keyScan = new Scanner(System.in);
    
    long clientId = 0;
    
    while (true) {
      System.out.print("연산자? ");
      String op = keyScan.nextLine();
      System.out.print("값? ");
      int value = Integer.parseInt(keyScan.nextLine());
      try(      
          Socket socket = new Socket("localhost", 8888);
          DataInputStream in = new DataInputStream(socket.getInputStream());
          DataOutputStream out = new DataOutputStream(socket.getOutputStream())
          ) {
        
        out.writeLong(clientId);
        out.writeUTF(op);
        out.writeInt(value);
        out.flush();
        
        clientId = in.readLong();
        
        int result = in.readInt();
        System.out.printf("계산 결과: %d", result);
      } catch (Exception e) {
        System.out.println("서버와 통신 중 오류 발생!");
      }
      System.out.print("계속하시겠습니까? (Y/n");
      if (keyScan.nextLine().equalsIgnoreCase("n")) {
        break;
      }
    }
  }
}
