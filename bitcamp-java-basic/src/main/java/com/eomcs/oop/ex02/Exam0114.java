package com.eomcs.oop.ex02;

// 서로 관련된 건 묶어서 관리하자!!1
// 변수와 함수를 묶자.
// 같은 곳에 묶어두면 관리하기가 편하다 !!
// 과목을 하나 추가한다고 생각해보자 (science)
// c 같은 경우에는 여기까지 가능

public class Exam0114 {
  
  static class Score {
    String name;
    int kor;
    int eng;
    int math;
    int sum;
    float aver;
    
    static void computeScore(Score s) {
      s.sum = s.kor + s.eng + s.math;
      s.aver = s.sum / 3f;
    }
  }
  
  public static void main(String[] args) {
    
    Score s1;
    s1 = new Score();
    s1.name = "monica";
    s1.kor = 100;
    s1.eng = 90;
    s1.math = 87;
    Score.computeScore(s1);
    
    Score s2 = new Score();
    s2.name = "rosalia";
    s2.kor = 90;
    s2.eng = 100;
    s2.math = 100;
    Score.computeScore(s2);

    printScore(s1);
    System.out.println("-----------");
    printScore(s2);
  }
  
  static void printScore(Score s) {
    System.out.printf("%s: %d, %d, %d, %d, %.1f\n", s.name, s.kor, s.eng, s.math, s.sum, s.aver);
  }
  

  

}
