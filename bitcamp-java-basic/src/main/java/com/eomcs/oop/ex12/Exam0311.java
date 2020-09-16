package com.eomcs.oop.ex12;

public class Exam0311 {
  static interface Player {
    void play();
  }

  static void testPlayer(Player player) {
    player.play();
  }

  public static void main(String[] args) {
    Player player = new Player() {
      @Override
      public void play() {
        System.out.println("실행!");
      }
    };

    testPlayer(player);
  }
}
