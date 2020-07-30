package com.eomcs.basic.ex06;

//# 흐름 제어문 - for 반복문
public class Exam0413 {
  public static void main(String[] args) {
    // 조건문 제거
    int i = 1;
    for (;;) {
      if (i > 5)
        break;
      System.out.println(i);
    }
  }
}
