package com.eomcs.oop.ex02;


public class Exam0110 {
  public static void main(String[] args) {
    String name = "monica";
    int kor = 100;
    int eng = 90;
    int math = 87;
    int sum = kor + eng + math;
    float aver = sum / 3f;
    // 하나의 덩어리로 구현
    // 덩어리로 구현하지 않으면 메서드에 메모리 주소를 전달할 수 없음
    
    printScore(name, kor, eng, math, sum, aver);
  }
  
  static void printScore(String name, int kor, int eng, int math, int sum, float aver) {
    System.out.printf("%s: %d, %d, %d, %d, %.1f", name, kor, eng, math, sum, aver);
  }
}
