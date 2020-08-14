package com.eomcs.corelib.ex02.practice;

public class Exam0125 {
  public static void main(String[] args) {
    StringBuffer b1 = new StringBuffer("Hello");
    StringBuffer b2 = new StringBuffer("Hello");
    
    String s1 = b1.toString();
    String s2 = b2.toString();
    System.out.println(s1.equals(s2));
    
    System.out.println(b1.toString().equals(b2.toString()));
  }
}
