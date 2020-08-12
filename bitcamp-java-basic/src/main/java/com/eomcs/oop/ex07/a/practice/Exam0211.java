package com.eomcs.oop.ex07.a.practice;

public class Exam0211 {
  public static void main(String[] args) {
    Score2 s1 = new Score2();
    
    s1.name = "홍길동";
    s1.kor = 100;
    s1.eng = 90;
    s1.math = 80;
    
    s1.compute();
    
    s1.eng = 100;
    s1.math = 100;
    
    System.out.printf("%s, %d, %d, %d, %d, %.1f\n",
        s1.name, s1.kor, s1.eng, s1.math, s1.getSum(), s1.getAver());
  }
}
