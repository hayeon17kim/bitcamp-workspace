package com.eomcs.oop.ex06.b;

public class A {
  static public void m() {
    System.out.println("m()");
  }
  
  static public void m(int a) {
    System.out.println("m(int)");
  }
  
  static public void m(String a) {
    System.out.println("m(String)");
  }
  
  static public void m(String a, int b) {
    System.out.println("m(String, int");
  }
  
  static public void m(int a, String b) {
    System.out.println("m(int, String");
  }
  
  // 변수의 이름만 다른 메서드를 중복해서 만들 수 없다.
  // 리턴 타입만 다른 메서드를 중복해서 만들 수 없다.
  // 메서드를 찾ㅇ르 때 파라미터 값의 타입으로 찾기 때문이다.
}
