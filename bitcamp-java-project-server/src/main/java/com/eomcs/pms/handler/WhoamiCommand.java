package com.eomcs.pms.handler;

<<<<<<< HEAD
=======
import java.io.BufferedReader;
>>>>>>> b2246385c7ae9f527ca04b18fce4ea5b337d8508
import java.io.PrintWriter;
import java.util.Map;
import com.eomcs.pms.domain.Member;

<<<<<<< HEAD
@CommandAnno("/whoami")
=======

@CommandAnno("/whoami")
// Command 규칙에 따라 클래스를 정의한다.
>>>>>>> b2246385c7ae9f527ca04b18fce4ea5b337d8508
public class WhoamiCommand implements Command {

  @Override
  public void execute(Request request) {
    PrintWriter out = request.getWriter();
<<<<<<< HEAD
    Map<String,Object> session = request.getSession();

    Member member = (Member) session.get("loginUser");
=======
    BufferedReader in = request.getReader();
    Map<String, Object> session = request.getSession();
    
    Member member = (Member) session.get("loginUser");
    
>>>>>>> b2246385c7ae9f527ca04b18fce4ea5b337d8508
    if (member == null) {
      out.println("로그인 하지 않았습니다!");
      return;
    }
    out.printf("사용자 번호: %d\n", member.getNo());
    out.printf("이름: %s\n", member.getName());
    out.printf("이메일: %s\n", member.getEmail());
    out.printf("사진: %s\n", member.getPhoto());
    out.printf("전화: %s\n", member.getTel());
    out.printf("등록일: %s\n", member.getRegisteredDate());
  }
}
