package com.eomcs.oop.ex10.practice.c;

public class Exam01 {
  public static void main(String[] args) {
    Restaurant r = new Restaurant();
    Farm f = new Farm();

    work(r);
    System.out.println("---------");

    work(f);
  }

  static void work(Building obj) {
    // 레스토랑이나 농장 건축의 기본 흐름은 이미 수퍼 클래스에 정의되어 있다.
    // 착수와 완료는 서브 클래스마다 다르다.
    obj.build();
  }
}
