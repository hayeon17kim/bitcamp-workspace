// 다형적 변수
package com.eomcs.oop.ex06.a.practice;

public class Exam0114 {
  public static void main(String[] args) {
    Vehicle v = new Vehicle();
    Bike b = new Bike();
    Car c = new Car();
    Sedan s = new Sedan(); 
    Truck t = new Truck();
    
    Car c2 = null;
    
    // 자식 클래스의 인스턴스는 가리킬 수 있다.
    // 자식 클래스의 인스턴스에는 "무조건" 부모 클래스이 인스턴스 변수가 있기 때문 
    
    c2 = s;
    c2 = t;
    
    c2 = s;
     
    c2.model = "티코"; // Vechicle 인스턴스 변수
    c2.capacity = 5; // Vehicle 인스턴스 변수
    c2.cc = 890; // Car 인스턴스 변수
    c2.valve = 16; // Car  인스턴스 변수
  }
}
