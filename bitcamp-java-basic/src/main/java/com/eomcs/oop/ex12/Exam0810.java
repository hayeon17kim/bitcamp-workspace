package com.eomcs.oop.ex12;

public class Exam0810 {
  interface Factory {
    // 공장에는 반드시 create()이 있어야 한다.
    Object create();
  }

  static class Car {
    public Car() {
      System.out.println("생성");
    }
  }
  static class Book {
  }
  static class Food {
  }

  public static void main(String[] args) {
    // 공장 규칙에 따라 공장을 만든다.
    // 1) 로컬 클래스로 인터페이스 구현체를 만든다.
    class CarFactory implements Factory {
      @Override
      public Object create() {
        return new Car();
      }
    }
    Factory f1 = new CarFactory();
    Car c1 = (Car) f1.create();

    // 2) 익명 클래스로 인터페이스 구현체를 만든다.
    // 공장을 딱 한 번만 뽑을 수 있다.
    Factory f2 = new Factory() {
      @Override
      public Object create() {
        return new Car();
      }
    };
    Car c2 = (Car) f2.create();

    // 3) 람다로 인터페이스 구현체를 만든다.
    Factory f3 = () -> new Car();
    Car c3 = (Car) f3.create();

    // 4) 기존에 존재하는 메서드로 인터페이스 구현체를 만든다.
    Factory f4 = Exam0810::createCar;
    Car c4 = (Car) f4.create();

    // 5) 기존 클래스의 생성자로 인터페이스 구현체를 만든다.
    Factory f5 = /* Exam0760. */CarFactory::new;
    Car c5 = (Car) f5.create();
    //
    // Factory f6 = () -> new CarFactory();
    // Car c6 = (Car) f5.create();
  }

  public static Car createCar() {
    return new Car();
  }

  static class CarFactory {
    public CarFactory() {

    }
  }
}
