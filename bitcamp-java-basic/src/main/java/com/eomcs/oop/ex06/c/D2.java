package com.eomcs.oop.ex06.c;

public class D2 extends D {
  @Override
  void m(){
    System.out.println("D2의 m()");
  }
  
  void test() {
    this.m();
    super.m();
  }
}
