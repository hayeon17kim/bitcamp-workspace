package com.eomcs.corelib.ex02.practice;

public class Exam0122 {
  static class Member {
    String name;
    int age;
    
    public Member(String name, int age) {
      this.name = name;
      this.age = age;
    }
  }
  
  public static void main(String[] args) {
    Member m1 = new Member("홍길동", 20);
    Member m2 = new Member("홍길동", 20);
    
    System.out.println(m1 == m2);
    System.out.println(m1.equals(m2));
  }
}
