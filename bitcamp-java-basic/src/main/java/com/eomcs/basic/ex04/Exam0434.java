package com.eomcs.basic.ex04;

public class Exam0434 {
  public static void main(String[] args) {
    int a = 0x41;
    
    for(int i = 0; i < 26; i++) {
      System.out.println((char)(a + i));
    }
  }
}
