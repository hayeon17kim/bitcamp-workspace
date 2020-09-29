package com.eomcs.io.ex04;

import java.io.FileInputStream;

public class Exam0220 {
  public static void main(String[] args) throws Exception {
    FileInputStream in = new FileInputStream("temp/test3.data");

    int value = in.read() << 24;
    value += (in.read() << 16);
    value += (in.read() << 8);
    value += in.read();

    in.close();
    System.out.printf("%x\n", value);


  }
}
