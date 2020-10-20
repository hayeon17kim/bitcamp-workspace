package com.eomcs.concurrent.ex03;

public class Exam0230 {
  public static void main(String[] args) {
    new Thread(() -> {
      for (int i = 0; i < 1000; i++)
        System.out.println("==>" + i);
    }).start();
    
    for (int i = 0; i < 1000; i++)
      System.out.println(">>" + i);
  }
}
