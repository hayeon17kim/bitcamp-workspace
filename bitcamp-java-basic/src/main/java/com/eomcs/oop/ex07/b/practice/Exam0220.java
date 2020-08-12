package com.eomcs.oop.ex07.b.practice;

import com.eomcs.oop.ex07.b.practice.Car;

public class Exam0220 {
  public static void main(String[] args) {
    Car c2 = Car.create("티코");
    System.out.printf("%s, %s, %s, %s\n", 
        c2.model, c2.maker, c2.cc, c2.valve);
  }
}
