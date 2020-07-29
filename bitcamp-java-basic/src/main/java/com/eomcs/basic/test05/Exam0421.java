package com.eomcs.basic.test05;

//# 비트 이동 연산자: >>, >>>, <<

public class Exam0421 {
  public static void main(String[] args) {
    // 음수일 경우,
    // 빈자리는 1로 채운다.
    int i = 0b11111111_11111111_11111111_10101001; // -87
    
    System.out.println(i);
    
    System.out.println(i >> 1); // -44
    
    System.out.println(i >> 2); // -22
    
    System.out.println(i >> 3); // -11
    
    System.out.println(i >> 4); // -6

  }
}
