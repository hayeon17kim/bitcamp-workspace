package com.eomcs.io.ex02;

import java.io.FileInputStream;

public class Exam0120 {
  public static void main(String[] args) throws Exception {
    FileInputStream in = new FileInputStream("temp/myfile.data");

    int b = in.read();

    in.close();
    System.out.printf("%x\n", b);
  }
}
