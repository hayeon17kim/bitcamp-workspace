package com.eomcs.corelib.ex02.practice;

public class Exam0110 {
  public static void main(String[] args) {
    String s1;
    // String 인스턴스
    // - 힙에 Hello 문자 코드를 저장할 메모리를 만들고 그 주소를 리턴한다.
    // - 내용물의 동일 여부를 검사하지 않고 무조건 인스턴스를 생성한다.
    // - 가비지가 되면 가비지 컬렉터에 의해 제거된다.
    
    s1 = new String("Hello");
    String s2 = new String("Hello");
    
    System.out.println(s1 == s2);
  }
}
