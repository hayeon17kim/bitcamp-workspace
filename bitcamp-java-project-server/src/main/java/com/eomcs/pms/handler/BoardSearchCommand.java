package com.eomcs.pms.handler;

import java.io.BufferedReader;
import java.io.PrintWriter;
import java.util.List;
import java.util.Map;
import com.eomcs.pms.domain.Board;
import com.eomcs.pms.service.BoardService;
import com.eomcs.util.Prompt;
@CommandAnno("/board/search")
public class BoardSearchCommand implements Command {

  BoardService boardService;

  public BoardSearchCommand(BoardService boardService) {
    this.boardService = boardService;
  }

  @Override
  public void execute(Request request) {
    PrintWriter out = request.getWriter();
    BufferedReader in = request.getReader();
    try {
    out.println("[게시물 검색]");
    String keyword = Prompt.inputString("검색어? ", out, in);
    // 전체 목록을 조회할 때 `Iterator` 객체를 사용한다.
    // 만약 목록의 일부만 조회하면다면 인덱스를 직접 다루는 이전 방식을 사용해야 한다.
    out.println("번호, 제목, 작성자, 작성일, 조회수");
    for (Board board : boardService.list(keyword)) {
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
