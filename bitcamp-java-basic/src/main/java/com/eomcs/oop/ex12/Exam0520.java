package com.eomcs.oop.ex12;

public class Exam0520 {
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

  interface Calculator {
    int compute(int a, int b);
  }

  public static void main(String[] args) {
    Calculator c1 = MyCalculator::plus;
    // 위의 코드는 다음 코드와 같
    Calculator xx = new Calculator() {
      @Override
      public int compute(int a, int b) {
        return MyCalculator.plus(a, b);
      }
    };

    System.out.println(c1.compute(200, 17));
  }
}
