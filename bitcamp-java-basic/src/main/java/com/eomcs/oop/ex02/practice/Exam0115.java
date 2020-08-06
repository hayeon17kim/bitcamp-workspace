package com.eomcs.oop.ex02.practice;

public class Exam0115 {
  static class Score {
    
    String name;
    int kor;
    int eng;
    int math;
    int sum;
    float aver;
    
    void compute() {
      this.sum = this.kor + this.eng + this.math;
      this.aver = this.sum / 3f;
    }
    
  }
  public static void main(String[] args) {
    Score s1 = new Score();
    s1.name = "monica";
    s1.kor = 80;
    s1.eng = 100;
    s1.math = 95;
    s1.compute();
    printScore(s1);
    
    System.out.println("--------------------------------");
    
    Score s2 = new Score();
    s2.name = "rosalia";
    s2.kor = 79;
    s2.eng = 90;
    s2.math = 100;
    s2.compute();
    printScore(s2);
  }
  static void printScore(Score s) {
    System.out.printf("%s: %d, %d, %d, %d, %.1f\n", s.name, s.kor, s.eng, s.math, s.sum, s.aver);
  }

}
 