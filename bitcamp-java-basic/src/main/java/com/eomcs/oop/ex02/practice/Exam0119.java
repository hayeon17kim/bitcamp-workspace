package com.eomcs.oop.ex02.practice;
import com.eomcs.oop.ex02.practice.util.Score4;

public class Exam0119 {
  public static void main(String[] args) {
    Score4 s1 = new Score4("monica", 90, 98, 97);
    printScore(s1);
    
    System.out.println("--------------------------------");
    
    Score4 s2 = new Score4("rosalia", 90, 98, 97);
    printScore(s2);
  }
  static void printScore(Score4 s) {
    System.out.printf("%s: %d, %d, %d, %d, %.1f\n", s.name, s.kor, s.eng, s.math, s.sum, s.aver);
  }
}