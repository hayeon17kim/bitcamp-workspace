package com.eomcs.pms.handler;

<<<<<<< HEAD
=======
import java.io.BufferedReader;
>>>>>>> b2246385c7ae9f527ca04b18fce4ea5b337d8508
import java.io.PrintWriter;
import java.util.Map;
import com.eomcs.pms.domain.Member;

<<<<<<< HEAD
=======
// Command 규칙에 따라 클래스를 정의한다.
>>>>>>> b2246385c7ae9f527ca04b18fce4ea5b337d8508
@CommandAnno("/logout")
public class LogoutCommand implements Command {

  @Override
  public void execute(Request request) {
    PrintWriter out = request.getWriter();
<<<<<<< HEAD
    Map<String,Object> session = request.getSession();

=======
    Map<String, Object> session = request.getSession();
>>>>>>> b2246385c7ae9f527ca04b18fce4ea5b337d8508
    Member loginUser = (Member) session.get("loginUser");
    if (loginUser == null) {
      out.println("로그인 된 상태가 아닙니다!");
      return;
    }

    out.printf("%s 님 안녕히 가세요!\n", loginUser.getName());

    request.invalidateSession();
  }
}
