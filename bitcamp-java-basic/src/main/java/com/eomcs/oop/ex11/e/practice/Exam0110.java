package com.eomcs.oop.ex11.e.practice;

public class Exam0110 {
  interface A {
    void print();
  }

  public static void main(final String[] args) {
    class My implements A {
      @Override
      public void print() {
        System.out.println("Hello!");
      }
    }

    A obj = new My();
    obj.print();
  }
}
