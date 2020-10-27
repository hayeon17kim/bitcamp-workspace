package com.eomcs.net.ex05;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class Client0210 {
  public static void main(String[] args) throws Exception {
    DatagramSocket socket = new DatagramSocket();
    
    String reciever = "localhost";
    int port = 8888;
    
    byte[] bytes = "Hello".getBytes();
    
    DatagramPacket packet = new DatagramPacket(
        bytes,
        bytes.length,
        InetAddress.getByName(reciever),
        port
        );
    
    socket.send(packet);
    System.out.println("데이터 전송 완료!");
    socket.close();
  }
}
