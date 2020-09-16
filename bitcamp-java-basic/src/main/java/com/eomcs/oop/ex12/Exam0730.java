package com.eomcs.oop.ex12;

public class Exam0730 {
  static class Message {
    String name;

    public Message() {
      this.name = "이름없음";
    }

    public Message(String name) {
      this.name = name;
    }

    public void print() {
      System.out.printf("%s님 반갑습니다!\n", name);
    }
  }

  static interface Factory
}
