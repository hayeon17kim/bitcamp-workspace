package com.eomcs.jdbc.ex2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Scanner;

public class Exam0510 {
  public static void main(String[] args){
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
      
      // 한 단위로 수행해야 할 작업이 있다면,
      // commit할 때까지 실제 테이블에 적용하지 않도록
      // auto commit을 취소하고 수동 커밋 상태로 만든다.
      

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
        // 첨부파일  테이블에 데이터를 입력하려면,
        // 게시글 번호를 알아야 한다.
        // 문제는 바로 위에서 입력한 게시글의 pk가 자동 생성되는 컬럼이기 때문에 
        // 입력한 후 그 PK 값이 뭔지 알 수가 없다는 것이다.
        // 그래서 첨부파일 테이블에 데이터를 입력할 수 없다!
        // 해결책! 데이터를 입력할 때 자동 생성된 PK값을 알 수 있다면 
        // 이 문제를 해결할 수 있다.
        fileStmt.executeUpdate();
        fileCount++;
      }
      System.out.printf("%d개 첨부파일 입력 성공!", fileCount);
      
      
      // 자식 테이블의 데이터까지 정상적으로 입력했다면, 
      // DBMS에게 작업 결과를 실제 테이블에 적용하라고 요청한다.
      con.commit();
    } catch (Exception e ) {
      
      // commit()을 호출하지 않으면 커넥션 객체를 닫을 때
      // DBMS는 그 커넥션을 통해 수행한 모든 작업을 
      // 취소한다.  
      
      
    }
  }
}
