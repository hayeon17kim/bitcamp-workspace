package com.eomcs.oop.ex12;

public class Exam0321 {
  static interface Calculator {
    int compute(int a, int b);
  }

  static void test(Calculator c) {
    System.out.println(c.compute(100, 200));
  }

  public static void main(String[] args) {
    test(new Calculator() {
      @Override
      public int compute(int a, int b) {
        return a + b;
      }
    };
  }
}

// 익명클래스의 수퍼클래스 생성자를 호출한다.
