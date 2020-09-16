package com.eomcs.oop.ex12;

public class Exam0113 {
  static interface Player {
    void play();
  }

  public static void main(String[] args) {
    Player 람다 = () -> System.out.println("테스트1");
    람다.play();

  }
}
