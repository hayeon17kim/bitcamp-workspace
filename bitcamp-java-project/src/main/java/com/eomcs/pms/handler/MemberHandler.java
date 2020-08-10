package com.eomcs.pms.handler;

import java.sql.Date;
import com.eomcs.util.Prompt;

public class MemberHandler {
//회원 데이터
  static class Member {
   int no;
   String name;
   String email;
   String password;
   String photo;
   String tel;
   Date registeredDate;
   // 인스턴스 여러개 한번에 만드는 문법 없음
   // 레퍼런스를 여러 개 만드는 거!!!!!!!  
   static final int LENGTH = 100;
   static Member[] list = new Member[LENGTH];
   static int size;
 }
  public static void add() {
    System.out.println("[회원 등록]");
    
    Member m = new Member();
    m.no = Prompt.inputInt("번호? ");
    m.name = Prompt.inputString("이름? ");
    m.email = Prompt.inputString("이메일? ");
    m.password = Prompt.inputString("암호? ");
    m.photo = Prompt.inputString("사진? ");
    m.tel = Prompt.inputString("전화? ");
    // m 객체의 tel 필드에 사용자가 입력한 값 저장하라.
    m.registeredDate = new java.sql.Date(System.currentTimeMillis());
    Member.list[Member.size++] = m;
    // 일단 사이즈 값을 넣고 그 다음에 증가시킴
  }
  
  public static void list() {
    System.out.println("[회원 목록]");
    
    for (int i = 0; i < Member.size; i++) {
      Member m = Member.list[i];
      // 번호, 이름, 이메일, 전화, 가입일
      System.out.printf("%d, %s, %s, %s, %s\n", // 출력 형식 지정
          m.no, m.name, m.email, m.tel, m.registeredDate);
    }
  }
}
