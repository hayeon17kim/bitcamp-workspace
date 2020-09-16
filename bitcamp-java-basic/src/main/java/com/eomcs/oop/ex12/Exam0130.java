package com.eomcs.oop.ex12;

public class Exam0130 {
  static interface Player {
    void play(String name, int age);
  }

  public static void main(String[] args) {
    Player p1 = (String name, int age) -> System.out.printf("%s(%d)님 환영합니다.\n", name, age);
    Player p2 = (name, age) -> System.out.printf("%s(%d)님 환영합니다.\n", name, age);
    // Player p3 = name, age -> System.out.printf("%s(%d)님 환영합니다.\n", name, age);


    p1.play("김하연", 25);
    p2.play("김하연", 25);
  }
}
