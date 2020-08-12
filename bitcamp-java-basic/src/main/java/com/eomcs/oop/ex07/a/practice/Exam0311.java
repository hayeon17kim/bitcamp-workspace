package com.eomcs.oop.ex07.a.practice;

class Score4 {
  private String name;
  private int kor;
  private int eng;
  private int math;
  private int sum;
  private float aver;
  
  public void setName(String name) {
    this.name = name;
  }
  
  public String getName() {
    return this.name;
  }
  
  public void setKor(int kor) {
    this.kor = kor;
    compute();
  }
  public int getKor() {
    return this.kor;
  }
  
  public void setEng(int eng) {
    this.eng = eng;
    compute();
  }
  
  public int getEng() {
    return this.eng;
  }
  
  public void setMath(int math) {
    this.math = math;
    compute();
  }
  
  public int getMath() {
    return this.math;
  }
  
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

public class Exam0311 {
  public static void main(String[] args) {
    Score4 s1 = new Score4();
    
    s1.setName("monica");
    s1.setKor(85);
    s1.setEng(100);
    s1.setMath(95);
    
    System.out.printf("%s, %d, %d, %d, %d, %f",
        s1.getName(), s1.getKor(), s1.getEng(), s1.getMath(),
        s1.getSum(), s1.getAver());
  }
}
