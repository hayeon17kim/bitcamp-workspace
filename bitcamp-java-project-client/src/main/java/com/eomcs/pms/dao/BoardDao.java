package com.eomcs.pms.dao;

import java.util.List;
import com.eomcs.pms.domain.Board;

public interface BoardDao {

  public int insert(Board board) throws Exception;

  public int delete(int no) throws Exception;

  public Board findByNo(int no) throws Exception;

  public List<Board> findAll() throws Exception;

  public int update(Board board) throws Exception;
}

