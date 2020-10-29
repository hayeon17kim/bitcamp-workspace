package com.eomcs.jdbc.ex1;

import java.sql.Connection;
import java.sql.DriverManager;

public class Exam0321 {
  public static void main(String[] args) {
    try (Connection con = DriverManager.getConnection("jdbc:mariadb://localhost:3306/studydb?user=study&password=1111");
        java.sql.Statement stmt = con.createStatement();
        // 역순으로 출력해야 최신순으로 출력된다.
        java.sql.ResultSet rs = stmt.executeQuery("select * from x_board order by board_id desc")){ 

      // 한 레코드를 가져오고, 가져올 게 없다면 false를 리턴.
      boolean isReceived = rs.next();
      
      if (isReceived) {
        System.out.printf("%d, %s, %s, %s, %d\n",
            rs.getInt(1), rs.getString(2), rs.getString(3), rs.getDate(4), rs.getInt(5));
      }
      
    } catch (Exception e) {
      e.printStackTrace();
    } 
  }
}
