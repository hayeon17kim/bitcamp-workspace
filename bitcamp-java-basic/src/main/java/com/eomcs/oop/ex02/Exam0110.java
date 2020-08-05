package com.eomcs.oop.ex02;

//# 사용자 정의 데이터 타입
//
public class Exam0110 {
  //# 사용자 정의 데이터 타입 만들기
  //- 인스턴스 변수를 사용하여 학생의 성적 데이터를 담을 메모리를 설계한다.
  
  static class Score {
    // 인스턴스 변수
    // - new 명령으로 생성되는 변수이다.
    // - 데이터를 개별적으로 다루고 싶을 때 인스턴스 변수로 선언한다.
    String name;
    int kor;
    int eng;
    int math;
    int sum;
    float average;
    
    public static void main(String[] args) {
      Score score = new Score();
      
      score.name = "홍길동";
      score.kor = 100;
      score.eng = 90;
      score.math = 85;
      score.sum = score.kor + score.eng + score.math;
      score.average = score.sum /3f;
      
      System.out.printf("%s, %d, %d, %d, %d, %.1f\n", score.name, score.kor, score.eng, score.math,
          score.sum, score.average);
    }
  }
}
// 클래스 문법의 용도
// 1) 사용자 정의 데이터 타입 만들 때
//    즉 새로운 구조의 메모리를 설계할 때 사용한다.
// 2) 메서드를 묶을 때
//    서로 관련된 기능을 관리하기 쉽게 묶고 싶을 때 사용한다.
