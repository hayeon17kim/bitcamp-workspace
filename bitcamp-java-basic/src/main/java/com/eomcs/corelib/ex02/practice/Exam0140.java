package com.eomcs.corelib.ex02.practice;

public class Exam0140 {
  public static void main(String[] args) {
    String s1 = new String("Hello");
    String s2 = s1.toString();
    
    System.out.println(s1 == s2);
    System.out.println(s1);
    
    // Object.toString()은 "클래스명@해시값" 을 리턴한다.
    // String은 상속 받은 toString()을 오버라이딩 했다.
    // => this 주소를 그대로 리턴한다.
  }
}
