package com.eomcs.pms.handler;

import java.io.IOException;
import javax.servlet.GenericServlet;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import com.eomcs.pms.domain.Board;
import com.eomcs.pms.service.BoardService;

@CommandAnno("/board/list")
public class BoardListCommand extends GenericServlet {

  private static final long serialVersioUID = 1L;
    @Override
    public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {
  
  
    ServletContext ctx = request.getServletContext();
    ctx.getAttribute("boardService");
    BoardService boardService = (BaordService) ctx.getAttribute("boardService");
    try {
    out.println("[게시물 목록]");

    // 전체 목록을 조회할 때 `Iterator` 객체를 사용한다.
    // 만약 목록의 일부만 조회하면다면 인덱스를 직접 다루는 이전 방식을 사용해야 한다.
    out.println("번호, 제목, 작성자, 작성일, 조회수");
    for (Board board : boardService.list()) {
      out.printf("%d, %s, %s, %s, %d\n",
          board.getNo(),
          board.getTitle(),
          board.getWriter().getName(),
          board.getRegisteredDate(),
          board.getViewCount());
      }  
    } catch (Exception e) {
      out.printf("작업 처리 중 오류 발생! -%s\n", e.getMessage());
    }
    
    
  }

}
