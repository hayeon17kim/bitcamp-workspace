package com.eomcs.design_pattern.observer.test.otravez;

public class LightOffCarObserver extends AbstractCarObserver {
  public void carStopped() {
    System.out.println("전조등을 끕니다..");
  }
}
