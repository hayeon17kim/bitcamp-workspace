package com.eomcs.oop.ex12;

public class Exam0150 {
  static interface Calculator {
    int compute(int a, int b);
  }

  public static void main(String[] args) {
    Calculator c1 = (a, b) -> {
      return a + b;
    };
    System.out.println(c1.compute(10, 20));

    Calculator c2 = (a, b) -> a - b;
    System.out.println(c2.compute(10, 20));

    Calculator c3 = (a, b) -> Math.max(a, b);
    System.out.println(c3.compute(10, 20));

    // Calculator c4 = (a, b) -> System.out.println(a + "," + b);
  }
}
