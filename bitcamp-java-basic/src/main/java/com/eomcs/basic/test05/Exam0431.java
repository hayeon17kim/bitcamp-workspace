package com.eomcs.basic.test05;

public class Exam0431 {
  public static void main(String[] args) {
    int i = 0b11111111_11111111_11111111_10101001; // -87
    
    System.out.println(i);          // -87
    
    System.out.println(i >>> 1);    // 2147483604
    
    System.out.println(i >>> 2);
    
    System.out.println(i >>> 3);
    
    System.out.println(i >>> 4);
  }
}
