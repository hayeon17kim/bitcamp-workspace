package com.eomcs.oop.ex11.e.practice;

public class Exam0120 {
  interface A {
    void print();
  }
  
  public static void main(final String[] args) {
    A obj = new A() {
      @Override
      public void print() {
        System.out.println("Hello!");
      }
    };
    
    obj.print();
  }
}
