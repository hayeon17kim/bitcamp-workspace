package com.eomcs.oop.ex02;


//# 관련된 기능(메서드)을 묶어 분류하기 - 패키지와 클래스
//
public class Exam0280 {
  // Calculator 클래스를 향후 유지보수하기 쉽도록 별도의 패키지로 분류한다.
  // - com.eomcs.util 패키지를 만들어 분류한다.
  // - import 를 이용하여 클래스의 패키지 정보를 지정한다.
  
  public static void main(String[] args) {
    // 다음 두 개의 식을 분리하여 계산해 보자!
    // - 연산자 우선 순위를 고려하지 않고 순서대로 계산하라!
    // 식1) 2 + 3 - 1 * 7 / 3 = ?
    // 식2) 3 * 2 + 7 / 4 - 5 = ?

    Calculator c1 = new Calculator();
    Calculator c2 = new Calculator();
    
    // 계산을 수행할 때 계산 결과를 보관할 메모리를 메서드 호출 앞에서 전달하라!
    // - 인스턴스 메서드를 사용하면 파라미터로 메모리 주소를 전달할 필요가 없다.
    c1.plus(2);
    c2.plus(3);
    
    c1.plus(3);
    c2.multiple(2);
    
    c1.minus(1);
    c2.plus(7); 
    
    c1.multiple(7);
    c2.divide(4);
    
    c1.divide(3);
    c2.minus(5);

    // 식1의 계산 결과는 c1 인스턴스의 result 변수에 들어 있고,
    // 식2의 계산 결과는 c2 인스턴스의 result 변수에 들어 있다.
    System.out.printf("c1.result = %d\n", c1.result);
    System.out.printf("c2.result = %d\n", c2.result);
  }
  

  
}