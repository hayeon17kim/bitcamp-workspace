package com.eomcs.pms.service;

import java.util.List;
import com.eomcs.pms.dao.BoardDao;
import com.eomcs.pms.domain.Board;

public class DefaultBoardService implements BoardService {
  BoardDao boardDao;
  public DefaultBoardService(BoardDao boardDao) {
    this.boardDao = boardDao;
  }
  @Override
  public int add(Board board) throws Exception {
    return  boardDao.insert(board);
  }
  
  @Override
  public List<Board> list(String keyword) throws Exception {
    return boardDao.findAll(keyword);
  }
  @Override
  public int delete(int no) throws Exception {
    return boardDao.delete(no);
  }
  @Override
  public Board get(int no) throws Exception {
    return boardDao.findByNo(no);
  }
  @Override
  public int update(Board board) throws Exception {
    return boardDao.update(board);
  }
}
