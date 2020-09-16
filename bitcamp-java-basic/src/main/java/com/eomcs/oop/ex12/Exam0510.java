package com.eomcs.oop.ex12;

public class Exam0510 {
  static class MyCalculator {
    public static int plus(int a, int b) {
      return a + b;
    }

    public static int minus(int a, int b) {
      return a - b;
    }

    public static int multiple(int a, int b) {
      return a * b;
    }

    public static int divide(int a, int b) {
      return a / b;
    }
  }

  static interface Calculator {
    int compute(int a, int b);
  }

  public static void main(String[] args) {
    Calculator c1 = MyCalculator::plus;
    Calculator c2 = MyCalculator::minus;
    Calculator c3 = MyCalculator::multiple;
    Calculator c4 = MyCalculator::divide;

    System.out.println(c1.compute(200, 17));
    System.out.println(c2.compute(200, 17));
    System.out.println(c3.compute(200, 17));
    System.out.println(c4.compute(200, 17));
  }
}
