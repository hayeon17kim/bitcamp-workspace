// 제네릭(Generic) 문법 정리 - 제네릭 파라미터 
package com.eomcs.generic.ex01;

import java.util.ArrayList;
import java.util.HashSet;

public class Exam0220 {
  
  static class A {}
  static class B1 extends A {}
  static class B2 extends A {}
  static class C extends B1 {}
  /*
   *   Object
   *     |
   *     A
   *    / \
   *   B1 B2
   *   |
   *   C
   */
  
  public static void main(String[] args) {
    // m1(ArrayList)
    // => 제네릭의 타입을 지정하지 않으면,
    //    다음과 같이 다양한 종류의 ArrayList를 파라미터로 넘길 수 있다.
    //    그런데 이렇게 하지 말라고.. 흐리멍텅하게 쓰면 우리의 의도가 무용지물이 된다.
    //    new에서 지정해줘도 무용지물. 다 저장됨.
    
    // ArrayList클래스가 바뀌는 게 아니다! 레퍼런스가 실제 정하는 것임
    
    //m1(new ArrayList<A>());
    //m1(new ArrayList<A>());
    m1(new ArrayList<B1>()); // 레퍼런스에서 제약을 안 걸면 제약이 무용지물이 된다. 
    //m1(new ArrayList<B2>());
    //m1(new ArrayList<C>());
    System.out.println("실행 완료");
  }
  
  
  // 지정을 안한 상태
  // 레퍼런스에서 제약을 안 걸면 New할 때 건 제약이 무용지물이 된다.
  
  // 제네릭의 타입을 지정하지 않으면 
  // 위와 같이 특정 타입으로 제한하는 문법이 무용지물이 된다.
  // 따라서 제네릭으로 선언된 클래스를 사용할 때는 반드시 타입 파라미터 값을 지정하라!
  // => 제네릭 문법의 목적은 코드 안정성을 추구하는 것이다.
  // => 원하는 타입이 아닌 다른 타입의 값을 지정하는 오류(타입 오류)를 줄이기 위해 만든 문법이다. 
  // => 제네릭 문법의 대상은 컴파일러다. (JVM이 아니라 컴파일러)
  // => 즉 컴파일 단계에서 최대한으로 타입 오류를 잡아내는 것이 목적이다.
  
  static void m1(ArrayList<B1> list) {
    //list.add(new Object());
    //list.add(new A());
    list.add(new B1());
    //list.add(new B2());
    list.add(new C());
    
    System.out.println(list.get(0));
    System.out.println(list.get(1));
    System.out.println(list.get(2));
    System.out.println(list.get(3));
    System.out.println(list.get(4));
  }
}







