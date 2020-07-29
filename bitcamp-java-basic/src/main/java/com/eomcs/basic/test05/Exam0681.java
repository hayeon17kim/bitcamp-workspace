package com.eomcs.basic.test05;

public class Exam0681 {
  public static void main(String[] args) {
    int a = 5;
    int r = --a + --a / --a;
    System.out.printf("%d, %d", a, r);
  }
}
