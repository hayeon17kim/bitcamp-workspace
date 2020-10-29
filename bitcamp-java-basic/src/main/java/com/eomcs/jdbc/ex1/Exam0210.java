package com.eomcs.jdbc.ex1;

import java.sql.Connection;
import java.sql.DriverManager;

public class Exam0210 {
  public static void main(String[] args) {
    Connection con = null;
    try {
      // 형변환 했을 때 잘못되었으면 에러가 낫을 것이다.
      // 하지만 실제 인스턴스가 그 타입이기 때문에 정상적으로 되엇
      con = DriverManager.getConnection(
          "jdbc:mariadb://localhost:3306/studydb", //jdbcURL
          "study", // username
          "1111"); // password
      
      System.out.println(con.getClass().getName());
    } catch (Exception e) {
      e.printStackTrace();
    } finally {
      try {
        con.close();
      } catch (Exception e) {
        
      }
    }
  }
}
