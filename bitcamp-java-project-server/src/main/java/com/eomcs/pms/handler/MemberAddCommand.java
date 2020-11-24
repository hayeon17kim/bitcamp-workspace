package com.eomcs.pms.handler;

import java.io.BufferedReader;
import java.io.PrintWriter;
<<<<<<< HEAD
import com.eomcs.pms.domain.Member;
=======
import java.util.Map;
import com.eomcs.pms.domain.Member;
import com.eomcs.pms.service.BoardService;
>>>>>>> b2246385c7ae9f527ca04b18fce4ea5b337d8508
import com.eomcs.pms.service.MemberService;
import com.eomcs.util.Prompt;

@CommandAnno("/member/add")
public class MemberAddCommand implements Command {

  MemberService memberService;

  public MemberAddCommand(MemberService memberService) {
    this.memberService = memberService;
  }

  @Override
  public void execute(Request request) {
    PrintWriter out = request.getWriter();
    BufferedReader in = request.getReader();
<<<<<<< HEAD

=======
>>>>>>> b2246385c7ae9f527ca04b18fce4ea5b337d8508
    try {
      out.println("[회원 등록]");

      Member member = new Member();
<<<<<<< HEAD
=======
      member.setNo(Prompt.inputInt("번호? ", out, in));
>>>>>>> b2246385c7ae9f527ca04b18fce4ea5b337d8508
      member.setName(Prompt.inputString("이름? ", out, in));
      member.setEmail(Prompt.inputString("이메일? ", out, in));
      member.setPassword(Prompt.inputString("암호? ", out, in));
      member.setPhoto(Prompt.inputString("사진? ", out, in));
      member.setTel(Prompt.inputString("전화? ", out, in));
<<<<<<< HEAD

      memberService.add(member);
      System.out.println("회원을 등록하였습니다.");

    } catch (Exception e) {
      out.printf("작업 처리 중 오류 발생! - %s\n", e.getMessage());
      e.printStackTrace();
=======
      member.setRegisteredDate(new java.sql.Date(System.currentTimeMillis()));

      memberService.add(member);

    } catch (Exception e) {
      out.printf("작업 처리 중 오류 발생! - %s\n", e.getMessage());
>>>>>>> b2246385c7ae9f527ca04b18fce4ea5b337d8508
    }
  }
}
