package com.eomcs.io.ex09.step3;

import java.io.ByteArrayInputStream;

public class Exam0130 {
  public static void main(String[] args) {
    byte[] buf = {0x0b, 0x41, 0x42, (byte) 0xea, (byte) 0xb0, (byte) 0x80, (byte) 0xea, (byte) 0xb0,
        (byte) 0x81, (byte) 0xea, (byte) 0xb0, (byte) 0x84, 0x00, 0x00, 0x00, 0x1b, 0x01};

    ByteArrayInputStream arrIn = new ByteArrayInputStream(buf);

    DataInputStream in = new DataInputStream(arrIn);


  }
}
