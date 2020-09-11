package com.eomcs.oop.ex11.e.practice;

public class Exam0121 {
  interface A {
    void print();
  }
  
  public static void main(final String[] args) {
    // 익명 클래스로 인터페이스 구현하기
    
    // 1단계: 로컬 클래스
    class X implements A {
      @Override
      public void print() {
        System.out.println("Hello!");
      }
    };
    
    A obj = new X();
    obj.print();
  }
}
