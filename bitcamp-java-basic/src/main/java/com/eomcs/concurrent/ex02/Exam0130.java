package com.eomcs.concurrent.ex02;

public class Exam0130 {
  public static void main(String[] args) {
    Thread main = Thread.currentThread();
    ThreadGroup mainGroup = main.getThreadGroup();
    
    Thread[] arr = new Thread[100];
    int count = mainGroup.enumerate(arr, false);
    
    System.out.println("main 그룹에 소속된 스레드들");
    
    
    for (int i = 0; i < count; i++) {
      System.out.println("  => " + arr[i].getName());
    }
  }
}
