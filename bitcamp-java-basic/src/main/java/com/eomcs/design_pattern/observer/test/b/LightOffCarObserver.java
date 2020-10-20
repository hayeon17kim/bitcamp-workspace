package com.eomcs.design_pattern.observer.test.b;

public class LightOffCarObserver implements CarObserver {
  public void carStarted() {}
  public void carStopped() {
    System.out.println("전조등을 끈다.");
  }
}
