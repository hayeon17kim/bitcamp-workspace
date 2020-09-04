package com.eomcs.oop.ex09.g.practice;

public class Exam0140 {
  public static void main(String[] args) {
    Exam0110 obj = new Exam0110();

    // 수퍼 클래스의 메서드 호출
    obj.x1(); // 수퍼 클래스의 스태틱 메서드를 호출할 수 잇다.
    obj.x2(); // 수퍼 클래스의 인스턴스 메서드를 호출할 수 있다.

    obj.m1(); // 인터페이스의 스태틱 메서드를 사용할 수 없다.
    // 상속받는 게 아니라 규칙일 뿐이다.
    // 인터페이스의 static 메서드는 클래스가 구현해야 할 메서드가 아니다.

  }
}
