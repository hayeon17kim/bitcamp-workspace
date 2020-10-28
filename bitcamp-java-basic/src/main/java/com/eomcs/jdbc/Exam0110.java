package com.eomcs.jdbc;

import java.sql.DriverManager;

public class Exam0110 {
  public static void main(String[] args) {
    try {
      java.sql.Driver driver = new org.mariadb.jdbc.Driver();
      DriverManager.registerDriver(driver);
      java.sql.Driver driver2 = DriverManager.getDriver("jdbc:mariadb:");
      //java.sql.Driver driver2 = DriverManager.getDriver("jdbc:mysql:"); -> 있음 
      //java.sql.Driver driver2 = DriverManager.getDriver("jdbc:oracle:"); -> 없음
      /*
       * java.sql.SQLException: No suitable driver
    at java.sql/java.sql.DriverManager.getDriver(DriverManager.java:298)
    at com.eomcs.jdbc.Exam0110.main(Exam0110.java:10)
       */
      System.out.println(driver2);
      
      
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}
