package com.eomcs.oop.ex02;

class Calculator {
  int result = 0;
  
  void plus(int value) {
  // 인스턴스 메서드는 인스턴스의 주소를 this라는 내장 변수에 자동으로 받는다.
    this.result += value;
  }
  
  void minus(int value) {
    this.result -= value;
    
  }
  
  void multiple(int value) {
    this.result *= value;
  }
  
  void divide(int value) {
    this.result /= value;
  }
  
  // 인스턴스를 사용하지 않는 메서드라면 그냥 클래스 메서드로 두어라.
  static int abs(int a) {
    return a >= 0 ? a : a * -1;
  }
  
}