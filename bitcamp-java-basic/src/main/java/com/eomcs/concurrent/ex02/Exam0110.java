package com.eomcs.concurrent.ex02;

public class Exam0110 {
  public static void main(String[] args) {
    Thread t = Thread.currentThread();
    System.out.println("실행 흐름명 = " + t.getName());
  }
}
