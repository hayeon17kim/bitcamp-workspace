package com.eomcs.oop.ex07.a.practice;

public class Exam0111 {
  public static void main(String[] args) {
    
    Score s1 = new Score();
    
    s1.name = "홍길동";
    s1.kor = 100;
    s1.eng = 90;
    s1.math = 80;
    s1.compute();
    
    s1.sum = 300;
    s1.aver = 100f;
    
    System.out.printf("%s, %d, %d, %d, %d, %.1f\n",
        s1.name, s1.kor, s1.eng, s1.math, s1.sum, s1.aver);
  }
}
