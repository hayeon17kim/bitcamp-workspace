// 제네릭(Generic) 문법 정리 - 제네릭 파라미터 
package com.eomcs.generic.ex01.practice;

import java.util.ArrayList;

public class Exam0223 {

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
    // m1(ArrayList<B1>)
    // => B1 타입에 대해서만 ArrayList 객체를 파라미터로 넘길 수 있다.
    // => B1의 하위 타입은 불가능
    //
    
    ArrayList list = new ArrayList();
    list.add(new B1());
    list.add(new String());
    list.add(new java.util.Date());
    
    m1(list);
    
  }

  static void m1(ArrayList<B1> list) {
    // 컴파일러는 파라미터로 넘어온 ArrayList가  어떤 타입이든 간에 
    // 문법적으로 B1 타입의 값만 다룬다.

    //list.add(new Object());
    list.add(new B1());
    list.add(new C());
    
    //list에 B1 타입이 아닌 다른 타입을 저장할 때는 아무런 문제가 발생하지 않지만,
    // ArrayList에서 값을 꺼낼 때 메서드에서 지정한 <B1> 타입이 아니면 ClassCastException발생!
    for(int i =0; i < list.size(); i++) {
      B1 temp = list.get(i);
      System.out.println(temp);
    }
  }
}








