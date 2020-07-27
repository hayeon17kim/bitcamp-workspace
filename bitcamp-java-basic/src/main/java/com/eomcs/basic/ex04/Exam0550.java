package com.eomcs.basic.ex04;

public class Exam0550 {
  public static void main(String[] args) {
    int[] arr1;
    arr1 = new int[5];
    
    int[] arr2 = arr1;
    
    arr2[0] = 100;
    
    // arr2를 통해 값을 저장한 후, arr1을 통해 값을 꺼낼 수 있다.
    System.out.println(arr1[0]);
  }
}
