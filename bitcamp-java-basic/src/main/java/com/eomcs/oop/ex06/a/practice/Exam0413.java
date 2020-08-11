package com.eomcs.oop.ex06.a.practice;

public class Exam0413 {
  public static void printCar(Car car) {
    System.out.printf("모델명: %s\n", car.model);
    System.out.printf("cc: %d\n", car.cc);
    System.out.println("------------------");
  }
  
  public static void main(String[] args) {
    Sedan car1 = new Sedan();
    car1.model = "티코";
    car1.cc = 800;
    Truck car2 = new Truck();
    car2.model = "타이탄II";
    car2.cc = 10000;
    
    printCar(car1);
    printCar(car2);
  }
}
