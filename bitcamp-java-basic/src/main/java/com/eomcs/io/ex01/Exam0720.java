package com.eomcs.io.ex01;

import java.io.File;

public class Exam0720 {
  public static void main(String[] args) {
    File file = new File("temp");
    deleteFile(file);
    System.out.println("삭제하였습니다!");
  }

  static void deleteFile(File dir) {
    // 주어진 파일이 디렉토리라면 하위 파일이나 디렉토리를 찾아 지운다.
    if (dir.isDirectory()) {
      File[] files = dir.listFiles();
      for (File file : files) {
        deleteFile(file);
      }
    }
    dir.delete(); // 현재 폴더 지우기
  }
}
