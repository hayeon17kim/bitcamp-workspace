package com.eomcs.concurrent.ex03;

public class Exam0120 {
  public static void main(String[] args) {
    new Thread() {
      @Override
      public void run() {
        // 별도로 분리해서 병행으로 실행할 코드를 두는 곳!
        for (int i = 0; i < 1000; i++) {
          System.out.println("===> " + i);
        }
      }
    }.start();
    
    for (int i = 0; i < 1000; i++) {
      System.out.println(">>> " + i);
    }
    
  }
}
