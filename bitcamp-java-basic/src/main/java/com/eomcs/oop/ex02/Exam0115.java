package com.eomcs.oop.ex02;

// 

public class Exam0115 {
  
  static class Score {
    String name;
    int kor;
    int eng;
    int math;
    int sum;
    float aver; 
    // 얘는 변수가 아니라 변수를 만들라는 설계도이다.
    // new 했을 때 heap에 이거에 따른 변수들이 만들어지는 것
    // this.aver의 대상은 여기가 아니라 나중에 만들질 인스턴스의 변수 (heap)
    
    
    void compute() {
      this.sum = this.kor + this.eng + this.math;
      this.aver = this.sum / 3f;
      // this: 내장변수!!!!!!!! (로컬변수)
      // 우리가 만든 변수가 아니라 static 을 떼면 무조건 this가 생김
    }
  }
  
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
