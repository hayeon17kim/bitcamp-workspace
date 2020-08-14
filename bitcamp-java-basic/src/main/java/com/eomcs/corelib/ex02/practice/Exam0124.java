package com.eomcs.corelib.ex02.practice;

public class Exam0124 {
  public static void main(String[] args) {
    
    StringBuffer b1 = new StringBuffer("Hello");
    StringBuffer b2 = new StringBuffer("Hello");
    
    System.out.println(b1 == b2);
    System.out.println(b1.equals(b2));
    
    
  }
}
