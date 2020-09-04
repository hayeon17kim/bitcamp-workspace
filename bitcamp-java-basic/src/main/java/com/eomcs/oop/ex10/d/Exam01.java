package com.eomcs.oop.ex10.d;
// 템플릿 메서드를 구현한 클래스 사용
// 템플릿 메서드
// => 기본적인 실행 흐름은 정의하고
// 구체적인 행위는 서브 클래스에게 위임하는 설계 방법

public class Exam01 {
  public static void main(String[] args) {
    Hong s1 = new Hong();
    Kim s2 = new Kim();

    hi(s1);
    System.out.println();
    hi(s2);
  }


  static void hi(Student student) {
    student.introduce();
  }
}
