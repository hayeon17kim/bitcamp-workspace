package com.eomcs.io.ex09.step3;

import java.io.FileInputStream;
import java.io.IOException;

public class Exam0210 {
  public static void main(String[] args) throws IOException {
    BufferedInputStream in = new BufferedInputStream(new FileInputStream("temp/jls11.pdf"));
    int b;

    long startTime = System.currentTimeMillis();

    int callCount = 0;
    while ((b = in.read()) != -1)
      callCount++;
    long endTime = System.currentTimeMillis();

    System.out.println(endTime - startTime);
    System.out.println(callCount);
    in.close();
  }
}
