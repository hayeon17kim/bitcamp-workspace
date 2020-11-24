package com.eomcs.pms.handler;

import java.io.BufferedReader;
import java.io.PrintWriter;
<<<<<<< HEAD
=======
import java.util.List;
import java.util.Map;
import com.eomcs.pms.domain.Project;
import com.eomcs.pms.service.MemberService;
>>>>>>> b2246385c7ae9f527ca04b18fce4ea5b337d8508
import com.eomcs.pms.service.ProjectService;
import com.eomcs.util.Prompt;

@CommandAnno("/project/delete")
public class ProjectDeleteCommand implements Command {

  ProjectService projectService;

  public ProjectDeleteCommand(ProjectService projectService) {
    this.projectService = projectService;
  }

  @Override
  public void execute(Request request) {
    PrintWriter out = request.getWriter();
    BufferedReader in = request.getReader();
<<<<<<< HEAD

    try {
      out.println("[프로젝트 삭제]");
      int no = Prompt.inputInt("번호? ", out, in);

=======
    try {
      out.println("[프로젝트 삭제]");
      int no = Prompt.inputInt("번호? ", out, in);
      
>>>>>>> b2246385c7ae9f527ca04b18fce4ea5b337d8508
      String response = Prompt.inputString("정말 삭제하시겠습니까?(y/N) ", out, in);
      if (!response.equalsIgnoreCase("y")) {
        out.println("프로젝트 삭제를 취소하였습니다.");
        return;
      }
<<<<<<< HEAD

      if (projectService.delete(no) == 0) {
        out.println("해당 번호의 프로젝트가 없습니다.");
        return;
      }

=======
      
      if (projectService.delete(no) == 0) {
        out.println("해당 번호의 프로젝트가 없습니다.");
        return;        
      }
>>>>>>> b2246385c7ae9f527ca04b18fce4ea5b337d8508
      out.println("프로젝트를 삭제하였습니다.");

    } catch (Exception e) {
      out.printf("작업 처리 중 오류 발생! - %s\n", e.getMessage());
<<<<<<< HEAD
      e.printStackTrace();
=======
>>>>>>> b2246385c7ae9f527ca04b18fce4ea5b337d8508
    }
  }
}
