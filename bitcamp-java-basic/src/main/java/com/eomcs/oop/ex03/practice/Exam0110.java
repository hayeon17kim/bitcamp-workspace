package com.eomcs.oop.ex03.practice;

public class Exam0110 {
  public static void main(String[] args) {
    // instatnce field = non-static variable
    // 
    // 인스턴스를 생성할 때 heap에 생성되는 변수 
    class A {
      int v1;
      boolean v2;
    }
    A obj1 = new A();
    A obj2 = new A();
    A obj3 = new A();
    
    obj1.v1 = 100;
    obj2.v1 = 200;
    obj3.v1 = 300;
    
    System.out.println(obj1.v1);
    System.out.println(obj2.v1);
    System.out.println(obj3.v1);
  }
}
