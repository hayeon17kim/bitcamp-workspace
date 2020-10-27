package com.eomcs.design_pattern.observer.test.otravez;

public class SafeBeltCarObserver extends AbstractCarObserver{
  public void carStarted() {
    System.out.println("안전벨트를 맵니다.");
  }
}
