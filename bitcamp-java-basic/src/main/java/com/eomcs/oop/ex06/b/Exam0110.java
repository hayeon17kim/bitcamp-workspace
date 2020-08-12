package com.eomcs.oop.ex06.b;

public class Exam0110 {
  static class Calculator {
    static int plusi (int a, int b) {
      return a + b;
    }
    
    static int plusi2 (int a) {
      return a + a;
    }
    
    static float plusf (float a, float b) {
      return a + b;
    }
  }
  
  public static void main(String[] args) {
    int r1 = Calculator.plusi(200, 100);
    int r2 = Calculator.plusi2(100);
    float r3 = Calculator.plusf(35.7f, 22.2f);
    System.out.printf("%d, %d, %.1f\n", r1, r2, r3);
  }
}
