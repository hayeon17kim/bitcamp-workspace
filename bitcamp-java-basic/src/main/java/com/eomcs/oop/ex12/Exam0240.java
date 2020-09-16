package com.eomcs.oop.ex12;

public class Exam0240 {
  static abstract class Player {
    public abstract void play();
  }

  public static void main(String[] args) {
    Player p = () -> System.out.println("Player..");
    // p.play();
  }
}
