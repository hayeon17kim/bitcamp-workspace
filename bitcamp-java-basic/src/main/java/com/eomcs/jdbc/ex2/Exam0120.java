package com.eomcs.jdbc.ex2;

import java.sql.Connection;
import java.sql.DriverManager;

public class Exam0120 {
  public static void main(String[] args) {
    try (Connection con = DriverManager.getConnection("jdbc:mariadb://localhost:3306/studydb?user=study&password=1111");
        java.sql.Statement stmt = con.createStatement();
        // 역순으로 출력해야 최신순으로 출력된다.
        java.sql.ResultSet rs = stmt.executeQuery("select * from x_board order by board_id desc")){ 

      
      System.out.println("번호, 제목, 등록일, 조회수");
      
      while (rs.next()) {
        System.out.printf("%d, %s, %s, %d\n",
            rs.getInt("board_id"), rs.getString("title"), rs.getDate("created_date"), rs.getInt("view_count"));
      }
      
    } catch (Exception e) {
      e.printStackTrace();
    } 
  }
}
