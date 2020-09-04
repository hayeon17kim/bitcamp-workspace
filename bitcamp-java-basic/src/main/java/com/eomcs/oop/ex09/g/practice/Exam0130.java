package com.eomcs.oop.ex09.g.practice;

// 인터페이스의 스태틱 메서드 호출
public class Exam0130 {
  public static void main(String[] args) {
    System.out.println(A.m1());
    Exam0110 v = new Exam0110();
    v.m1();

    // 인스턴스 생성과 상관없이 인터페이스 타입으로 호출하는 메서드다.
    //
  }
}
