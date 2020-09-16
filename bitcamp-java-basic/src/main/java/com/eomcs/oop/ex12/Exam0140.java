package com.eomcs.oop.ex12;

public class Exam0140 {
  static interface Player {
    void play(String name);
  }

  public static void main(String[] args) {
    Player p1 = (String name) -> System.out.println("테스트1");
    Player p2 = (name) -> System.out.println("테스트2");
    Player p3 = name -> System.out.println(name + "님 환영합니다.");

    p1.play("김하연");
    p2.play("김하연");
    p3.play("김하연");
  }
}
