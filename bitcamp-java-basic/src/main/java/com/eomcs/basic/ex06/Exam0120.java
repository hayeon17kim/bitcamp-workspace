package com.eomcs.basic.ex06;

//# 흐름 제어문 - 조건문 if에 여러 문장을 묶기

public class Exam0120 {
  public static void main(String[] arge) {
      int age = 17;

      // 블록으로 묶지 않으면 첫 번째 문장만 if에 종속된다.
      if (age >= 19)
        System.out.println("성인이다.");
        System.out.println("군대 가야 한다.");
        System.out.println("일해야 한다.");
        System.out.println("세금 납무해야 한다.");

      System.out.println("------------------");

      if (age >= 19) {
        System.out.println("성인이다.");
        System.out.println("군대 가야 한다.");
        System.out.println("일해야 한다.");
        System.out.println("세금 납무해야 한다.");
      }
  }
}
