package com.eomcs.pms.handler;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import com.eomcs.pms.domain.Member;
import com.eomcs.pms.domain.Task;
import com.eomcs.util.Prompt;

public class TaskUpdateCommand implements Command {

  MemberListCommand memberListCommand;

  public TaskUpdateCommand(MemberListCommand memberListCommand) {
    this.memberListCommand = memberListCommand;
  }

  @Override
  public void execute() {
    System.out.println("[작업 변경]");
    int no = Prompt.inputInt("번호? ");

    Task task = new Task();

    try (Connection con = DriverManager.getConnection(
        "jdbc:mysql://localhost:3306/studydb?user=study&password=1111")) {
      try (PreparedStatement stmt = con.prepareStatement(
          "select t.content, t.deadline, t.status, t.project_no, p.title project_name, t.owner, m.name owner_name"
              + " from pms_task t"
              + " inner join pms_member m on t.owner=m.no"
              + " inner join pms_project p on t.project_no=p.no"
              + " where t.no=" + no)){
        
        try (ResultSet rs = stmt.executeQuery()) {
          if (rs.next()) {
            task.setContent(rs.getString("content"));
            task.setDeadline(rs.getDate("deadline"));
            task.setProjectNo(rs.getInt("project_no"));
            task.setProjectTitle(rs.getString("title"));
            Member member = new Member();
            member.setNo(rs.getInt("owner"));
            member.setName(rs.getString("owner_name"));

            task.setOwner(member);

            task.setStatus(rs.getInt("status"));
          } else {
            System.out.println("해당 번호의 작업이 존재하지 않습니다.");
            return;
          }
        }
      } 

      task.setContent(Prompt.inputString(String.format(
          "내용(%s)? ", task.getContent())));
      task.setDeadline(Prompt.inputDate(String.format(
          "마감일(%s)? ", task.getDeadline())));

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
      task.setStatus(Prompt.inputInt(String.format(
          "상태(%s)?\n0: 신규\n1: 진행중\n2: 완료\n> ", stateLabel)));
      
      
      System.out.printf("현재 프로젝트: %s", task.getProjectTitle());
      
      ArrayList<Integer> projectNoList = new ArrayList<>();
      try (PreparedStatement stmt = con.prepareStatement(
          "select no, title"
              + " from pms_project"
              + " order by no desc");
          ResultSet rs = stmt.executeQuery()) {
        System.out.println("  프로젝트들:");
        while (rs.next()) {
          System.out.printf("  %d, %s\n", 
              rs.getInt("no"), rs.getString("title"));          
          projectNoList.add(rs.getInt("no"));
        }

        if (projectNoList.size() == 0) {
          System.out.println("프로젝트가 없습니다!");
        }
        while (true) {
          no = Prompt.inputInt("프로젝트 번호? ");

          if (projectNoList.contains(no)) {
            task.setProjectNo(no);
            break;
          }
          System.out.println("유효하지 않은 프로젝트 번호입니다.");
        }
      }


      ArrayList<Integer> memberNoList = new ArrayList<>();
      Member member = new Member();
      System.out.println("  멤버들:");

      try (PreparedStatement stmt = con.prepareStatement(
          "select mp.member_no no, m.name"
              + " from pms_member_project mp inner join pms_member m"
              + " on mp.member_no = m.no"
              + " where mp.project_no=" + task.getProjectNo()
              + " order by m.no desc");
          ResultSet rs = stmt.executeQuery()) {
        while (rs.next()) {
          System.out.printf("  %d, %s\n", 
              rs.getInt("no"), rs.getString("name"));          
          memberNoList.add(rs.getInt("no"));
        }
      }



    while (true) {
      no = Prompt.inputInt("담당자 번호? ");

      if (projectNoList.contains(no)) {
        member.setNo(no);
        task.setOwner(member);
        break;
      }
      System.out.println("유효하지 않은 담당자 번호입니다.");
    }

      String response = Prompt.inputString("정말 변경하시겠습니까?(y/N) ");
      if (!response.equalsIgnoreCase("y")) {
        System.out.println("작업 변경을 취소하였습니다.");
        return;
      }

      try (PreparedStatement stmt = con.prepareStatement(
          "update pms_task set"
              + " content = ?,"
              + " deadline = ?,"
              + " owner = ?,"
              + " status = ?,"
              + " project_no = ?"
              + " where no = ?")) {

        stmt.setString(1, task.getContent());
        stmt.setDate(2, task.getDeadline());
        stmt.setInt(3, task.getOwner().getNo());
        stmt.setInt(4, task.getStatus());
        stmt.setInt(5, task.getProjectNo());
        stmt.setInt(6, no);
        int count = stmt.executeUpdate();

        if (count == 0) {
          System.out.println("해당 번호의 작업이 존재하지 않습니다.");
        } else {
          System.out.println("작업을 변경하였습니다.");
        }
      } 
    } catch (Exception e) {
      System.out.println("작업 변경 중 오류 발생!");
      e.printStackTrace();
    }
  }
}
