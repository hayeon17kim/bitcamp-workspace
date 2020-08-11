package com.eomcs.oop.ex06.a.practice;

public class Exam0511 {
  public static void main(String[] args) {
    Vehicle v = new Sedan();
    
    System.out.println(v instanceof Sedan);
    System.out.println(v instanceof Car);
    System.out.println(v instanceof Vehicle);
    System.out.println(v instanceof Object);
    
    System.out.println(v instanceof Truck);
    System.out.println(v instanceof Bike);
  }
}
