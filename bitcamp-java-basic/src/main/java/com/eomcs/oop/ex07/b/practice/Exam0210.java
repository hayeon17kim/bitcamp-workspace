package com.eomcs.oop.ex07.b.practice;

import com.eomcs.oop.ex07.b.sub.B;
import com.eomcs.oop.ex07.b.sub.C;

public class Exam0210 extends C {
  public static void main(String[] args) {
    A obj1 = new A();
    
    //obj1.privateVar = 100;
    obj1.defaultVar = 100;
    obj1.protectedVar = 100;
    obj1.publicVar = 100;
    
    B obj2 = new B();
    //obj2.privateVar = 100;
    //obj2.defaultVar = 100;
    //obj2.protectedVar = 100;
    //obj2.publicVar = 100;
    
    C obj3 = new C();
    //obj3.privateVar = 100;
    //obj3.defaultVar = 100;
    //obj3.protectedVar = 100;
    obj3.publicVar = 100;
    // 같은 패키지 혹은 자식 클래스 접근 가능
    // 자기의 인스턴스 변수가 아니다.
    
    Exam0210 obj4 = new Exam0210();
    //obj4.privateVar = 100;
    //obj4.defaultVar = 100;
    obj4.protectedVar = 100;
    // C의 자식 클래스이며, C로부터 상속받아서 만든 자기 변수이다.
    obj4.publicVar = 100;
    
    
  }
  
  void m1(C obj) {
    //obj.privateVar = 100;
    //obj.defaultVar = 100;
    //obj.protectedVar = 100;
    obj.publicVar = 100;
  }
  
  void m2(Exam0210 obj) {
    //obj.privateVar = 100;
    //obj.defaultVar = 100;
    obj.protectedVar = 100;
    obj.publicVar = 100;
  }
  
  void m2() {
    //this.privateVar = 100;
    //this.defaultVar = 100;
    this.protectedVar = 100;
    this.publicVar = 100;
  }
}















