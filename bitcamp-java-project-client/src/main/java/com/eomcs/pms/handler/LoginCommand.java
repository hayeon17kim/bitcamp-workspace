package com.eomcs.pms.handler;

import java.util.Map;
import com.eomcs.pms.dao.MemberDao;
import com.eomcs.pms.domain.Member;
import com.eomcs.util.Prompt;

// Command 규칙에 따라 클래스를 정의한다. 
public class LoginCommand implements Command {

  MemberDao memberDao;

  public LoginCommand(MemberDao memberDao) {
    this.memberDao = memberDao;
  }

  @Override
  public void execute(Map<String,Object> context) {

    Member member = (Member) context.get("loginUser");
    if (member != null) {
      System.out.println("이미 로그인되어 있습니다.");
      return;
    }

    System.out.println("[로그인]");
    String email = Prompt.inputString("이메일? ");
    String password = Prompt.inputString("암호? ");

    try {
      member = memberDao.findByEmailPassword(email, password);

      if (member == null) {
        System.out.println("사용자 정보가 맞지 않습니다.");
      } else {
        context.put("loginUser", member);
        System.out.printf("%s님 반갑습니다.\n", member.getName());
      }

    } catch (Exception e) {
      System.out.println("로그인 중 오류 발생!");
      e.printStackTrace();
    }
  }
}
