package com.eomcs.oop.ex02;

import com.eomcs.oop.ex02.util.Score2;

public class Exam0118 {
  
  public static void main(String[] args) {
    
    Score2 s1;
    s1 = new Score2();
    s1.init("moinca", 90, 87, 100);
    s1.compute();
    
    Score2 s2 = new Score2();
    s2.init("rosalia", 90, 100, 100);
    s2.compute();

    printScore(s1);
    System.out.println("-----------");
    printScore(s2);
  }
  
  static void printScore(Score2 s) {
    System.out.printf("%s: %d, %d, %d, %d, %.1f\n", s.name, s.kor, s.eng, s.math, s.sum, s.aver);
    
  }
  

  

}
