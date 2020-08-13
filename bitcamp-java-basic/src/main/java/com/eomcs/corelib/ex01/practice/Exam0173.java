package com.eomcs.corelib.ex01.practice;

public class Exam0173 {
  static class Engine implements Cloneable {
    int cc;
    int valve;
    
    public Engine(int cc, int valve) {
      this.cc = cc;
      this.valve = valve;
    }
    
    @Override
    public String toString() {
      return "Engine [cc=" + cc + ", valve=" + valve + "]";
    }
    
    @Override
    public Engine clone() throws CloneNotSupportedException {
      return (Engine) super.clone();
    }
  }
  
  static class Car implements Cloneable {
    String maker;
    String name;
    Engine engine;
    
    public Car(String maker, String name, Engine engine) {
      this.maker = maker;
      this.name = name;
      this.engine = engine;
    }
    
    @Override
    public String toString() {
      return "Car [maker=" + maker + ", name=" + name + ", engine=" + engine + "]";
    }
    
    @Override
    public Car clone() throws CloneNotSupportedException {
      return (Car) super.clone();
    }
  }
  
  public static void main(String[] args) throws Exception {
    Engine engine = new Engine(3000, 16);
    Car car = new Car("비트자동차", "비트비트", engine);
    
    Car car2 = car.clone();
    
    System.out.println(car == car2);
    System.out.println(car);
    System.out.println(car2);
    System.out.println(car.engine == car2.engine); // true
    
    car.engine.cc = 2000;
    System.out.println(car2.engine.cc);
  }
}
