package com.eomcs.pms.handler;

import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringWriter;
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
      out.printf("<p>작업 처리 중 오류 발생! - %s</p>\n", e.getMessage());
      StringWriter errOut = new StringWriter();
      e.printStackTrace(new PrintWriter(errOut));
      out.printf("<pre>%s</pre>\n", errOut.toString());
    }
    out.println("</body>");
    out.println("</html>");
  }

}
