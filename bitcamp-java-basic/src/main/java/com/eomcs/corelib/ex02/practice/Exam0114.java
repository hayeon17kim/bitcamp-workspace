package com.eomcs.corelib.ex02.practice;

public class Exam0114 {
  public static void main(String[] args) {
    String s1 = new String("Hello");
    String s2 = "Hello";
    String s3= s1.intern();
    
    System.out.println(s1 == s2);
    System.out.println(s2 == s3);
  }
}
