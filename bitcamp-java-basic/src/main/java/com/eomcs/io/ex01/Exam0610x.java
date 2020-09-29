package com.eomcs.io.ex01;

import java.io.File;
import java.io.FileFilter;

public class Exam0610x {
  public static void main(String[] args) {
    // 1) 현재 폴더의 파일 또는 디렉토리 이름 출력
    // 2) 파일 이름 뿐만 아니라 디렉토리일 경우 d 파일인 경우 - 를 앞에 출력
    // 3) 파일의 크기 출력
    // 4) 파일의 크기를 출력할 때 10자리로 고정하라.
    // 5) 파일의 크기를 출력할 때 크기가 0인 경우 빈 문자열을 출력하라.
    // 6) 파일 이름이 .java 인 경우만 출력
    // 7)

    class MyFileFilter implements FileFilter {
      @Override
      public boolean accept(File f) {
        return f.getName().endsWith(".java") && f.isFile();
      }
    }

    File currentFile = new File(".");
    File[] files = currentFile.listFiles(new MyFileFilter());
    for (File file : files) {
      System.out.printf("%s %10d %s\n", file.isDirectory() ? "d" : "-", file.length(),
          file.getName());
    }
  }
}
