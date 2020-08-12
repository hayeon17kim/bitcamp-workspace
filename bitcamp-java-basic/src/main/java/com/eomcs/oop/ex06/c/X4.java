package com.eomcs.oop.ex06.c;

public class X4 extends X3 {
  @Override
  void m1() {
    System.out.println("X4의 m1()");
  }
  
  void test() {
    this.m1();
    super.m1();
    
    this.m2();
    super.m2();
    
    //super.super.m1(); 컴파일 오류!
    
  }
}
