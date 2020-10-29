package com.eomcs.jdbc.ex2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.Scanner;

public class Exam0110 {
  public static void main(String[] args) throws Exception{
    String title = null;
    String contents = null;
    try (Scanner keyScan = new Scanner(System.in)) {
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
        Statement stmt = con.createStatement();) {
      String sql = String.format("insert into x_board(title,contents) values('%s','%s')", title, contents);
      int count = stmt.executeUpdate(sql);
      System.out.printf("%d개 입력하셨습니다!", count);
    }
  }
}
