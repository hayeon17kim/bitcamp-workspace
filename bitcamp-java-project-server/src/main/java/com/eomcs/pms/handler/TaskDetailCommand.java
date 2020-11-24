package com.eomcs.pms.handler;

import java.io.BufferedReader;
import java.io.PrintWriter;
<<<<<<< HEAD
=======
import java.util.Map;
>>>>>>> b2246385c7ae9f527ca04b18fce4ea5b337d8508
import com.eomcs.pms.domain.Task;
import com.eomcs.pms.service.TaskService;
import com.eomcs.util.Prompt;

@CommandAnno("/task/detail")
public class TaskDetailCommand implements Command {

  TaskService taskService;

  public TaskDetailCommand(TaskService taskService) {
    this.taskService = taskService;
  }

  @Override
  public void execute(Request request) {
    PrintWriter out = request.getWriter();
    BufferedReader in = request.getReader();
<<<<<<< HEAD

    try {
      out.println("[작업 상세보기]");

      int no = Prompt.inputInt("번호? ", out, in);

      Task task = taskService.get(no);
      if (task == null) {
        out.println("해당 번호의 작업이 존재하지 않습니다.");
        return;
      }

      out.printf("내용: %s\n", task.getContent());
      out.printf("마감일: %s\n", task.getDeadline());

      String stateLabel = null;
      switch (task.getStatus()) {
        case 1:
          stateLabel = "진행중";
          break;
        case 2:
          stateLabel = "완료";
          break;
        default:
          stateLabel = "신규";
      }
=======
    out.println("[작업 상세보기]");

    try {
      int no = Prompt.inputInt("번호? ", out, in);

      Task task = taskService.get(no);
      if (task == null) {
        out.println("해당 번호의 작업이 존재하지 않습니다.");
        return;
      }

      out.printf("내용: %s\n", task.getContent());
      out.printf("마감일: %s\n", task.getDeadline());

      String stateLabel = null;
      switch (task.getStatus()) {
        case 1:
          stateLabel = "진행중";
          break;
        case 2:
          stateLabel = "완료";
          break;
        default:
          stateLabel = "신규";
      }
>>>>>>> b2246385c7ae9f527ca04b18fce4ea5b337d8508
      out.printf("상태: %s\n", stateLabel);
      out.printf("담당자: %s\n", task.getOwner().getName());

    } catch (Exception e) {
<<<<<<< HEAD
      out.printf("작업 처리 중 오류 발생! - %s\n", e.getMessage());
=======
      out.println("작업 조회 중 오류 발생!");
>>>>>>> b2246385c7ae9f527ca04b18fce4ea5b337d8508
      e.printStackTrace();
    }
  }
}
