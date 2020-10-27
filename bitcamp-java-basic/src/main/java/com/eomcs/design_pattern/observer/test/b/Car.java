package com.eomcs.design_pattern.observer.test.b;

import java.util.ArrayList;
import java.util.List;

public class Car {
  List<CarObserver> carObservers = new ArrayList<>();
  
  public void addObserver(CarObserver carObserver) {
    carObservers.add(carObserver);
  }
  
  public void removeObserver(CarObserver carObserver) {
    carObservers.remove(carObserver);
  }
  
  public void start() {
    System.out.println("시동을 건다.");
    notifyObserversOnStarted();
  }
  
  public void notifyObserversOnStarted() {
    for (CarObserver carObserver : carObservers) {
      carObserver.carStarted();
    }
  }

  public void run() {
    System.out.println("달린다.");
  }

  public void stop() {
    System.out.println("시동을 끈다.");
    
    for (CarObserver carObserver : carObservers) {
      carObserver.carStopped();
    }
  }
  
  public void votifyObserversOnStopped() {
    for (CarObserver carObserver : carObservers) {
      carObserver.carStopped();
    }
  }
}


