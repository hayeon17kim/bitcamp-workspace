package com.eomcs.basic.ex04;

public class Exam0540 {
  public static void main(String[] args) {
    
    int[] arr1;
    
    //arr1[0] 100;    //컴파일 오류!
    
    arr1 = new int[5];
    
    arr1[0] = 100;
    
    System.out.println(arr1[0]);
  }
}
