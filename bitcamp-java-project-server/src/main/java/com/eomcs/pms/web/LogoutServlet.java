package com.eomcs.pms.web;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import com.eomcs.pms.domain.Member;

@Controller
public class LogoutServlet {

  @RequestMapping("/auth/logout")
  public String execute(HttpServletRequest request, HttpServletResponse response) throws Exception {

    // 클라이언트 전용 보관소(HttpSession)를 준비한다.
    HttpSession session = request.getSession();

    // 클라이언트로 데이터를 출력할 때 사용할 스트림 준비
    Member loginUser = (Member) session.getAttribute("loginUser");
    if (loginUser != null) {
      session.invalidate(); // 로그아웃을 요청한 클라이언트의 세션을 무효화시킨다.
    }

    response.setContentType("text/html;charset=UTF-8");
    request.setAttribute("loginUser", loginUser);
    return "/auth/logout.jsp";
  }
}
