package com.eomcs.oop.ex02.practice;

public class Exam0110 {
  public static void main(String[] args) {
    String name = "monica";
    int kor = 80;
    int eng = 100;
    int math = 95;
    int sum = kor + eng + math;
    float aver = sum / 3f;
    
    System.out.printf("%s: %d, %d, %d, %d, %.1f", name, kor, eng, math, sum, aver);
  }
}
 