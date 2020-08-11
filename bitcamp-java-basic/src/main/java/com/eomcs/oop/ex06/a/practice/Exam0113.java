// 다형성 - 다형적 변수(polymorphic variables)
package com.eomcs.oop.ex06.a.practice;

public class Exam0113 {
  public static void main(String[] args) {
    
    Vehicle v = new Vehicle();
    Bike b = new Bike();
    Car c = new Car();
    Sedan s = new Sedan();
    Truck t = new Truck();
     
    Bike b2 = null;
    
    b2 = c; 
  }
}
