package com.eomcs.basic.test05;

//# 논리 연산자 : || vs |
public class Exam0340 {
  public static void main(String[] args) {
    boolean a = true;
    boolean b = false;
    boolean r = a || (b = true);
    System.out.printf("a=%b, b=%b, r=%b\n", a, b, r);
    
    a = true;
    b = false;
    r = a | (b = true);
    System.out.printf("a=%b, b=%b, r=%b\n", a, b, r);
  }
}
