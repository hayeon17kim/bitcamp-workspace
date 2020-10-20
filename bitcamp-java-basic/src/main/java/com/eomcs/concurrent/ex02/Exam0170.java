package com.eomcs.concurrent.ex02;

public class Exam0170 {
  public static void main(String[] args) {
    Thread main = Thread.currentThread();
    ThreadGroup mainGroup = main.getThreadGroup();
    ThreadGroup systemGroup = mainGroup.getParent();
    
    Thread[] arr = new Thread[100];
    int count = systemGroup.enumerate(arr, false);
    System.out.println("system 스레드 그룹에 소속된 스레드들:");
    for (int i =0; i < count; i++)
      System.out.println("===> " + arr[i].getName());
  }
}
