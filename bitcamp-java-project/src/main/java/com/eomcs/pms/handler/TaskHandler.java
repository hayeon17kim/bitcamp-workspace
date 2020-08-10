package com.eomcs.pms.handler;

import java.sql.Date;
import com.eomcs.util.Prompt;

public class TaskHandler {
  
  // 작업 데이터
  static class Task {
    int no;
    String content;
    Date completedDate;
    String owner;
    int status;
    
    static final int LENGTH = 100;
    static Task[] list = new Task[LENGTH];
    static int size;
  }

  public static void add() {
    System.out.println("[작업 등록]");
    Task t = new Task();
    t.no = Prompt.inputInt("번호? ");
    t.content = Prompt.inputString("내용? ");
    t.completedDate = Prompt.inputDate("마감일? ");
    t.status = Prompt.inputInt("상태?\n0: 신규\n1: 진행중\n2: 완료\n> ");
    t.owner = Prompt.inputString("담당자? ");

    Task.list[Task.size++] = t;
  }
  
  public static void list() {
    System.out.println("[작업 목록]");
    
    for (int i = 0; i < Task.size; i++) {
      Task t = Task.list[i];
      String stateLabel = null;
      switch (t.status) {
        case 1:
          stateLabel = "진행중";
          break;
        case 2:
          stateLabel = "완료";
          break;
        default:
          stateLabel = "신규";
      }
      // 번호, 작업명, 마감일, 프로젝트, 상태, 담당자
      System.out.printf("%d, %s, %s, %s, %s\n", // 출력 형식 지정
          t.no, t.content, t.completedDate, stateLabel, t.owner);
    }
  }
}
