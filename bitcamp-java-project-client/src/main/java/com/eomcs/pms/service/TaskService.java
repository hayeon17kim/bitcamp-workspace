package com.eomcs.pms.service;

import java.util.List;
import java.util.Map;
import com.eomcs.pms.domain.Task;

public interface TaskService {
  List<Task> list(int projectNo) throws Exception;
  int insert(Task task) throws Exception;
  int delete(int no) throws Exception;
  Task get(int no) throws Exception;
  List<Task> list() throws Exception;
  int update(Task task) throws Exception;
}
