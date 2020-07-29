package com.eomcs.basic.test05;

public class Exam0680 {
  public static void main(String[] args) {
    int i = 2;
    int result = ++i + ++i * ++i;
    // 1) 3 + 4 * 5
    // 2) 3 + 20
    // 3) result = 23
    
    System.out.println(result); // 23
  }
}
