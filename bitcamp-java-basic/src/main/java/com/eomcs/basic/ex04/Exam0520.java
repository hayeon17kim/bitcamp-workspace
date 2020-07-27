package com.eomcs.basic.ex04;

public class Exam0520 {
  public static void main(String[] args) {
    int[] arr1 = new int[5];
    
    // 배열 메모리에 접
    arr1[0] = 100;
    arr1[1] = 200;
    arr1[2] = 300;
    arr1[3] = 400;
    arr1[4] = 500;
    
    arr1[5] = 600;  //실행 오류(Runtime Error)
    arr1[-1] = 700; //실행 오류(Runtime Error)
  }
  
}
