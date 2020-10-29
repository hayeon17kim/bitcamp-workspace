package com.eomcs.jdbc.ex1;

import java.sql.DriverManager;

public class Exam0110 {
  public static void main(String[] args) {
    try {
      java.sql.Driver mariadbDriver = new org.mariadb.jdbc.Driver();
      java.sql.Driver oracleDriver = new oracle.jdbc.OracleDriver();
      java.sql.Driver mssqlDriver = new com.microsoft.sqlserver.jdbc.SQLServerDriver();
      DriverManager.registerDriver(mariadbDriver);
      DriverManager.registerDriver(oracleDriver);
      DriverManager.registerDriver(mssqlDriver);
      java.sql.Driver driver = DriverManager.getDriver("jdbc:mariadb://");
      System.out.println(driver);
      java.sql.Driver driver2 = DriverManager.getDriver("jdbc:oracle:thin://");
      System.out.println(driver2);
      java.sql.Driver driver3 = DriverManager.getDriver("jdbc:sqlserver://");
      System.out.println(driver3);
      
      
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}
