package com.eomcs.basic.test05;

public class Exam0672 {
  public static void main(String[] args) {
    int i = 2;
    i = ++i;
    // 1) i = i + 1 => i = 3이다.
    // 2) i = 3 => i는 이미 3인데 또 3을 넣는다. 부질 없는 짓!
    System.out.println(i);
  }
}
