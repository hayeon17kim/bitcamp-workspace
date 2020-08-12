package com.eomcs.oop.ex06.c;

public class C2 extends C {
//  @Override
//  private void m1() {}
  private void m1() {}
  
  @Override void m2() {}
  @Override protected m3() {}
  @Override public void m4() {}
}

//멤버의 접근 범위
//private      : 같은 클래스
//(default)    : 같은 클래스 + 같은 패키지
//protected    : 같은 클래스 + 같은 패키지 + 서브 클래스
//public       : 모두
//