package com.eomcs.pms.web;

import java.util.List;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import com.eomcs.pms.domain.Board;
import com.eomcs.pms.service.BoardService;

@Controller
public class BoardListController  {
  BoardService boardService;

  public BoardListController(BoardService boardService) {
    this.boardService =boardService;
  }

  @RequestMapping("/board/list")
  public String execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
    response.setContentType("text/html;charset=UTF-8");
    String keyword = request.getParameter("keyword");
    List<Board> list = boardService.list(keyword);

    // 서비스 객체를 통해 가져온 게시물 목록을 JSP가 사용할 수 있도록
    // ServletRequest 보관소에 저장한다.
    request.setAttribute("list", list);

    // 어떤 JSP를 실행해야 하는지 프론트 컨트롤러에게 알려준다.
    return "/board/list.jsp";
  }
}
