package com.eomcs.generic.ex01.practice;

import com.eomcs.algorithm.data_structure.array.ArrayList;

public class Exam0231 {
  static class A {}
  static class B1 extends A {}
  static class B2 extends A {}
  static class C extends B1 {}
  
  public static void main(String[] args) {
    ArrayList<B1> list1 = new ArrayList<>();
    // ArrayList의 항목 타입을 B1으로 지정했기 때문에  
    // ArrayList의 메서드 파라미터나 리턴 타입은 B1으로 설정된다.
    
    // => add(B1)
    //list1.add(new Object()); // 컴파일 오류!
  }
}
