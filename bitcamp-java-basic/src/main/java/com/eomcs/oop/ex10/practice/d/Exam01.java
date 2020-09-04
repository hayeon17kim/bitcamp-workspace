package com.eomcs.oop.ex10.practice.d;

public class Exam01 {
  public static void main(String[] args) {
    Hong hong = new Hong();
    Kim kim = new Kim();

    hi(hong);
    System.out.println("---------------");
    hi(kim);
  }

  static void hi(Student student) {
    student.introduce();
  }
}
