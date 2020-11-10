package com.eomcs.pms.dao.mariadb;

import java.util.List;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import com.eomcs.pms.domain.Board;

// 역할
// - 게시글 데이터를 등록,조회,목록조회,변경,삭제 처리하는 일을 한다.
//


public class BoardDaoImpl implements com.eomcs.pms.dao.BoardDao{

  SqlSessionFactory sqlSessionFactory;

  public BoardDaoImpl(SqlSessionFactory sqlSessionFactory) {
    this.sqlSessionFactory = sqlSessionFactory;
  }

  @Override
  public int insert(Board board) throws Exception {
    try (SqlSession sqlSession = sqlSessionFactory.openSession(true)) {
      return sqlSession.insert("BoardDao.insert", board);
    }
  }

  @Override
  public int delete(int no) throws Exception {
    SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(
        Resources.getResourceAsStream("com/eomcs/pms/conf/mybatis-config.xml"));
    try (SqlSession sqlSession = sqlSessionFactory.openSession(true)) {
      return sqlSession.delete("BoardDao.delete", no);
    }
  }

  @Override
  public Board findByNo(int no) throws Exception {
    try (SqlSession sqlSession = sqlSessionFactory.openSession(true)) {

      Board board = sqlSession.selectOne("BoardDao.findByNo", no);
      sqlSession.update("BoardDao.updateViewCount", no);
      return board;
    }
  }

  @Override
  public List<Board> findAll() throws Exception {
    try (SqlSession sqlSession = sqlSessionFactory.openSession()) {
      return sqlSession.selectList("BoardDao.findAll");
    }
  }

  @Override
  public int update(Board board) throws Exception {
    try (SqlSession sqlSession = sqlSessionFactory.openSession(true)) {
      return sqlSession.update("BoardDao.update", board);
    }
  }
}








