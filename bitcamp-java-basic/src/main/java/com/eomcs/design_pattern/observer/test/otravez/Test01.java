package com.eomcs.design_pattern.observer.test.otravez;

public class Test01 {
  public static void main(String[] args) {
    Car car = new Car();
    
    car.addCarObserver(new SafeBeltCarObserver());
    car.addCarObserver(new LightOffCarObserver());
    car.addCarObserver(new EngineOilCarObserver());
    car.addCarObserver(new SunRoofCloseCarObserver());

    car.start();

    car.run();

    car.stop();

  }
}
