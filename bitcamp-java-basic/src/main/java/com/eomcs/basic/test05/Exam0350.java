package com.eomcs.basic.test05;

//# 비트 연산자(&, |, ^, ~)
//
public class Exam0350 {
  public static void main(String[] args) {
    int a = 0b0110_1100;
    int b = 0b0101_0101;
    // 정수 값에 대해서는 &&와 ||, !을 사용할 수 없다.
    
    System.out.println(a & b);
    System.out.println(a | b);
    System.out.println(a ^ b);
    System.out.println(~a);
    
  }
}
