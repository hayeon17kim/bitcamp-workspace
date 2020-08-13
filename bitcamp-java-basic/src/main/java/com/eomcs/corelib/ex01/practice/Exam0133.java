package com.eomcs.corelib.ex01.practice;

public class Exam0133 {
  static class Member {
    String name;
    int age;
    
    public Member(String name, int age) {
      this.name = name;
      this.age = age;
    }
    
    @Override
    public boolean equals(Object obj) {
      if (!(obj.getClass() == Member.class))
        return false;
      Member other = (Member) obj;
      
      if (!this.name.equals(other.name))
        return false;
      if (this.age != other.age)
        return false;
      
      return true;
    }
  }
  
  public static void main(String[] args) {
    Member m1 = new Member("홍길동", 20);
    Member m2 = new Member("홍길동", 20);
    Member m3 = new Member("홍길동", 21);
    
    System.out.println(m1 == m2);
    
    System.out.println(m1.equals(m2));
    System.out.println(m1.equals(m3));
  }
}
