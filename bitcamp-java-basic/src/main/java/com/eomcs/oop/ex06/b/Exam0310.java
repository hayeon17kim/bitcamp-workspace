package com.eomcs.oop.ex06.b;

public class Exam0310 {
  public static void main(String[] args) {
    System.out.println(100);
    System.out.println(true);
    System.out.println("Hello");
    
    // 외부에서 값을 받아 Integer 객체를 생성하는 메서드들
    Integer obj1 = Integer.valueOf(100);
    Integer obj2 = Integer.valueOf("100");
    Integer obj3 = Integer.valueOf("64", 16);
    
    System.out.printf("%d, %d, %d\n", obj1, obj2. obj3);
  }
}
