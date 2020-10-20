package com.eomcs.concurrent.ex02;

public class Exam0150 {
  public static void main(String[] args) {
    Thread main = Thread.currentThread();
    ThreadGroup mainGroup = main.getThreadGroup();
    
    ThreadGroup parentGroup = mainGroup.getParent();
    System.out.println(parentGroup.getName());
    
    ThreadGroup grandparentGroup = parentGroup.getParent();
    if (grandparentGroup != null)
      System.out.println(grandparentGroup.getName());
    
    
  }
}
