package com.eomcs.oop.ex02;

import com.eomcs.oop.ex02.util.Score4;

// new로 인스턴스 생성하여 선언할 때 초기화할 수 없을까?
// 

public class Exam0119 {
  
  public static void main(String[] args) {
    
    Score4 s1;
    s1 = new Score4("moinca", 90, 87, 100);
    
    Score4 s2 = new Score4("rosalia", 90, 100, 100);

    printScore(s1);
    System.out.println("-----------");
    printScore(s2);
  }
  
  static void printScore(Score4 s) {
    System.out.printf("%s: %d, %d, %d, %d, %.1f\n", s.name, s.kor, s.eng, s.math, s.sum, s.aver);
    
  }
  

  

}
