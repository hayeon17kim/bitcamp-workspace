package com.eomcs.corelib.ex02.practice;

public class Exam0161 {
  public static void main(String[] args) {
    StringBuffer buf = new StringBuffer("Hello");
    System.out.println(buf);
    
    buf.replace(2,  4, "xxxx");
    System.out.println(buf);
  }
}
