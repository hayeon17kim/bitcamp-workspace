package com.eomcs.oop.ex12;

public class Exam0120 {
  static interface Player {
    void play();
  }

  public static void main(String[] args) {
    Player p1 = () -> System.out.println("테스트1");
    Player p2 = () -> {
      System.out.println("테스트2");
    };
  }
}
