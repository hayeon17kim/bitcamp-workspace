package com.eomcs.concurrent.ex04;

public class Exam0130 {
  public static void main(String[] args) throws Exception {
    System.out.println("스레드 실행 전");
    
    new Thread() {
      @Override
      public void run() {
        System.out.println("Hello!");
      }
    }.start();
    
    Thread.sleep(3000);
    
    System.out.println("스레드 실행 후");
  }
}
