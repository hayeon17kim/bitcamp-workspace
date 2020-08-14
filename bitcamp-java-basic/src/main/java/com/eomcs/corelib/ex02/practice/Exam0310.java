package com.eomcs.corelib.ex02.practice;

import java.util.Date;

public class Exam0310 {
  public static void main(String[] args) {
    Date d1 = new Date();
    System.out.println(d1);
    
    Date d2 = new Date(1000);
    System.out.println(d2);
    
    Date d3 = new Date(System.currentTimeMillis());
    System.out.println(d3);
    
    Date d4 = new Date(119, 0, 15);
    System.out.println(d4);
    
    java.sql.Date d5 = new java.sql.Date(System.currentTimeMillis());
    System.out.println(d5);
    
    java.sql.Date d6 = new java.sql.Date.valueOf("2019-1-16");
    System.out.println(d6);
  }
}
