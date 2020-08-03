package com.eomcs.basic.ex07;

import java.util.Arrays;

public class Exam0210 {
  static void hello() {
    System.out.println("안녕하세요!");
    System.out.println("이 메서드는 어떤 값도 리턴하지 않습니다.");
  }
  
  public static void main(String[] args) {
    hello();
    System.out.println("hello() 실행 완료");
    
    int i;
    // i = hello(); //컴파일 오류!
  }
}

// 매서드 시그니처: 메서드명, 파라미터 리스트 선언