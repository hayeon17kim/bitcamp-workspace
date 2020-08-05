package com.eomcs.oop.ex02;


//# 관련된 기능(메서드)을 묶어 분류하기 : 분류 전

public class Exam0210 {

  
  public static void main(String[] args) {
    // 다음 식을 연산자 우선 순위를 고려하지 않고 순서대로 계산하라!
    // 2 + 3 - 1 * 7 / 3 = ?
    
    // 계산 결과를 담을 변수를 준비한다.
    int result = 0;
    
    result = plus(2, 3);
    result = minus(result, 1);
    result = multiple(result, 7);
    result = divide(result, 3);
    
    System.out.printf("result = %d", result);
  }
  
  static int plus(int a, int b) {
    return a + b;
  }
  static int minus(int a, int b) {
    return a - b;
  }
  
  static int multiple(int a, int b) {
    return a * b;
  }
  
  static int divide(int a, int b) {
    return a / b;
  }
  
}
