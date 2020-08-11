package com.eomcs.pms.handler;

import java.sql.Date;
import com.eomcs.util.Prompt;

public class ProjectHandler {
  
  static class Project {
    int no;
    String title;
    String content;
    Date startDate;
    Date endDate;
    String owner;
    String members;
    static final int LENGTH = 100;
    static Project[] list = new Project[LENGTH];
    static int size;
  }
  
  public static void add() {
    Project p = new Project();
    
    System.out.println("[프로젝트 등록]");
    
    p.no = Prompt.inputInt("번호? ");
    p.title = Prompt.inputString("프로젝트명? ");
    p.content = Prompt.inputString("내용? ");
    p.startDate = Prompt.inputDate("시작일? ");
    p.endDate = Prompt.inputDate("종료일? ");
    p.owner = Prompt.inputString("만든이? ");
    p.members = Prompt.inputString("팀원? ");

    Project.list[Project.size++] = p;
  }
  
  public static void list() {
    System.out.println("[프로젝트 목록]");
    
    for (int i = 0; i < Project.size; i++) {
      Project p = Project.list[i];
      // 번호, 프로젝트명, 시작일, 종료일, 만든이
      System.out.printf("%d, %s, %s, %s, %s\n", // 출력 형식 지정
          p.no, p.title, p.startDate, p.endDate, p.owner);
    }
  }
}
