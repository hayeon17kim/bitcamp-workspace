package com.eomcs.io.ex02;

import java.io.FileOutputStream;

public class Exam0110 {
  public static void main(String[] args) throws Exception {
    FileOutputStream out = new FileOutputStream("temp/myfile.data");

    out.write(0x716b5c4d);

    out.close();

    System.out.println("데이터 출력 완료!");
  }
}
