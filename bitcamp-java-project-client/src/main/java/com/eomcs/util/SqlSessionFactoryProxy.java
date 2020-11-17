package com.eomcs.util;

import java.sql.Connection;
import org.apache.ibatis.session.Configuration;
import org.apache.ibatis.session.ExecutorType;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.TransactionIsolationLevel;

public class SqlSessionFactoryProxy implements SqlSessionFactory {

  SqlSessionFactory original;
  boolean inTransaction = false;
  SqlSessionProxy currentSqlSession;
  
  public SqlSessionFactoryProxy(SqlSessionFactory original) {
    // 생성자에서 원래의 구현체를 받아 보관해둔다.
    this.original = original;
  }
  
  // 기존 클래스에 없는 메서드를 추가한다.
  public void startTransaction() {
    inTransaction = true;
  }
  
  public void endTransaction() {
    inTransaction = false;
    
    // 이전에 commit()/rollback()을 호출하여 트랜잭션을 종료한 상태라면
    // 다음 작업을 수행할 필요가 없다.
    if (currentSqlSession != null) {
      // 트랜잭션을 종료할 때 진짜 SqlSession 객체를 닫는다.
      currentSqlSession.realClose();
    }
    currentSqlSession = null;
    // 트랜잭션을 종료할 때 진짜 SqlSession 객체를 닫는다.
  }
  

  public SqlSession openSession() {
    if (inTransaction) {
      if (currentSqlSession == null) {    
        // 트랜잭션이 시작 중일 때는 수동 커밋 상태의 SqlSession을 만든다.
        // 나중에 다시 쓸 수 있도록 보관해둔다.
        currentSqlSession = new SqlSessionProxy(original.openSession());
        return currentSqlSession;
      }
      // 기존에 만든 SqlSession을 리턴해준다.
      // 왜? 같은 SqlSession을 리턴해줘야 여러 작업을 한 트랜잭션으로 묶을 수 있다.
      return currentSqlSession;
    }
    // 트랜잭션이 시작 중이 아닐 때는 자동 커밋 상태의 SqlSession을 리턴한다.
    // 따로 보관해두지 않는다. 
    return original.openSession(true);
  }

  public void commit() {
    // 같은 SqlSession을 사용하여 수행한 모든 작업을 commit한다.
    if (currentSqlSession != null) {
      currentSqlSession.commit();
    }
    endTransaction();
  }
  
  public void rollback() {
    // 같은 SqlSession을 사용하여 수행한 모든 작업을 rollback한다.
    if (currentSqlSession != null) {
      currentSqlSession.rollback();
    }
    endTransaction();
  }
  
  public SqlSession openSession(boolean autoCommit) {
    return original.openSession(autoCommit);
  }

  public SqlSession openSession(Connection connection) {
    return original.openSession(connection);
  }

  public SqlSession openSession(TransactionIsolationLevel level) {
    return original.openSession(level);
  }

  public SqlSession openSession(ExecutorType execType) {
    return original.openSession(execType);
  }

  public SqlSession openSession(ExecutorType execType, boolean autoCommit) {
    return original.openSession(execType, autoCommit);
  }

  public SqlSession openSession(ExecutorType execType, TransactionIsolationLevel level) {
    return original.openSession(execType, level);
  }

  public SqlSession openSession(ExecutorType execType, Connection connection) {
    return original.openSession(execType, connection);
  }

  public Configuration getConfiguration() {
    return original.getConfiguration();
  }
  
}
