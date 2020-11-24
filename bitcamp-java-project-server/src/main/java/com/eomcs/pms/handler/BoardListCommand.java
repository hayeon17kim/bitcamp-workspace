package com.eomcs.pms.handler;

import java.io.IOException;
<<<<<<< HEAD
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.eomcs.pms.domain.Board;
import com.eomcs.pms.service.BoardService;

@WebServlet("/board/list")
public class BoardListCommand extends HttpServlet {
  private static final long serialVersionUID = 1L;

  @Override
  public void service(HttpServletRequest request, HttpServletResponse response)
      throws ServletException, IOException {

    ServletContext ctx = request.getServletContext();
    BoardService boardService =
        (BoardService) ctx.getAttribute("boardService");

    response.setContentType("text/html;charset=UTF-8");
    PrintWriter out = response.getWriter();

    out.println("<!DOCTYPE html>");
    out.println("<html>");
    try {
      out.println("<head><title>게시글목록</title></head>");
      out.println("<body><h1>게시글목록</h1></body>");

      List<Board> list = boardService.list();

      out.println("<body>");
      
      out.println("<table><tr>");
      out.println("<th>번호</th><th>제목</th><th>작성자</th><th>등록일</th><th>조회수</th>");
      out.println("</tr>");
      for (Board board : list) {
        out.printf("<td>%d</td><td>%s</td><td>%s</td><td>%s</td><td>%d</td>\n",
            board.getNo(),
            board.getTitle(),
            board.getWriter().getName(),
            board.getRegisteredDate(),
            board.getViewCount());
        out.println("</tr>");
      }
      out.println("<table>");
      
    } catch (Exception e) {
      out.printf("작업 처리 중 오류 발생! - %s\n", e.getMessage());
      e.printStackTrace();
    }
    out.println("</body>");
    out.println("</html>");
=======
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
    
    
>>>>>>> b2246385c7ae9f527ca04b18fce4ea5b337d8508
  }

}
