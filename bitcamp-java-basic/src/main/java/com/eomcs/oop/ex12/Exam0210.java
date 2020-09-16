package com.eomcs.oop.ex12;

public class Exam0210 {
  static interface Player {
    void play();
  }

  public static void main(String[] args) {
    Player p = () -> System.out.println("Player..");
    p.play();
  }
}
