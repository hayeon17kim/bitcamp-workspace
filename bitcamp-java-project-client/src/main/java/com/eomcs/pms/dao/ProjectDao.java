package com.eomcs.pms.dao;


import java.util.List;
import com.eomcs.pms.domain.Project;


public interface ProjectDao {
  public int insert(Project project) throws Exception;

  public int delete(int no) throws Exception;

  public Project findByNo(int no) throws Exception;

  public List<Project> findAll() throws Exception;

  public int update(Project project) throws Exception;
}