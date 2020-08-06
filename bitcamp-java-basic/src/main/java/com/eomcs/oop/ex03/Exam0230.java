package com.eomcs.oop.ex03;
//인스턴스와 인스턴스 변수, 인스턴스 메서드 
public class Exam0230 {
  static class Calculator {
    int result;
    
    // 클래스의 모든 코드는 Method Area 영역에 로딩 된다.
    // 인스턴스 메서드가 Heap에 만들어지는 것이 아니다.
    
    public void plus(int value) {
      this.result += value;
    }
    
    public void minus(int value) {
      this.result += value;
    }
  }
  
  public static void main(String[] args) {
    Calculator c1 = new Calculator();
    Calculator c2 = new Calculator();
    
    // c1이 가리키는 인스턴스를 가지고 Method Area에 있는 plus를 호출한다.
    c1.plus(123);
    c2.minus(30);
  }
}
