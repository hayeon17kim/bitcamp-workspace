package com.eomcs.oop.ex02;

import com.eomcs.oop.ex02.util.Score;

public class Exam0116 {
  
  public static void main(String[] args) {
    
    Score s1;
    s1 = new Score();
    s1.name = "monica";
    s1.kor = 100;
    s1.eng = 90;
    s1.math = 87;
    //반드시 인스턴스 주소를 줘야 한다. (s1)
    s1.compute();
    
    Score s2 = new Score();
    s2.name = "rosalia";
    s2.kor = 90;
    s2.eng = 100;
    s2.math = 100;
    s2.compute();

    printScore(s1);
    System.out.println("-----------");
    printScore(s2);
  }
  
  static void printScore(Score s) {
    System.out.printf("%s: %d, %d, %d, %d, %.1f\n", s.name, s.kor, s.eng, s.math, s.sum, s.aver);
    
    // 어떻게 출력할 지 알 수가 없음.
    // score는 이렇게 출력한다는 고정 기능이 아니기 때문에
    // 상황에 따라 달라짐 (console은 이렇게 출력하지만 web page에는 다르게 할 수 있음)
  }
  

  

}
