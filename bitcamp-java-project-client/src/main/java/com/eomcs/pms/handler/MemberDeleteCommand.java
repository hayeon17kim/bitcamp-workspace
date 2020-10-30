package com.eomcs.pms.handler;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.List;
import com.eomcs.pms.domain.Member;
import com.eomcs.util.Prompt;

public class MemberDeleteCommand implements Command {

  List<Member> memberList;

  public MemberDeleteCommand(List<Member> list) {
    this.memberList = list;
  }

  @Override
  public void execute() {
    System.out.println("[회원 삭제]");
    int no = Prompt.inputInt("번호? ");

    try (Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/studydb?user=study&password=1111");
        PreparedStatement stmt = con.prepareStatement("delete from pms_member where no="+ no)) {
      int count = stmt.executeUpdate();
    } catch (Exception e) {
      
    }
    
    
    String response = Prompt.inputString("정말 삭제하시겠습니까?(y/N) ");
    if (!response.equalsIgnoreCase("y")) {
      System.out.println("회원 삭제를 취소하였습니다.");
      return;
    }



    memberList.remove(index);
    System.out.println("회원을 삭제하였습니다.");
  }


}
