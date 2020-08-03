package com.eomcs.basic.ex07;

public class Exam0260 {
  
  // 가변 파라미터
  static void hello(String... names) {
    for (int i = 0; i < names.length; i++) {
      System.out.printf("%s님 반갑습니다.\n", names[i]);
    }
  }
  
  static void hello2(String[] names) {
    for (int i = 0; i < names.length; i++) {
      System.out.printf("%s님 반갑습니다.\n", names[i]);
    }
  }
  
  public static void main(String[] args) {
    hello("juan", "jose", "maria");
    System.out.println("----------");
    
    String[] arr = {"juliana", "julio", "nairobi"};
    hello(arr);
    System.out.println("----------");
    
    // 배열 파라미터의 매서드 호출 
    // 오직 배열에 담아서 전달
    
    //hello2("maria", "lucia", "monica");
    String[] arr2 = {"maria", "lucia", "monica"};
    hello2(arr2);
    System.out.println("----------");
  }
}
