package com.eomcs.concurrent.ex02;

public class Exam0160 {
  public static void main(String[] args) {
    Thread main = Thread.currentThread();
    ThreadGroup mainGroup = main.getThreadGroup();
    ThreadGroup systemGroup = mainGroup.getParent();
    
    ThreadGroup[] groups = new ThreadGroup[100];
    int count = systemGroup.enumerate(groups, false);
    
    System.out.println("system 스레드 그룹의 자식 그룹들: ");
    for (int i = 0; i < count; i++) {
      System.out.println("  ==> "+ groups[i].getName());
    }
  }
}
