package com.eomcs.basic.ex07.practice;



// Stack과 Heap 메모리 영역
//
public class Exam0415 {
  
  public static void main(String[] args) throws Exception {
    int result = 1;
    int n = 5;
    
    for (int i = 2; i <= n; i++) {
      result *= i;
    }
    System.out.println(result);
    
    System.out.println("------");
    
    result = factorial(5);
    // result = 5 * factorial(4);
    // result = 5 * 4 * factorial(3)
    // result = 5 * 4 * 3 * factorial(2);
    // result = 5 * 4 * 3 * 2 * factorial(1);
    // result = 5 * 4 * 3 * 2 * 1;
    System.out.println(result);
  }
  
  static int factorial(int n) {
    if (n == 1)
      return 1;
    return n * factorial(n-1);
  }
  // 재귀호출: 수학공식을 그대로 옮길 수 있어서 간단하고 직관적
  // stack메모리를 많이 잡아먹고 실행속도가 느려진다.
  // 실행속도를 높이려면 반복문을 쓰고
  // 실행속도를 생각하지 않으면 재귀호출만큼 간단한 게 없음
}
