package com.eomcs.basic.ex04;

public class Exam0551 {
  public static void main(String[] args) {
    
    int[] arr1;
    arr1 = new int[5];
    
    arr1 = null;
    
    System.out.println(arr1[0]);    // NullPointerException 실행 오류!
  }
}
