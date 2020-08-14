package com.eomcs.corelib.ex02.practice;

public class Exam0111 {
  public static void main(String[] args) {
    //문자열 리터럴
    // - string constant pool 메모리 영역에 String 인스턴스를 생성한다.
    // - 내용물이 같으면 기존 인스턴스의 주소를 리턴한다.
    // - 즉 메모리 절약을 위해 중복 데이터를 갖는 인스턴스를 생성하지 않는다.
    // - JVM이 끝날 때까지 메모리에 유지된다.
    //
    String x1 = "Hello";
    String x2 = "Hello";
    System.out.println(x1 == x2);
  }
}
