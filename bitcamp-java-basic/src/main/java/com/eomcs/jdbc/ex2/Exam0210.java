package com.eomcs.jdbc.ex2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import java.util.Scanner;

public class Exam0210 {
  public static void main(String[] args) throws Exception{
    String title = null;
    String contents = null;
    ArrayList<String> files = new ArrayList<>();
    try (Scanner keyScan = new Scanner(System.in)) {

      System.out.print("제목? ");
      title = keyScan.nextLine();
      
      System.out.print("내용? ");
      contents = keyScan.nextLine();
      
      // 사용자로부터 첨부 파일 입력받기
      while (true) {
        System.out.print("첨부파일:(완료는 그냥 엔터) ");
        String file = keyScan.nextLine();
        if (file.length() == 0) {
          break;
        }
        files.add(file);   
      }
      
      System.out.print("입력하시겠습니까? (Y/n)");
      String input=  keyScan.nextLine();
    
      if (!input.equalsIgnoreCase("y") && input.length() != 0) {
        System.out.println("등록을 취소하였습니다.");
        return;
      }
    }
    
    try (Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/studydb?user=study&study&password=1111");
        
        // 게시글 입력 처리 객체
        PreparedStatement boardStmt = con.prepareStatement(
            "insert into x_board(title, contents) values(?,?)");
        // 첨부파일 입력 처리 객체
        PreparedStatement fileStmt = con.prepareStatement(
            "insert into x_board_file(file_path, board_id) values(?, ?)")) {
      // 게시글 입력
      boardStmt.setString(1,  title);
      boardStmt.setString(2, contents);
      int count = boardStmt.executeUpdate();
      System.out.printf("%d개 게시글 입력 성공!", count);
      
      
      int fileCount = 0;
      // 첨부파일 입력
      for (String filename : files) {
        fileStmt.setString(1, filename);
        fileStmt.setInt(2, 0);
        fileStmt.executeUpdate();
        fileCount++;
      }
      System.out.printf("%d개 첨부파일 입력 성공!", fileCount);
      if (count == 0) {
        System.out.println("해당 번호의 게시물이 존재하지 않습니다.");
      } else {
        System.out.printf("변경하였습니다!");        
      }
    }
  }
}
