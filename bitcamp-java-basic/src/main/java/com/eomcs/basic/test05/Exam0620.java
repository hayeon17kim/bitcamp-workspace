package com.eomcs.basic.test05;

//# 증감 연산자 : 후위(post-fix) 감소 연산자
//
public class Exam0620 {
  public static void main(String[] args) {
    int i = 7;
    
    i--;
    
    i--;
    
    System.out.println(i);      //5
    
    System.out.println(i--);    //5
    // 1) System.out.println(5); // 현재 i메모리에 들어 있는 값을 놓기
    // 2) i = i - 1              // i 메모리의 값을 1 감소시키기
    
    System.out.println(i);      //4
  }
}
