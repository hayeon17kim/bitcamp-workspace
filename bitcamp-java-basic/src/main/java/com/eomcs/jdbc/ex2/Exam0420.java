package com.eomcs.jdbc.ex2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Scanner;

public class Exam0420 {
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
            "insert into x_board(title, contents) values(?,?)",
            Statement.RETURN_GENERATED_KEYS);
        // 첨부파일 입력 처리 객체
        PreparedStatement fileStmt = con.prepareStatement(
            "insert into x_board_file(file_path, board_id) values(?, ?)")) {
      // 게시글 입력
      boardStmt.setString(1,  title);
      boardStmt.setString(2, contents);
      int count = boardStmt.executeUpdate();
      System.out.printf("%d개 게시글 입력 성공!\n", count);
      
      // 위에서 입력한 게시글의 PK값을 알아내기
      ResultSet keysRS = boardStmt.getGeneratedKeys();
      keysRS.next(); // PK가 들어잇는 레코드를 한 개 가져온다. 
      int boardId = keysRS.getInt(1); // 레코드에서 컬럼 값을 꺼낸다.
      
      int fileCount = 0;
      // 첨부파일 입력
      for (String filename : files) {
        fileStmt.setString(1, filename);
        // 위에서 게시글 입력 후에 자동 생성된 PK값을 사용하여
        // 첨부파일의 데이터ㅡㄹ 입력할 때 설정한다.
        fileStmt.setInt(2, boardId);
        fileStmt.executeUpdate();
        fileCount++;
      }
      System.out.printf("%d개 첨부파일 입력 성공!\n", fileCount);
      if (count == 0) {
        System.out.println("해당 번호의 게시물이 존재하지 않습니다.");
      } else {
        System.out.printf("변경하였습니다!");        
      }
    }
  }
}
