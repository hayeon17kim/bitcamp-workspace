package com.eomcs.jdbc.ex2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class Exam0220 {
  public static void main(String[] args) throws Exception{
    String title = null;
    String contents = null;
    String no = null;
    try (Scanner keyScan = new Scanner(System.in)) {
      System.out.print("번호? ");
      no = keyScan.nextLine();
      
      System.out.print("제목? ");
      title = keyScan.nextLine();
      
      System.out.print("내용? ");
      contents = keyScan.nextLine();
      
      System.out.print("입력하시겠습니까? (Y/n)");
      String input=  keyScan.nextLine();
    
      if (!input.equalsIgnoreCase("y") && input.length() != 0) {
        System.out.println("등록을 취소하였습니다.");
        return;
      }
    }
    
    try (Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/studydb?user=study&study&password=1111");
        PreparedStatement stmt = con.prepareStatement("update x_board set title=?, contents=? where board_id= ?")) {
      
      stmt.setString(1,  title);
      stmt.setString(2, contents);
      stmt.setString(3,  no); // int컬럼의 값을 setString()으로 설정할 수 있다.
      
      int count = stmt.executeUpdate();
      if (count == 0) {
        System.out.println("해당 번호의 게시물이 존재하지 않습니다.");
      } else {
        System.out.printf("변경하였습니다!");        
      }
    }
  }
}
