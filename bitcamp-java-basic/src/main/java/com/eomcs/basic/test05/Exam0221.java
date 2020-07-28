package com.eomcs.basic.test05;

public class Exam0221 {
  public static void main(String[] args) {
    float f1 = 0.1f;
    float f2 = 0.1f;
    
    System.out.println(f1 * f2 == 0.01f);
    
    System.out.println(f1 * f2);
    
    float r = f1 * f2 - 0.01f;
    System.out.println(Math.abs(r) <= Float.POSITIVE_INFINITY);
    //System.out.println(Float.POSITIVE_INFINITY);  //Infinity
  }
}
