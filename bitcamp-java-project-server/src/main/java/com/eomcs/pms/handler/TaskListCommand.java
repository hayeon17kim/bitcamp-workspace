package com.eomcs.pms.handler;

<<<<<<< HEAD
=======
import java.io.BufferedReader;
>>>>>>> b2246385c7ae9f527ca04b18fce4ea5b337d8508
import java.io.PrintWriter;
import java.util.List;
import java.util.Map;
import com.eomcs.pms.domain.Task;
import com.eomcs.pms.service.TaskService;
<<<<<<< HEAD

=======
>>>>>>> b2246385c7ae9f527ca04b18fce4ea5b337d8508
@CommandAnno("/task/list")
public class TaskListCommand implements Command {

  TaskService taskService;

  public TaskListCommand(TaskService taskService) {
    this.taskService = taskService;
  }
  @Override
  public void execute(Request request) {
    PrintWriter out = request.getWriter();
<<<<<<< HEAD

=======
>>>>>>> b2246385c7ae9f527ca04b18fce4ea5b337d8508
    out.println("[작업 목록]");

    try {
      List<Task> list = taskService.list();
      out.println("번호, 작업내용, 마감일, 작업자, 상태");

      for (Task task : list) {
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
        out.printf("%d, %s, %s, %s, %s\n",
            task.getNo(),
            task.getContent(),
            task.getDeadline(),
            task.getOwner().getName(),
            stateLabel);
      }
    } catch (Exception e) {
<<<<<<< HEAD
      out.printf("작업 처리 중 오류 발생! - %s\n", e.getMessage());
=======
      out.println("작업 목록 조회 중 오류 발생!");
>>>>>>> b2246385c7ae9f527ca04b18fce4ea5b337d8508
      e.printStackTrace();
    }
  }
}
