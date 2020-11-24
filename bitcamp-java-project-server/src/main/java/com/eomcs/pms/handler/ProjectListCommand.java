package com.eomcs.pms.handler;

<<<<<<< HEAD
import java.io.PrintWriter;
import java.util.List;
=======
import java.io.BufferedReader;
import java.io.PrintWriter;
import java.util.List;
import java.util.Map;
>>>>>>> b2246385c7ae9f527ca04b18fce4ea5b337d8508
import com.eomcs.pms.domain.Member;
import com.eomcs.pms.domain.Project;
import com.eomcs.pms.service.ProjectService;

@CommandAnno("/project/list")
public class ProjectListCommand implements Command {

  ProjectService projectService;

  public ProjectListCommand(ProjectService projectService) {
    this.projectService = projectService;
  }

  @Override
  public void execute(Request request) {
    PrintWriter out = request.getWriter();

<<<<<<< HEAD
    out.println("[프로젝트 목록]");

=======
>>>>>>> b2246385c7ae9f527ca04b18fce4ea5b337d8508
    try {
      List<Project> list = projectService.list();
      out.println("번호, 프로젝트명, 시작일 ~ 종료일, 관리자, 팀원");

      for (Project project : list) {
        StringBuilder members = new StringBuilder();
        for (Member member : project.getMembers()) {
          if (members.length() > 0) {
            members.append(",");
          }
          members.append(member.getName());
        }

        out.printf("%d, %s, %s ~ %s, %s, [%s]\n",
            project.getNo(),
            project.getTitle(),
            project.getStartDate(),
            project.getEndDate(),
            project.getOwner().getName(),
            members.toString());
      }
    } catch (Exception e) {
      out.printf("작업 처리 중 오류 발생! - %s\n", e.getMessage());
      e.printStackTrace();
    }
  }
}
