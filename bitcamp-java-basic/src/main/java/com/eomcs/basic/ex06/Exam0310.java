package com.eomcs.basic.ex06;

//# 흐름 제어문 - 반복문 while

public class Exam0310 {
  public static void main(String[] args) {
    int count = 0;

    // 문법1:
    // while (조건) 문장;
    while (count < 5) System.out.println(count++);

    System.out.println("------------------");

    // 문법2:
    // while (조건)
    //      문장;
    count = 0;
    while (count < 5)
      System.out.println(count++);

    System.out.println("------------------");

    // 문법3:
    // while (조건) {}
    count = 0;
    while (count < 5){
      System.out.println(count);
      count++;
    }

  }
}
