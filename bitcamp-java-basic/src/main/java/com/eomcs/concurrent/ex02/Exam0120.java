package com.eomcs.concurrent.ex02;

public class Exam0120 {
  public static void main(String[] args) {
    Thread main = Thread.currentThread();
    
    ThreadGroup group = main.getThreadGroup();
    System.out.println("그룹명 = " + group.getName());
  }
}
