package com.eomcs.pms.service;

import java.util.List;
import com.eomcs.pms.domain.Member;

public interface MemberService {
  List<Member> list(String name) throws Exception;
  List<Member> listByProject(int projectNo) throws Exception;
  int add(Member member) throws Exception;
  int delete(int no) throws Exception;
  Member get(int no) throws Exception;
  int update(Member member) throws Exception;
}
