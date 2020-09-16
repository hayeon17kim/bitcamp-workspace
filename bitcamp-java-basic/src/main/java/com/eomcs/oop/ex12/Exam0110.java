package com.eomcs.oop.ex12;

public class Exam0110 {
  static interface Player {
    void play();
  }

  public static void main(String[] args) {
    class MyPlayer implements Player {
      @Override
      public void play() {
        System.out.println("테스트1");
      }
    }
    Player p1 = new MyPlayer();
    p1.play();
  }
}
