package com.eomcs.pms.handler;

import java.io.BufferedReader;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.List;
<<<<<<< HEAD
=======
import java.util.Map;
>>>>>>> b2246385c7ae9f527ca04b18fce4ea5b337d8508
import com.eomcs.pms.domain.Member;
import com.eomcs.pms.domain.Project;
import com.eomcs.pms.service.ProjectService;
import com.eomcs.util.Prompt;

@CommandAnno("/project/detailSearch")
public class ProjectDetailSearchCommand implements Command {

  ProjectService projectService;

  public ProjectDetailSearchCommand(ProjectService projectService) {
    this.projectService = projectService;
  }

  @Override
  public void execute(Request request) {
    PrintWriter out = request.getWriter();
<<<<<<< HEAD
    BufferedReader in = request.getReader();

=======
>>>>>>> b2246385c7ae9f527ca04b18fce4ea5b337d8508
    out.println("[프로젝트 상세 검색]");

    try {
      HashMap<String,Object> keywords = new HashMap<>();

<<<<<<< HEAD
      String title = Prompt.inputString("프로젝트명? ", out, in);
=======
      String title = Prompt.inputString("프로젝트명? ");
>>>>>>> b2246385c7ae9f527ca04b18fce4ea5b337d8508
      if (title.length() > 0) {
        keywords.put("title", title);
      }

<<<<<<< HEAD
      String owner = Prompt.inputString("관리자명? ", out, in);
=======
      String owner = Prompt.inputString("관리자명? ");
>>>>>>> b2246385c7ae9f527ca04b18fce4ea5b337d8508
      if (owner.length() > 0) {
        keywords.put("owner", owner);
      }

<<<<<<< HEAD
      String member = Prompt.inputString("팀원명? ", out, in);
=======
      String member = Prompt.inputString("팀원명? ");
>>>>>>> b2246385c7ae9f527ca04b18fce4ea5b337d8508
      if (member.length() > 0) {
        keywords.put("member", member);
      }

      List<Project> list = projectService.list(keywords);
      out.println("번호, 프로젝트명, 시작일 ~ 종료일, 관리자, 팀원");

      for (Project project : list) {
        StringBuilder members = new StringBuilder();
        for (Member m : project.getMembers()) {
          if (members.length() > 0) {
            members.append(",");
          }
          members.append(m.getName());
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
<<<<<<< HEAD
      out.printf("작업 처리 중 오류 발생! - %s\n", e.getMessage());
=======
      out.println("프로젝트 목록 조회 중 오류 발생!");
>>>>>>> b2246385c7ae9f527ca04b18fce4ea5b337d8508
      e.printStackTrace();
    }
  }
}
