package com.eomcs.oop.ex02.practice;

public class Exam0112 {
  static class Score {
    String name;
    int kor;
    int eng;
    int math;
    int sum;
    float aver;
  }
  public static void main(String[] args) {
    Score s = new Score();
    s.name = "monica";
    s.kor = 90;
    s.eng = 100;
    s.math = 90;
    computeScore(s);
    printScore(s);
  }
  
  static void computeScore(Score s) {
    s.sum = s.kor + s.eng + s.math;
    s.aver = s.sum / 3f;
  }
  
  static void printScore(Score s) {
    System.out.printf("%s: %d, %d, %d, %d, %.1f", s.name, s.kor, s.eng, s.math, s.sum, s.aver);
  }
}
 