package com.eomcs.exception.ex3;

public class Exam0110 {
  static void m() {
    // throw new String("예외가 발생했습니다.");
    throw new RuntimeException("예외가 발생했습니다!");
  }

  public static void main(String[] args) {
    try {
      m();
    } catch (RuntimeException e) {
      System.out.println(e.getMessage());
    }
    System.out.println("시스템을 종료합니다.");
    m();
    System.out.println("시스템을 종료합니다.");
  }
}
