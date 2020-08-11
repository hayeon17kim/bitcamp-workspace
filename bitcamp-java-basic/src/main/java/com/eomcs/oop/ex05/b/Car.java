// 기존의 Car 클래스에 코드를 추가했다.
package com.eomcs.oop.ex05.b;

public class Car {
  String model;
  String maker;
  int capacity;
  boolean sunroof;
  boolean auto;
  
  public Car() {}
  
  public Car(String model, String maker, int capacity) {
    this.model = model;
    this.maker = maker;
    this.capacity = capacity;
  }
  
  public Car(String model, String maker, int capacity, boolean sunroof, boolean auto) {
    this(model, maker, capacity);
    
    this.sunroof = sunroof;
    this.auto = auto;
  }
}


