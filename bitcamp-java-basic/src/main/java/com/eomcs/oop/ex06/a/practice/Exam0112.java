package com.eomcs.oop.ex06.a.practice;

public class Exam0112 {
  public static void main(String[] args) {
    
    Vehicle v = new Vehicle();
    Bike b = new Bike();
    Car c = new Car();
    Sedan s = new Sedan();
    Truck t = new Truck();
    
    Bike b2 = null;
    
    // 하위 클래스의 레퍼런스로 상위 클래스의 인스턴스 가리킬 수 없음
    // => 상위 클래스의 인스턴스에는 하위 클래스의 인스턴스 변수가 없을 수 있기 때문이다.
    b2 = v;
    
    b2.engine = true;
    // 레퍼런스를 통해 존재하지 않는 인스턴스 멤버를 사용할까봐 
    // 방지하기 위해 컴파일 단계에서 사용 막음 
  }
}
