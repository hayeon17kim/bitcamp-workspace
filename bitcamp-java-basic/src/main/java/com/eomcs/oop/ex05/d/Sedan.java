package com.eomcs.oop.ex05.d;

// 세단은 Car의 기능을 쓰면서 추가적으로 확장한다.

public class Sedan extends Car {
  boolean sunroof;
  boolean auto;
  
  public Sedan(String model, String maker, int capacity, boolean sunroof, boolean auto) {
    this.model = model;
    this.maker = maker;
    this.sunroof = sunroof;
    this.auto = auto;
  }
}
