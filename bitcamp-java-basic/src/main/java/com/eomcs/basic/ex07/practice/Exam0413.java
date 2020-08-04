package com.eomcs.basic.ex07.practice;

import java.util.ArrayList;

// Stack과 Heap 메모리 영역
//
public class Exam0413 {

  public static void main(String[] args) throws Exception {
    ArrayList list = new ArrayList();
    // 주소를 담는 그릇 
    while (true) {
      list.add(createArray());
      //가비지가 될 수 없음

      Thread.currentThread().sleep(2000);
    }
  }
  
  static int[] createArray() {
    
    System.out.println(".");
    return new int[10_000_000];
    
  }
  

  
}