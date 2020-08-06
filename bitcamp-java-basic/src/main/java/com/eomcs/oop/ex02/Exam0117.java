package com.eomcs.oop.ex02;

import com.eomcs.oop.ex02.util.Score3;

public class Exam0117 {
  
  public static void main(String[] args) {
    
    Score3 s1;
    s1 = new Score3();
    s1.init("moinca", 90, 87, 100);
    
    Score3 s2 = new Score3();
    s2.init("rosalia", 90, 100, 100);

    printScore(s1);
    System.out.println("-----------");
    printScore(s2);
    
    s1.kor = 50;
    s1.compute();
    System.out.println("-----------");
    printScore(s1);
  }
  
  static void printScore(Score3 s) {
    System.out.printf("%s: %d, %d, %d, %d, %.1f\n", s.name, s.kor, s.eng, s.math, s.sum, s.aver);
    
  }
  

  

}
