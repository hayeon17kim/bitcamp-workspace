package com.eomcs.oop.ex03;

public class Exam0150 {
  static class Student {
    
    // 클래스 필드 = 스태틱 필드
    // - 모든 인스턴스가 공유하는 값을 저장할 때는 클래스 변수를 사용한다.
    static int count;
    
    // 인스턴스 필드
    // - 인스턴스마다 개별적으로 관리해야 할 값은 인스턴스 변수에 저장한다.
    String name;
    int age;
  }
  
  public static void main(String[] args) {
    
  }
}
