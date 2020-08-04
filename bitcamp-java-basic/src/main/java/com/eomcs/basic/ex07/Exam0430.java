package com.eomcs.basic.ex07;

//# 매서드: 인스턴스와 Heap 메모리 영역
//
public class Exam0430 {
  static class MyObject {
    int a;
    int b;
  }
  
  static MyObject getMyObject() {
    MyObject ref = new MyObject();
    ref.a = 100;
    ref.b = 200;
    
    return ref;
  }
  
  public static void main(String[] args) {
    MyObject ref;
    ref = getMyObject();
    System.out.println(ref.a);
    System.out.println(ref.b);
  }
}

// 1) main() 호출
//  => JVM Stack:args, ref 변수 생성 
// 2) getMyObject()