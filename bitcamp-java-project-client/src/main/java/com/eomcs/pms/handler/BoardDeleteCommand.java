package com.eomcs.pms.handler;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.List;
import com.eomcs.pms.domain.Board;
import com.eomcs.util.Prompt;

public class BoardDeleteCommand implements Command {

  @Override
  public void execute() {
    System.out.println("[게시물 삭제]");
    int no = Prompt.inputInt("번호? ");
    try (Connection con = DriverManager.getConnection( //
        "jdbc:mysql://localhost:3306/studydb?user=study&password=1111");
        PreparedStatement stmt = con.prepareStatement( //
            "delete from pms_board where no=" + no)) {

      int count = stmt.executeUpdate();

      if (count == 0) {
        System.out.println("해당 번호의 게시물이 존재하지 않습니다.");
      } else {
        System.out.println("삭제하였습니다.");
      }
    } catch (Exception e) {
      System.out.println("게시글 삭제 중 오류 발생!");
      e.printStackTrace();
    }
  }

}
