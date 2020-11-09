package com.eomcs.pms.handler;

import java.util.Map;
import com.eomcs.pms.domain.Member;

public class LogoutCommand implements Command {

  @Override
  public void execute(Map<String,Object> context) {
    System.out.println("[로그아웃]");

    Member member = (Member) context.get("loginUser");

    if (member == null) {
      System.out.println("이미 로그아웃 되어 있습니다.");
      return;
    }
    context.remove("loginUser");
    System.out.printf("%s님 안녕히가세요.\n", member.getName());
  }
}
