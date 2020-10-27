package com.eomcs.design_pattern.observer.test.b;

public class Test01 {

  public static void main(String[] args) {
    Car car = new Car();
    
    car.addObserver(new SafeBeltCarObserver());
    car.addObserver(new LightOffCarObserver());

    car.start();

    car.run();

    car.stop();

  }

}


