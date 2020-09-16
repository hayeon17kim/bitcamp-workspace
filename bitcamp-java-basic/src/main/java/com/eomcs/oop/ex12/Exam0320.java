package com.eomcs.oop.ex12;

public class Exam0320 {
  static interface Calculator {
    int compute(int a, int b);
  }

  static void test(Calculator c) {
    System.out.println(c.compute(100, 200));
  }

  public static void main(String[] args) {
    // 파라미터와 리턴 값이 있는 메서드
    test((a, b) -> a + b);
  }
}
