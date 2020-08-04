package com.eomcs.basic.ex07;

//# 매서드 : JVM 메모리
public class Exam0410 {
  static void swap(int a, int b) {
    int temp = a;
    a = b;
    b = temp;
    System.out.printf("swap(): a=%d, b=%d\n", a, b);
  }
  
  public static void main(String[] args) {
    int a = 100;
    int b = 200;
    swap(a, b);
    System.out.printf("main(): a=%d, b=%d\n", a, b);
  }
}
