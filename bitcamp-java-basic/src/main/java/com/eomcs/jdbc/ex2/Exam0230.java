package com.eomcs.jdbc.ex2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class Exam0230 {
  public static void main(String[] args) {

    int no = 0; // try 블럭 두 개에서 쓸려고
    try (Scanner keyScan = new Scanner(System.in)) { // Scanner 는 여기서만 쓰기 때문에 따로 선언
      System.out.print("번호? ");
      no = Integer.parseInt(keyScan.nextLine());
      
    }
    
    try (Connection con = DriverManager.getConnection("jdbc:mariadb://localhost:3306/studydb?user=study&password=1111");
        PreparedStatement stmt = con.prepareStatement("select * from x_board where board_id=?")){
        stmt.setInt(1, no);
        // 역순으로 출력해야 최신순으로 출력된다.
        java.sql.ResultSet rs = stmt.executeQuery();
      
      if (rs.next()) {
        System.out.printf("제목: %s\n",rs.getString("title"));
        System.out.printf("내용: %s\n",rs.getString("contents"));
        System.out.printf("등록일: %s\n",rs.getString("created_date"));
        System.out.printf("조회수: %s\n",rs.getString("view_count"));
      } else {
        System.out.println("해당 번호의 게시물이 존재하지 않습니다.");
      }
      
    } catch (Exception e) {
      e.printStackTrace();
    } 
  }
}
