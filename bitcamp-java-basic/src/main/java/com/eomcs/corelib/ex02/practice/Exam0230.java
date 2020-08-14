package com.eomcs.corelib.ex02.practice;

public class Exam0230 {
  public static void main(String[] args) {
    Integer obj1 = new Integer(100);
    Integer obj2 = new Integer(100);
    System.out.println(obj1 == obj2);
    
    Integer obj3 = 100;
    Integer obj4 = 100;
    System.out.println(obj3 == obj4);
    
    Integer obj5 = Integer.valueOf(100);
    Integer obj6 = Integer.valueOf(100);
    System.out.println(obj5 == obj6);
    
    System.out.println(obj3 == obj5);
    
    Integer obj7 = 128;
    Integer obj8 = 128;
    Integer obj9 = 128;
    System.out.println(obj7 == obj8);
    System.out.println(obj7 == obj9);
    System.out.println(obj8 == obj9);
  }
}
