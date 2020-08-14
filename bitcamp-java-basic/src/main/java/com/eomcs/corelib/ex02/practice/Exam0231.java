package com.eomcs.corelib.ex02.practice;

public class Exam0231 {
  public static void main(String[] args) {
    Integer obj1 = Integer.valueOf(100);
    Integer obj2 = 100;
    System.out.println(obj1 == obj2);
    
    Integer obj3 = new Integer(100);
    Integer obj4 = new Integer(100);
    
    System.out.println(obj3 == obj4);
    System.out.println(obj3.equals(obj4));
    
    
  }
}
