package com.eomcs.oop.ex02.practice;
import com.eomcs.oop.ex02.practice.util.Score3;

public class Exam0118 {
  public static void main(String[] args) {
    Score3 s1 = new Score3();
    s1.init("monica", 90, 98, 97);
    printScore(s1);
    
    System.out.println("--------------------------------");
    
    Score3 s2 = new Score3();
    s2.init("rosalia", 90, 98, 97);
    printScore(s2);
  }
  static void printScore(Score3 s) {
    System.out.printf("%s: %d, %d, %d, %d, %.1f\n", s.name, s.kor, s.eng, s.math, s.sum, s.aver);
  }
}