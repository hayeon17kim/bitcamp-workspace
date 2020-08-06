package com.eomcs.oop.ex02;


public class Exam0111 {
  
  static class Score {
    String name;
    int kor;
    int eng;
    int math;
    int sum;
    float aver;
    // Score 메모리는 이러한 변수들로 구성된다.
  }
  public static void main(String[] args) {
    
    Score s1;
    // Score 클래스 설계도에 따라 heap에 만든 변수 목록: 인스턴스 => Score 클래스의 인스턴스 
    // 다양한 타입의 "연속된 변수 목록"을 만들 수 있다. 
    s1 = new Score();
    // Score 명령어를 사용하여 Heap 영역에 변수들을 구성하라. 
    // score 명령어에 따라 static이 안 붙은 변수들만 만든다. (static 변수는 따로 관리된다.)
    
    
    // s1인스턴스의 name항목에 "monica"를 집어넣어라.
    // s1객체의 name에 "monica"집어넣어라.
    // s1 레퍼런스가 가리키는 인스턴스
    // 저장된 주소로 찾아가서 해당 메모리(인스턴스) name에 넣
    // 낱개의 변수가 아니라 주소를 줘서 굉장히 편하다.
    s1.name = "monica";
    s1.kor = 100;
    s1.eng = 90;
    s1.math = 87;
    s1.sum = s1.kor + s1.eng + s1.math;
    s1.aver = s1.sum / 3f;
    // 하나의 덩어리로 구현
    // 덩어리로 구현하지 않으면 메서드에 메모리 주소를 전달할 수 없음
    
    printScore(s1);
  }
  
  static void printScore(Score s) {
    System.out.printf("%s: %d, %d, %d, %d, %.1f", s.name, s.kor, s.eng, s.math, s.sum, s.aver);
  }
}
