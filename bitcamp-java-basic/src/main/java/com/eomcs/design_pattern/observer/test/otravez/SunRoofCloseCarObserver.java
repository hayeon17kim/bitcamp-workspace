package com.eomcs.design_pattern.observer.test.otravez;

public class SunRoofCloseCarObserver extends AbstractCarObserver {
  public void carStopped() {
    System.out.println("선루프를 닫습니다.");
  }
}
