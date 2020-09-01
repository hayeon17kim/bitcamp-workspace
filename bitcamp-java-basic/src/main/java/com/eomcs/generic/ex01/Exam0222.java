// 제네릭(Generic) 문법 정리 - 제네릭 파라미터 
package com.eomcs.generic.ex01;

import java.util.ArrayList;
import java.util.HashSet;
import com.eomcs.generic.ex01.Exam0220.A;
import com.eomcs.generic.ex01.Exam0220.B1;
import com.eomcs.generic.ex01.Exam0220.B2;
import com.eomcs.generic.ex01.Exam0220.C;

public class Exam0222 {
  
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
    // m1(ArrayList<?>)
    // => 모든 타입에 대해 ArrayList 객체를 파라미터로 넘길 수 있다.
    //
    m1(new ArrayList());
    //m1(new ArrayList<Object>());
    //m1(new ArrayList<A>());
    //m1(new ArrayList<B1>());
    //m1(new ArrayList<B2>());
    //m1(new ArrayList<C>());
  }
  
  static void m1(ArrayList<?> list) {
    // 컴파일러는 파라미터로 받은 ArrayList가 어떤 타입의 값을 다루는 지 알 수 없기 때문에
    // 그 타입인 지 검사해야 하는 메서드를 사용할 때는 컴파일을 명확하게 해줄 수 없다.
    // 따라서 컴파일 오류를 발생시킨다.
    
    
    
    
    // A목록 관리하는 ArrayList를 줄지 C객체를 관리하는 ArrayList를 줄 지 모른다.
    // 그래서 뭘 넣어도 괜찮은 지 모르겠어
    // add안쓰는 것까진 괜ㅊ낳아.
    // 저 메소드를 쓴다면 컴파일 할 수 없어.
    // 난 이거 모르겠어!
    /*
    list.add(new Object());// 컴파일에러! => 가능한지 불가능한지 나도 모르겠다!
    list.add(new A());
    list.add(new B1());
    list.add(new B2());
    list.add(new C());
    */
    
    Object obj1 = list.get(0); // 오브젝트는 Ok 최고조상이니까 
    
    // 다음의 경우도 마찬가지로 get()의 리턴 타입이 무엇인지 결정할 수 없기 때문에
    // 컴파일해줄 수 업다. 그래서 컴파일 오류가 발생한다.
    //A obj2 = list.get(1); // 컴파일 오류!
    // 그러나 get
    
    // println()의 파라미터 타입이 Object이기 때문에 다음 코드는 오류가 아니다.
    System.out.println(list.get(0));// 여기는 파라미터 타입이 Object
    System.out.println(list.get(1));
    System.out.println(list.get(2));
    System.out.println(list.get(3));
    System.out.println(list.get(4));
  }
}








