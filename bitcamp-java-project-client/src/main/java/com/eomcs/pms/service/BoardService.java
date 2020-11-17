package com.eomcs.pms.service;

import java.util.List;
import com.eomcs.pms.domain.Board;

public interface BoardService {
  int add(Board board) throws Exception;

  List<Board> list(String keyword) throws Exception;
  int delete(int no) throws Exception;

  Board get(int no)throws Exception;

  int update(Board board)throws Exception;
}
