package com.eomcs.basic.ex07;

public class Exam0230 {
  static String hello() {
    return "안녕하세요!"; // 리턴 명령을 실행하면 매서드 실행을 종료한다.
  }
  
  public static void main(String[] args) {
    String r = hello();
    System.out.println(r);
    
    hello();
    
    //int r2 = hello();
    }
}
