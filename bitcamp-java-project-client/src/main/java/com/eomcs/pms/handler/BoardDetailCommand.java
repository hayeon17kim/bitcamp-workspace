package com.eomcs.pms.handler;

import java.util.Map;
import com.eomcs.pms.dao.BoardDao;
import com.eomcs.pms.domain.Board;
import com.eomcs.pms.service.BoardService;
import com.eomcs.util.Prompt;

public class BoardDetailCommand implements Command {
  BoardService boardService;

  public BoardDetailCommand(BoardService boardService) {
    this.boardService = boardService;
  }

  @Override
  public void execute(Map<String,Object> context) {
    System.out.println("[게시물 상세보기]");
    int no = Prompt.inputInt("번호? ");

    try {
      Board board = boardService.get(no);
      if (board == null) {
        System.out.println("해당 번호의 게시물이 존재하지 않습니다.");
        return;
      }

      System.out.printf("제목: %s\n", board.getTitle());
      System.out.printf("내용: %s\n", board.getContent());
      System.out.printf("작성자: %s\n", board.getWriter().getName());
      System.out.printf("등록일: %s\n", board.getRegisteredDate());
      System.out.printf("조회수: %d\n", board.getViewCount());

    } catch (Exception e) {
      System.out.println("게시글 조회 중 오류 발생!");
      e.printStackTrace();
    }
  }
}
