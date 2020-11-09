package com.eomcs.pms.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import com.eomcs.pms.domain.Member;
import com.eomcs.pms.domain.Task;

public interface TaskDao {
  
  
  public int insert(Task task) throws Exception;
  public int delete(int no) throws Exception;
  public Task findByNo(int no) throws Exception;

  public List<Task> findAll() throws Exception;

  public int update(Task task) throws Exception;
}
