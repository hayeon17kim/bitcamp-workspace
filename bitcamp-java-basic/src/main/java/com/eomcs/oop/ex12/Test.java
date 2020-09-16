package com.eomcs.oop.ex12;

public class Test {
  interface Player {
    void play(String name);

    void play(String name, int game);
  }

  public static void main(String[] args) {
    Player p = (name, game) -> System.out.println(name);
  }

}
