package com.eomcs.io.ex02;

import java.io.FileOutputStream;

public class Exam0210 {
  public static void main(String[] args) throws Exception {
    FileOutputStream out = new FileOutputStream("temp/test1.data");

    byte[] bytes = new byte[] {0x7a, 0x6b, 0x5c, 0x4d, 0x3e, 0x2f, 0x30};

    out.write(bytes);

    out.close();

    System.out.println("데이터 출력 완료!");
  }
}
