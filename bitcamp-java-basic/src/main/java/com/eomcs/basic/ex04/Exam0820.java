package com.eomcs.basic.ex04;

// # 로컬 변수와 블록

public class Exam0820 {
  public static void main(String[] args) {
    
    int a = 100;
    
    {
      //int a = 200; // 컴파일 오류!
      // 매서드 안에서는 변수 이름 중복 불가!
      // 안쪽 블록에서는 바깥 블록의 변수를 사용할 수 있다.
      a = 200;
      
      int b = 300;
      // 이 블록의 실행을 끝내는 순간
      // 이 블록에서 선언된 모든 변수는 제거된다.
      // 그래서 b 변수는 제거된다.
    }
    System.out.println(a);
    
    //System.out.println(b); // 컴파일 오류!
    {
      int b = 400;
    }
  }
}
