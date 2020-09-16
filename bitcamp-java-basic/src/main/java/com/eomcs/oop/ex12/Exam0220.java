package com.eomcs.oop.ex12;

public class Exam0220 {
  static interface Player {
    static String info() {
      return "Player입니다...";
    }

    default void stop() {}

    void play();
  }

  public static void main(String[] args) {
    Player p = () -> System.out.println("Player..");
    p.play();
    System.out.println(Player.info());
  }
}
