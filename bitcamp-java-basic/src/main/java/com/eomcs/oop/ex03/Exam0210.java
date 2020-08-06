package com.eomcs.oop.ex03;

//인스턴스 메서드와 클래스 메서드 

public class Exam0210 {
  static class A {
    static void m1() {
      System.out.println("m1()");
    }
    
    void m2() {
      System.out.println("m2()");
    }
  }
  
  public static void main(String[] args) {
    // 클래스 메서드 호출
    A.m1();
    //A.m2();
    
    A obj1 = new A();
    
    obj1.m1(); //할 순 있는데, 이렇게 하지 말기
    obj1.m2();
    
    A obj2 = null;
    obj2.m2(); // 컴파일O, 실행X
    //null pointer access 
    // obj2 변수에 들어 있는 인스턴스 주소가 무효하기 때문이다.
    
  }
}

// 일단 인스턴스 메서드로 무조건 만들고
// 인스턴스 변수를 완전히 사용하지 않음을 확신하면
// 그때 클래스로 전환
