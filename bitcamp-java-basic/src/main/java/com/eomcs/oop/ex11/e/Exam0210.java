// anonymous class - 클래스 상속
package com.eomcs.oop.ex11.e;

public class Exam0210 {
  // 클래스는 스태틱으로 선언해야만 스태틱 멤버에서 접근할 수 있다.
  // 추상 클래스가 아니어도 상관 없다.
  static abstract class A {
    public abstract void print();
  }

  public static void main(final String[] args) {
    // 클래스를 상속 받는 익명 클래스 만들기
    // 문법:
    // => 클래스명 레퍼런스 = new 클래스명(생성자 파라미터, ...) {};
    //
    // 할당문이기 때문에 뒤에 ;를 반드시 붙여야 한다.
    // => 익명 클래스를 정의한 문법이기 때문에
    final A obj = new A() {
      @Override
      public void print() {
        System.out.println("Hello2!");
      }
    };
    obj.print();
  }
}
