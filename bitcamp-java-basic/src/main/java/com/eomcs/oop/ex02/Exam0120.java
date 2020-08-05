package com.eomcs.oop.ex02;

public class Exam0120 {
  static class Score {
    String name;
    int kor;
    int eng;
    int math;
    int sum;
    float average;
    
    // 메서드를 이용하여 이 타입의 데이터를 다룰 수 있는 연산자를 정의한다.
    // - 사용자 정의 데이터 타입 입장에서는 메서드가 연산자 역할을 한다.
    // - 즉 사용자 정의 데이터 타입에 메서드를 정의하는 것은
    //   그 데이터를 다룰 연산자를 정의하는 것이다.
    
    // Score 데이터 값을 다룰 수 있는 새 연산자를 정의해 보자.
    // - 다음 메서드는 Score 객체의 국,영,수 값의 합계와 평균을 계산하는 연산자이다.
    public static void calculate(Score score) {
      score.sum = score.kor + score.eng + score.math;
      score.average = score.sum / 3f;
    }
    
    public static void main(String[] args) {
      Score s = new Score();
      s.name = "monica";
      s.kor = 70;
      s.eng = 100;
      s.math = 95;
      
      // 다음은 Score의 값을 다루는 연산자가 없을 때의 예이다.
      // score.sum = score.kor + score.eng + score.math; 
      // score.average = score.sum / 3f;
      Score.calculate(s);
      System.out.printf("%s, %d, %d, %d, %d, %.1f\n", s.name, s.kor, s.eng, s.math, s.sum, s.average);
    }
  }
}
