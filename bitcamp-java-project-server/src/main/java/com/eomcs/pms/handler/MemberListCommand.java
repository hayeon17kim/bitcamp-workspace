package com.eomcs.pms.handler;

<<<<<<< HEAD
import java.io.PrintWriter;
=======
import java.io.BufferedReader;
import java.io.PrintWriter;
import java.util.Iterator;
>>>>>>> b2246385c7ae9f527ca04b18fce4ea5b337d8508
import java.util.List;
import java.util.Map;
import com.eomcs.pms.domain.Member;
import com.eomcs.pms.service.MemberService;

<<<<<<< HEAD
@CommandAnno("/member/list")
=======
@CommandAnno("/member/lists")
>>>>>>> b2246385c7ae9f527ca04b18fce4ea5b337d8508
public class MemberListCommand implements Command {

  MemberService memberService;

  public MemberListCommand(MemberService memberService) {
    this.memberService = memberService;
  }

<<<<<<< HEAD
  @Override
  public void execute(Request request) {
    PrintWriter out = request.getWriter();

    out.println("[회원 목록]");

    try {
      List<Member> list = memberService.list();

      out.println("번호, 이름, 이메일, 전화, 등록일");
      for (Member member : list) {
=======

  @Override
  public void execute(Request request) {
    PrintWriter out = request.getWriter();
    try {
      out.println("[회원 목록]");

      // 전체 목록을 조회할 때 `Iterator` 객체를 사용한다.
      // 만약 목록의 일부만 조회하면다면 인덱스를 직접 다루는 이전 방식을 사용해야 한다.
      for (Member member : memberService.list()) {
>>>>>>> b2246385c7ae9f527ca04b18fce4ea5b337d8508
        out.printf("%d, %s, %s, %s, %s\n",
            member.getNo(),
            member.getName(),
            member.getEmail(),
            member.getTel(),
            member.getRegisteredDate());
      }
    } catch (Exception e) {
      out.printf("작업 처리 중 오류 발생! - %s\n", e.getMessage());
<<<<<<< HEAD
      e.printStackTrace();
=======
>>>>>>> b2246385c7ae9f527ca04b18fce4ea5b337d8508
    }
  }
}
