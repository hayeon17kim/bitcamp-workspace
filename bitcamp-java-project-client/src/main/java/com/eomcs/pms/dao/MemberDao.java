package com.eomcs.pms.dao;

import java.util.List;
import com.eomcs.pms.domain.Member;

public interface MemberDao {

  public int insert(Member member) throws Exception;
  public int delete(int no) throws Exception;
  public Member findByNo(int no) throws Exception;
  public Member findByName(String name) throws Exception;
  public List<Member> findAll() throws Exception;
  public int update(Member member) throws Exception;
  public List<Member> findByProjectNo(int projectNo) throws Exception;
  public Member findByEmailPassword(String email, String password) throws Exception;
}