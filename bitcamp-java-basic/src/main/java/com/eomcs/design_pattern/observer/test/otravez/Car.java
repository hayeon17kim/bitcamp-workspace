package com.eomcs.design_pattern.observer.test.otravez;

import java.util.ArrayList;
import java.util.List;

public class Car {
  
  List<CarObserver> carObservers = new ArrayList<>();
  
  public void addCarObserver(CarObserver carObserver) {
    carObservers.add(carObserver);
  }
  
  public void removeCarObserver(CarObserver carObserver) {
    carObservers.remove(carObserver);
  }
  
  // 리팩토링: 메서드 추출 (extract method)
  // - 특정 기능을 수행하는 코드를 이해하기 쉽도록 외부 메서드로 추출하는 것
  
 
  
  public void start() {
    System.out.println("시동을 건다.");
    
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
}