package com.eomcs.pms.handler;

import java.io.BufferedReader;
import java.io.PrintWriter;
<<<<<<< HEAD
=======
import java.util.Map;
>>>>>>> b2246385c7ae9f527ca04b18fce4ea5b337d8508
import com.eomcs.pms.service.TaskService;
import com.eomcs.util.Prompt;

@CommandAnno("/task/delete")
public class TaskDeleteCommand implements Command {

  TaskService taskService;

  public TaskDeleteCommand(TaskService taskService) {
    this.taskService = taskService;
  }

  @Override
  public void execute(Request request) {
    PrintWriter out = request.getWriter();
    BufferedReader in = request.getReader();
<<<<<<< HEAD

    try {
      out.println("[작업 삭제]");
=======
    out.println("[작업 삭제]");

    try  {
>>>>>>> b2246385c7ae9f527ca04b18fce4ea5b337d8508
      int no = Prompt.inputInt("번호? ", out, in);

      String response = Prompt.inputString("정말 삭제하시겠습니까?(y/N) ", out, in);
      if (!response.equalsIgnoreCase("y")) {
        out.println("작업 삭제를 취소하였습니다.");
        return;
      }
<<<<<<< HEAD

      if (taskService.delete(no) == 0) {
        out.println("해당 번호의 작업이 존재하지 않습니다.");
        return ;
      }

      out.println("작업을 삭제하였습니다.");

    } catch (Exception e) {
      out.printf("작업 처리 중 오류 발생! - %s\n", e.getMessage());
=======

      if (taskService.delete(no) == 0) {
        out.println("해당 번호의 작업이 존재하지 않습니다.");
      } else {
        out.println("작업을 삭제하였습니다.");
      }

    } catch (Exception e) {
      out.println("작업 삭제 중 오류 발생!");
>>>>>>> b2246385c7ae9f527ca04b18fce4ea5b337d8508
      e.printStackTrace();
    }
  }
}
