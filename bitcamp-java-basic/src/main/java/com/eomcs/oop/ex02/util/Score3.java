package com.eomcs.oop.ex02.util;

// 바깥으로 클래스를 독립시킬 때는 static을 뗀다. (붙이면 문법적 오류임)
// 같은 패키지라면 public을 쓰지 않아도 된다.
// 다른 패키지라면 public을 써야 접근 가능하다.

public class Score3 {
  public String name;
  public int kor;
  public int eng;
  public int math;
  public int sum;
  public float aver; 

  public void compute() {
    this.sum = this.kor + this.eng + this.math;
    this.aver = this.sum / 3f;
  }
  
  // initialize: 초기화
  public void init(String name, int kor, int eng, int math) {
    this.name = name;
    this.kor = kor;
    this.eng = eng;
    this.math = math;
    
    this.compute();
  }
}