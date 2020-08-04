package com.eomcs.basic.ex07;

//# 매서드 : Heap 메모리 영역 
public class Exam0420 {
  static int[] getArray() {
    int[] arr = new int[] {100, 200, 300};
    return arr;
  }
  
  public static void main(String[] args) {
    int[] arr;
    arr = getArray();
    System.out.println(arr[1]);
  }
}
