package com.eomcs.pms.handler;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import com.eomcs.util.Prompt;

public class MemberUpdateCommand implements Command {


  @Override
  public void execute() {
    System.out.println("[회원 변경]");
    int no = Prompt.inputInt("번호? ");
    
    String name = null;
    String password = null;
    String photo = null;
    String tel = null;
    
    try (Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/studydb?user=study&password=1111");
        PreparedStatement stmt = con.prepareStatement("select name, password, photo, tel"
            + " from pms_member"
            + " where no="+no);
        ResultSet rs = stmt.executeQuery())  {
      if (rs.next()) {
        name = rs.getString("name");
        password = rs.getString("password");
        photo = rs.getString("photo");
        tel = rs.getString("tel");
      } else {
        System.out.println("해당 번호의 회원이 없습니다!");
        return;
      }
      
      
    } catch (Exception e) {
      System.out.println("게시글 조회 중 오류 발생!");
      e.printStackTrace();
      return;
    }
    
    String response = Prompt.inputString("정말 변경하시겠습니까?(y/N) ");
    if (!response.equalsIgnoreCase("y")) {
      System.out.println("회원 변경을 취소하였습니다.");
      return;
    }
    
    try (Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/studydb?user=study&password=1111");
        PreparedStatement stmt = con.prepareStatement("update pms_member set name=?, password=?, photo=? tel=? where no=" + no)) {
      stmt.setString(1, name);
      stmt.setString(2, password);
      stmt.setString(3, photo);
      stmt.setString(4, tel);
      int count = stmt.executeUpdate();
      
      if (count == 0) {
        System.out.println("해당 번호의 회원이 없습니다!");
      } else {
        System.out.println("변경하였습니다.");
      }
    } catch (Exception e) {
      System.out.println("회원 변경 중 오류 발생!");
      e.printStackTrace();
    }

    System.out.println("회원을 변경하였습니다.");
  }

}
