package com.eomcs.corelib.ex02.practice;

public class Exam0223 {
  static class Member {
    String name;
    String tel;
    
    @Override
    public String toString() {
      return name + ", " + tel;
    }
  }
  
  public static void main(String[] args) {
    int i = 100;
    
    Member member = new Member();
    member.name = "홍길동";
    member.tel = "010-1111-2222";
    
    String str = new String("Hello");
    
    Object obj;
    obj = member;
    obj = str;
    obj = i;
    
    Integer obj2 = (Integer) obj;
    System.out.println(i);
    System.out.println(obj);
  }
}
