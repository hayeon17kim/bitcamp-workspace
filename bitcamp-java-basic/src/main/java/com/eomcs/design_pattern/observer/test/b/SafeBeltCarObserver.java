package com.eomcs.design_pattern.observer.test.b;

public class SafeBeltCarObserver implements CarObserver{
  public void carStarted() {
    System.out.println("안전벨트를 착용합니다..");
  }
  
  public void carStopped() {
  }
}
