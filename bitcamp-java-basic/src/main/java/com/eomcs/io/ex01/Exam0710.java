package com.eomcs.io.ex01;

import java.io.File;

public class Exam0710 {
  public static void main(String[] args) {
    // 현재 디렉토리에 파일 및 디렉토리 이름 출력
    File dir = new File(".");

    printFiles(dir, 0);
  }

  static void printFiles(File dir, int level) {
    File[] files = dir.listFiles();
    for (File file : files) {
      printIndent(level);
      System.out.println(file.getName());
      if (file.isDirectory())
        printFiles(file, level + 1);
    }
  }

  static void printIndent(int level) {
    for (int i = 0; i < level; i++) {
      System.out.print("  ");
    }
    System.out.print("|--");
  }
}
