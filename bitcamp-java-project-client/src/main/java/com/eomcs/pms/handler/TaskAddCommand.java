package com.eomcs.pms.handler;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import com.eomcs.pms.domain.Member;
import com.eomcs.pms.domain.Task;
import com.eomcs.util.Prompt;

public class TaskAddCommand implements Command {

  MemberListCommand memberListCommand;

  public TaskAddCommand(MemberListCommand memberListCommand) {
    this.memberListCommand = memberListCommand;
  }

  @Override
  public void execute() {

    System.out.println("[작업 등록]");
    Task task = new Task();
    try (Connection con = DriverManager.getConnection(
        "jdbc:mysql://localhost:3306/studydb?user=study&password=1111");) {

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
          int no = Prompt.inputInt("프로젝트 번호? ");

          if (projectNoList.contains(no)) {
            task.setProjectNo(no);
            break;
          }
          System.out.println("유효하지 않은 프로젝트 번호입니다.");
        }
      }


      task.setContent(Prompt.inputString("내용? "));
      task.setDeadline(Prompt.inputDate("마감일? "));
      task.setStatus(Prompt.inputInt("상태?\n0: 신규\n1: 진행중\n2: 완료\n> "));

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
        int no = Prompt.inputInt("담당자 번호? ");

        if (projectNoList.contains(no)) {
          member.setNo(no);
          task.setOwner(member);
          break;
        }
        System.out.println("유효하지 않은 담당자 번호입니다.");
      }


      try (PreparedStatement stmt = con.prepareStatement(
          "insert into pms_task(content,deadline,owner,status,project_no)"
              + " values(?,?,?,?,?)")) {

        stmt.setString(1, task.getContent());
        stmt.setDate(2, task.getDeadline());
        stmt.setInt(3, task.getOwner().getNo());
        stmt.setInt(4, task.getStatus());
        stmt.setInt(5, task.getProjectNo());
        stmt.executeUpdate();

        System.out.println("작업을 등록했습니다.");

      } 
    }catch (Exception e) {
      System.out.println("작업 등록 중 오류 발생!");
      e.printStackTrace();
    }
  }
} 
