package com.eomcs.basic.test05;

//# 산술 연산자 : 우선 순위
//
public class Exam0120 {
  public static void main(String[] args) {
    // *, /, %는 +, - 보다 먼저 계산된다.
    System.out.println(2 + 3 * 7);
    System.out.println(3 * 7 + 2);
    
    System.out.println(3 * 8 / 2);
    System.out.println(8 / 2 * 3);
    
    System.out.println((2 + 3) * 7);
  }
}
