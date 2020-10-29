package com.eomcs.jdbc.ex1;

import java.sql.Connection;
import java.sql.DriverManager;

public class Exam0310 {
  public static void main(String[] args) {
    try (Connection con = DriverManager.getConnection("jdbc:mariadb://localhost:3306/studydb?user=study&password=1111");
        java.sql.Statement stmt = con.createStatement();){ 

      System.out.println(stmt.getClass().getName());
      // int executeUpdate(): 리턴값: 변경된 데이터의 개수 
      
      // 2) SELECT: ResultSet executeQuery();
      // 리턴값:서버에서 데이터를 가져오는 일을 할 객체
      
      
      int count = stmt.executeUpdate(
          "insert into x_board(title,contents) values('제목10', '내용')");
      System.out.printf("%d개 입력 성공 !", count);
      
    } catch (Exception e) {
      e.printStackTrace();
    } 
  }
}
