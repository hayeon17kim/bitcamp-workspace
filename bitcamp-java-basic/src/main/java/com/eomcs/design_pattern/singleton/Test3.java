// Singleton 연습: 김밥 인스턴스를 한 개만 생성하도록 Singleton기법을 적용하라.
package com.eomcs.design_pattern.singleton;

// 인스턴스를 딱 한 개만 생성하여 공유하고 싶다면,
// Singleton 설계 방식으로 클래스를 정의하라!
//
class Kimbap {
  String bap;
  String kim;
  String vegitables;
  private static Kimbap instance;

  private Kimbap() {}


  public static Kimbap getInstance() {
    if (instance == null)
      instance = new Kimbap();
    return instance;
  }
}


public class Test3 {
  public static void main(String[] args) {
    // Kimbap bap1 = new Kimbap();
    Kimbap bap2 = Kimbap.getInstance();
    Kimbap bap3 = Kimbap.getInstance();



    System.out.println(bap2 == bap3);
  }
}


