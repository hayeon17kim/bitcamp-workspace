package com.eomcs.pms.service;

import java.util.List;
import java.util.Map;
import com.eomcs.pms.dao.ProjectDao;
import com.eomcs.pms.dao.TaskDao;
import com.eomcs.pms.domain.Project;
import com.eomcs.util.SqlSessionFactoryProxy;

public class DefaultProjectService implements ProjectService{
  TaskDao taskDao;
  ProjectDao projectDao;
  SqlSessionFactoryProxy factoryProxy;

  public DefaultProjectService(TaskDao taskDao, ProjectDao projectDao, SqlSessionFactoryProxy factoryProxy) {
    this.taskDao = taskDao;
    this.projectDao = projectDao;
    this.factoryProxy = factoryProxy;
  }

  @Override
  public int delete(int no) throws Exception {
    try {
      factoryProxy.startTransaction();
      taskDao.deleteByProjectNo(no);
      projectDao.deleteMembers(no);
      int count  = projectDao.delete(no);
      factoryProxy.commit();
      return count;

    } catch (Exception e) {
      factoryProxy.rollback();
      throw e; // 서비스 객체에서 발생한 예외는 호출자에게 전달한다.
    } finally {
      factoryProxy.endTransaction();
    }
  }

  @Override
  public int add(Project project) throws Exception {
    try {
      factoryProxy.startTransaction();
      projectDao.insert(project);      
      System.out.println(project.getMembers().size());
      if (project.getMembers().size() != 0) {
        projectDao.insertMembers(project);
      }
      factoryProxy.commit();
      return 1;
    } catch (Exception e) {
      factoryProxy.rollback();
      throw e; // 서비스 객체에서 발생한 예외는 호출자에게 전달한다.
    } finally {
      factoryProxy.endTransaction();
    }
  }
  
  public List<Project> list(String keyword) throws Exception {
    return projectDao.findAll(keyword);
  }
  
  public List<Project> list(Map<String, Object> keywords) throws Exception {
    return projectDao.findByDetailKeyword(keywords);
  }

  @Override
  public Project get(int no) throws Exception {
    return projectDao.findByNo(no);
  }

  @Override
  public int update(Project project) throws Exception {
    return projectDao.update(project);
  }
}
