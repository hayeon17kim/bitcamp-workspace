package com.eomcs.pms.handler;

import java.util.Map;
import com.eomcs.pms.dao.mariadb.BoardDaoImpl;
import com.eomcs.pms.dao.mariadb.MemberDaoImpl;
import com.eomcs.pms.domain.Board;
import com.eomcs.pms.domain.Member;
import com.eomcs.util.Prompt;

public class BoardAddCommand implements Command {

  BoardDaoImpl boardDao;
  MemberDaoImpl memberDao;

  public BoardAddCommand(BoardDaoImpl boardDao, MemberDaoImpl memberDao) {
    this.boardDao = boardDao;
    this.memberDao = memberDao;
  }

  @Override
  public void execute(Map<String,Object> context) {
    System.out.println("[게시물 등록]");

try {
  Board board = new Board();
  board.setTitle(Prompt.inputString("제목? "));
board.setContent(Prompt.inputString("내용? "));

Member loginUser =(Member) context.get("loginUser");
board.setWriter(loginUser);

boardDao.insert(board);
System.out.println("게시글을 등록하였습니다.");

} catch (Exception e) {
  System.out.println("게시글 등록 중 오류 발생!");
      e.printStackTrace();
    }
  }
}
