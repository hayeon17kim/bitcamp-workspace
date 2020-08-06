package com.eomcs.oop.ex03;

//인스턴스 메서드 - 내장 변수 this

public class Exam0220 {
  static class A {
    int value;
    
    static void m1() {
      //this.value = 100;
    }
    
    void m2() {
      // 인스턴스 메서드는 인스턴스 주소가 있어야만 호출되기 때문에
      // 주소를 받을 변수 내장
      this.value = 100;
    }
    
    void m3() {
      value = 200; // 생략
    }
    
    void m4(int value) {
      // 로컬변수와 인스턴스 이름이 같을 경우
      // this 붙이지 않으면 로컬 변수
      value = 200; // 로컬 변수
      this.value = 300; // 인스턴스 변수 
    }
  }
  
  public static void main(String[] args) {
    A.m1();
    
    A obj1 = new A();
    obj1.m2();
    
    // 클래스 메서드도 레퍼런스를 가지고 호출할 수 있음
    // 인스턴스 주소가 메서드에 전달되지 않는다.
    // 그래서 클래스 메서드는 내장변수 this가 없다.
    obj1.m1();
    
    A obj2 = new A();
    // 메서드가 호출될 때마다 this 변수값이 바뀐다.
    obj2.m2();
  }
}
