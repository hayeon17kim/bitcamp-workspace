package com.eomcs.oop.ex03.practice;

public class Exam0210 {
  static class A {
    
    static int v1; // 스태틱 변수 = static field = class field 
    int v2; // 인스턴스 변수 = instance field = non-static field
    
    static void m1() {
      // method area 영역에 v1 이라는 변수 만들어 (명령)
      // new 명령에서 heap 영역에 v2라는 변수 만들어 (명령)
      A.v1 = 100;
      v1 = 100; // 같은 스태틱 멤버이기 때문에 생략 가능
      
      // 스태틱 메서드는 this라는 내장 변수가 없다.
      
      // 스태틱 메서드에서는 this가 없기 때문에 a클래스 설계도에 따라서 
      // heap에 만든 v2라는 변수를 접근할 수 없다.
      // this.v2 =200;
      // 스태틱 메서드는 this라는 내장 변수가 없기 때문에
      // this를 사용하여 접근하는 인스턴스 멤버(필드, 메서드)를 사용할 수 없다.
    }
    
    void m2() {
      // none static method = instance method
      System.out.println("m2()");
      
      
      // 인스턴스 필드에 접근하려면
      // 메서드 내장 변수인 this를 사용하라.
      // this는 메서드가 호출될 때 외부로부터 받은 인스턴스 주소를 갖고 있다.
      // this에 그 주소가 복사된다.
      this.v2 = 100;
      v2 = 300; // 생략할 수 있다.
      
      
      // this.v1 = 100; (하지마!!!!!)
      // 생략하면 this랑 생략한 거랑 마찬가지인데
    
      // static field는 인스턴스 레퍼런스를 통해 접근할 수 있다.
      // 그러나 비권장!
      this.v1 = 100; // => A.v1
      
      // 물론 다음과 같이 클래스 이름을 생략할 수 있다.
      // => 반반!
      v1 = 200; // => A.v1
      A.v1 = 200;
      m1();
      A.m1();
      
      // 인스턴스 메서드는 인스턴스 멤버(필드나 메서드)뿐만 아니라
      // 클래스 멤버(필드나 메서드)도 사용할 수 있다.
      
      
    }
    
    // this.어쩌구 안씀
    // 인스턴스 변수 사용 안함
    // 작업한 결과를 인스턴스 변수에 저장도 안해 
    static int abs (int value) {
      if (value < 0)
        return value * -1;
      return value;
    }
  }
  
  public static void main(String[] args) {
    // A 클래스의 인스턴스 주소를 받을 obj1이라는 변수 만들어
    // A obj1;
    
    
    A.m1();
    // A.m2();
    
    // none-static 메서드는 인스턴스가 있어야만 호출 가능
    // => 인스턴스 메서드 
    A obj1 = new A();
    obj1.m2();
    
    System.out.println(A.abs(-100));
    System.out.println(A.abs(100));
    System.out.println(Math.abs(-100));
  }

}
