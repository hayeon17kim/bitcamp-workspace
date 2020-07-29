package com.eomcs.basic.test05;

public class Exam0650 {
  public static void main(String[] args) {
    int i = 2;
    
    ++i;    //3
    // i 메모리의 값을 먼저 증가시킨다.
    // 그리고 i 메모리의 값을 그 자리에 놓는다.
    
    ++i;    //4
    
    System.out.println(i);  //4
    System.out.println(++i);//5
    System.out.println(i);  //5
  }
}
