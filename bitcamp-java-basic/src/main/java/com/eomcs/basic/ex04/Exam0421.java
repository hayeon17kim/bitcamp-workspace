package com.eomcs.basic.ex04;

// # 부동소수점 변수 - 변수의 메모리 크기

public class Exam0421 {
  public static void main(String[] args) {
    
    float f;
    
    f = 9.876545f;
    System.out.println(f);  //9.876545
    
    f = 987654.5f;
    System.out.println(f);  //987654.5
    
    f = 0.000009876545f;
    System.out.println(f);  //9.876545E-6
    
    f = 9.8765456f;
    System.out.println(f);  //9.876546  //맨 뒤의 값이 반올림된다.
    
    f = 9876545.6f;
    System.out.println(f);  //9876546.0 //맨 뒤의 값이 반올림 된다.
  }
}
