package com.eomcs.corelib.ex02.practice;

public class Exam0120 {
  public static void main(String[] args) {
    String s1 = new String("Hello");
    String s2 = new String("Hello");
    
    System.out.println(s1 == s2);
    System.out.println(s1.equals(s2));
  }
}

// equals()?
// - Object에 정의되어 있는 메서드이다.
// - 인스턴스가 같은지 비교한다.
//
// String의 equals()?
// - Object에서 상속 받은 것을 오버라이딩하였다.
// - 문자열이 같은지 비교한다.
//