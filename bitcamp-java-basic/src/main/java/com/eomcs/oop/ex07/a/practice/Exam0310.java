package com.eomcs.oop.ex07.a.practice;

class Score3 {
  String name;
  
  private int kor;
  private int eng;
  private int math;
  
  public void setKor(int kor) {
    this.kor = kor;
    this.compute();
  }
  
  public int getKor() {
    return this.kor;
  }
  
  public void setEng(int eng) {
    this.eng = eng;
  }
  
  public int getEng() {
    return this.eng;
  }
  
  public void setMath(int math) {
    this.math = math;
  }
  
  public int getMath() {
    return this.math;
  }
  
  private int sum;
  private float aver;
  
  public int getSum() {
    return this.sum;
  }
  
  public float getAver() {
    return this.aver;
  }
  
  private void compute() {
    this.sum = this.kor + this.eng + this.math;
    this.aver = this.sum / 3f;
  }
}

public class Exam0310 {
  public static void main(String[] args) {
    Score3 s1 = new Score3();
    s1.name = "홍길동";
    s1.setKor(100);
    s1.setEng(90);
    s1.setMath(80);
    
    //s1.compute();
    
    s1.setEng(100);
    s1.setMath(100);
    
    System.out.printf("%s, %d, %d, %d, %d, %.1f",
        s1.name, s1.getKor(), s1.getEng(), s1.getMath(),
        s1.getSum(), s1.getAver());
  }
}
