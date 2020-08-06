package com.eomcs.oop.ex03.practice;

public class Exam0160 {
  static class Car {
    // 클래스 필드
    // - 모든 인스턴스가 "공유하는 값"을 저장하는 용도이다.
    // - 특히 상수 값일 때 많이 사용한다.
    static int count;

    static final int SEDAN = 1;
    static final int TRUCK = 2;
    
    // 인스턴스 필드
    // - "개별적으로 관리되어야 할 값"을 저장하는 용도이다.
    String model;
    String no;
    int cc;
    int type;
    
  }
  
  public static void main(String[] args) {
    
    Car c1 = new Car();
    Car c2 = new Car();
    c1.model = "티코";
    c1.no = "40-1111";
    c1.cc = 900;
    c1.type = Car.SEDAN;
    Car.count++;
    
    c2.model = "타이탄";
    c2.no = "20-1111";
    c2.cc = 10000;
    c2.type = Car.TRUCK;
    Car.count++;
    
    System.out.printf("%s, %s, %d\n", c1.model, c1.no, c1.cc);
    System.out.printf("%s, %s, %d\n", c2.model, c2.no, c2.cc);
    System.out.println(Car.count);
  }
}
