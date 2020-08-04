package com.eomcs.basic.ex07;
// # 매서드 : call by reference

public class Exam0330 {
  
  // main()에서 만든 int와 int b의 값을 바꾸고 싶다면,
  // primitive data type 값을 직접 넘기지 말고
  // 객체에 담아 넘겨라!
  static class MyObject {
    int a;
    int b;
  }
  
  static void swap(MyObject ref) {
    System.out.printf("swap(): a=%d, b=%d\n", ref.a, ref.b);
    int temp = ref.a;
    ref.a = ref.b;
    ref.b = temp;
    System.out.printf("swap(): a=%d, b=%d\n", ref.a, ref.b);
  }
  
  public static void main(String[] args) {
    // MyObject 설계도에 따라 itn a와 int b 메모리를 만든다. 
    // 그리고 그 메모리(인스턴스=객체)의 주소를 ref변수에 저장한다.
    MyObject ref = new MyObject();
    ref.a = 100;
    ref.b = 200;
    
    //a, b
    
    swap(ref);
    System.out.printf("main(): a=%d, b=%d\n", ref.a, ref.b);
  }
}
