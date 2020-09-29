// BufferedInputStream과 BufferedOutputStream을 사용하여 파일 복사 및 시간 측정
package com.eomcs.io.ex08;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import com.eomcs.io.ex09.BufferedOutputStream;
import com.eomcs.io.ex09.step1.BufferedInputStream;

public class Exam0220 {

  public static void main(String[] args) throws Exception {
    FileInputStream fileIn = new FileInputStream("temp/jls11.pdf");
    BufferedInputStream in = new BufferedInputStream(fileIn);

    FileOutputStream fileOut = new FileOutputStream("temp/jls11_5.pdf");
    BufferedOutputStream out = new BufferedOutputStream(fileOut);

    int b;

    long startTime = System.currentTimeMillis(); // 밀리초

    while ((b = in.read()) != -1)
      out.write(b);

    long endTime = System.currentTimeMillis();

    System.out.println(endTime - startTime);

    in.close();
    out.close();
  }

}
