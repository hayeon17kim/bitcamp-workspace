package com.eomcs.pms.handler;

import java.util.Map;
import com.eomcs.pms.domain.Member;

public class whoamiCommand implements Command {

  @Override
  public void execute(Map<String, Object> context)  {
    // TODO Auto-generated method stub

    Member loginUser = (Member) context.get("loginUser");
    if (loginUser == null) {
      System.out.println("로그인하지 않았습니다!");
      return;
    }

    System.out.printf("사용자번호: %s\n", loginUser.getNo());
    System.out.printf("이름: %s\n", loginUser.getName());
    System.out.printf("이메일: %s\n", loginUser.getEmail());
    System.out.printf("사진: %s\n", loginUser.getPhoto());
    System.out.printf("전화: %s\n", loginUser.getTel());
  }
}
