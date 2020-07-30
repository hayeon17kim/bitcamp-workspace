package com.eomcs.basic.ex06;

public class Exam0340 {
  public static void main(String[] args) {
    int i = 0;

    // 1부터 10까지 출력하기
    do
      System.out.println(++i);
    while(i < 10);

    do {
      i += 1;
      System.out.println(i);
    } while(i < 10);


  }
}
