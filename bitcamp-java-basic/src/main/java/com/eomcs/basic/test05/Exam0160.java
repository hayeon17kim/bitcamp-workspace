package com.eomcs.basic.test05;

//# 산술 연산자: 암시적 형변환과 연산 우선순

public class Exam0160 {
  public static void main(String[] args) {
    float r1 = 5 / 2 + 3.1f;
    System.out.println(r1); // 5.1
    
    float r2 = 3.1f + 5 / 2;
    System.out.println(r2); //5.1
  }
}
