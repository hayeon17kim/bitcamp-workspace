package com.eomcs.oop.ex11.f.practice;

import java.io.File;

public class Exam0110 {
  public static void main(String[] args) throws Exception {
    // 현재 폴더에 들어 있는 하위 폴더 및 파일들의 이름을 출력
    // => 프로젝트 폴더
    
    // File 클래스를 이용하여 현재 폴더의 정보를 알아낸다.
    // File 클래스는 OS의 기능을 이용하여 폴더 및 파일 다루는 일을 한다.
    File dir = new File(".");
    
    String[] names = dir.list();
    for (String name : names) {
      System.out.println(name);
    }
    
  }
}
