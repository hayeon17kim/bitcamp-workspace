package com.eomcs.oop.ex10.practice.c;

public class Farm extends Building {
  @Override
  public void startEffect() {
    System.out.println("땅을 고른다...");
  }

  @Override
  public void endEffect() {
    System.out.println("씨앗을 뿌린다...");
  }
}
