package com.eomcs.exception.ex4;

public class Exam0130 {
  static void m1() {
    m2();
  }

  static void m2() {
    m3();
  }

  static void m3() {
    m4();
  }

  static void m4() {
    throw new RuntimeException("실행중 오류가 발생하였습니다.");
  }

  public static void main(String[] args) {
    try {
      m1();
    } catch (RuntimeException e) {
      System.out.println(e.getMessage());
    }
  }
}
