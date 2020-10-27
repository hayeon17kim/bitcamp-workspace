package com.eomcs.concurrent.ex02;

public class Exam0140 {
  public static void main(String[] args) {
    Thread main = Thread.currentThread();
    ThreadGroup mainGroup = main.getThreadGroup();
    
    ThreadGroup[] groups = new ThreadGroup[100];
    int count = mainGroup.enumerate(groups, false);
    
    
    System.out.println("main 그룹에 소속된 하위 그룹들");
    for (int i = 0; i < count; i++)
      System.out.println("   => " + groups[i].getName());
  }
}
