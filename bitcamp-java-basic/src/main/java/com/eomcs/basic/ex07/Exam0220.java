package com.eomcs.basic.ex07;

public class Exam0220 {
  static void hello(String name, int age) {
    System.out.printf("%d살 %s님 반갑습니다.\n", age, name);
  }
  
  public static void main(String[] args) {
    System.out.println("main()11111");
    
    hello("홍길동", 20);
    
    System.out.println("main()22222");
    
    hello("임꺽정", 30);
    
    System.out.println("main()33333");
    
    hello("유관순", 16);
    
    System.out.println("main()44444");
    
  }
}
