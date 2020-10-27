package com.eomcs.design_pattern.observer.test.otravez;

public class AbstractCarObserver implements CarObserver {

  @Override
  public void carStarted() {
    // TODO Auto-generated method stub
    // 서브 클래스가 원하는 인터페이스에 정의된 메서드 중에서
    // 원하는 메서드만 오버라이딩 할 수 있도록
    // 수퍼 클래스에서 미리 구현한다.
    // 단, 아무런 코드를 넣지 않는다.
  }

  @Override
  public void carStopped() {
    // TODO Auto-generated method stub
    
  }

}
