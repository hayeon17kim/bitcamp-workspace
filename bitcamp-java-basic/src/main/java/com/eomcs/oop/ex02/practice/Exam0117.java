package com.eomcs.oop.ex02.practice;
import com.eomcs.oop.ex02.practice.util.Score2;

public class Exam0117 {
  public static void main(String[] args) {
    Score2 s1 = new Score2();
    s1.init("monica", 90, 98, 97);
    s1.compute();
    printScore(s1);
    
    System.out.println("--------------------------------");
    
    Score2 s2 = new Score2();
    s1.init("rosalia", 90, 98, 97);
    s2.compute();
    printScore(s2);
  }
  static void printScore(Score2 s) {
    System.out.printf("%s: %d, %d, %d, %d, %.1f\n", s.name, s.kor, s.eng, s.math, s.sum, s.aver);
  }

}
 