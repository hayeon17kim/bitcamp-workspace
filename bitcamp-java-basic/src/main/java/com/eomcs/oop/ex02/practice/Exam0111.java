package com.eomcs.oop.ex02.practice;

public class Exam0111 {
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
    s.sum = s.kor + s.eng + s.math;
    s.aver = s.sum / 3f;
    System.out.printf("%s: %d, %d, %d, %d, %.1f", s.name, s.kor, s.eng, s.math, s.sum, s.aver);
  }
}
 