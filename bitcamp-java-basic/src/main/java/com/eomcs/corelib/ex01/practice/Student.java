package com.eomcs.corelib.ex01.practice;

public class Student {
  String name;
  int age;
  boolean working;
  
  public Student(String name, int age, boolean working) {
    this.name = name;
    this.age = age;
    this.working = working;
  }
  
  @Override
  public String toString() {
    return "Student [name=" + name + ", age=" + age + ", working=" + working + "]";
  }
}
