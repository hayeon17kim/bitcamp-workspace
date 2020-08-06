package com.eomcs.oop.ex02.util;

// 인스턴스를 생성할 때 호출되는 메서드
// 생성자 

public class Score4 {
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
  
  // 리턴 타입을 없앰
  // 생성자의 이름은 클래스의 이름과 같게 
  public Score4(String name, int kor, int eng, int math) {
    this.name = name;
    this.kor = kor;
    this.eng = eng;
    this.math = math;
    
    this.compute();
  }
  
}