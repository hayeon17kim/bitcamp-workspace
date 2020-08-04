package com.eomcs.basic.ex07;

//# 매서드 : call by value

public class Exam0310 {
  static void swap(int a, int b) {
    System.out.printf("swap(): a=%d, b=%d\n", a, b);
    int temp = a;
    a = b;
    b = temp;
    System.out.printf("swap(): a=%d, b=%d\n", a, b);
  }
  
  public static void main(String[] args) {
    int a = 100;
    int b = 200;
    
    swap(a, b);
    System.out.printf("main(): a=%d, b=%d", a, b);
  }
}

// call by value
// => 아규먼트가 primitive data type인 경우,
//    메서드를 호출할 때 값을 넘긴다.
// => 자바에서는 primitive data type에 대해서
//    메모리(변수) 주소를 넘기는 방법이 없다. 
