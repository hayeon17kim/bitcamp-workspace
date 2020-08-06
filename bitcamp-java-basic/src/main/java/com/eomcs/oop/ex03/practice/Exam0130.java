package com.eomcs.oop.ex03.practice;

public class Exam0130 {
  // static field - class variable
  static class A {
    static int v1;
    static boolean v2;
    
  }
  // 메서드 안에 있는 변수는 스태틱 변수가 될 수 없어서 메인에서 뺐다.
  
  public static void main(String[] args) {
    // 스태틱 변수 
    
    A obj1 = new A(); 
    A obj2 = new A(); 
    
    
    // 레퍼런스.변수명 = 100;
    // - 레퍼런스 다음에 지정한 변수가 인스턴스 변수가 아니라 
    //   클래스 변수라면 컴파일러가 컴파일 하는 과정에 정확하게
    //   클래스 변수를 가리키도록 기계어로 바꾼다.
    // - 즉 개발자가 레퍼런스를 통해 클래스 변수를 지정하더라도
    //   컴파일러가 클래스 변수로 인식하여 클래스 변수를 사용하는 코드로 변환한다.
    
    obj1.v1 = 100; // => A.v1 = 100; // 이렇게 하지 말라고
    obj2.v1 = 200; // => A.v1 = 200;// 이렇게 하지 말라고
    
    System.out.println(obj1.v1);
    System.out.println(obj2.v1);
    
  }
}
