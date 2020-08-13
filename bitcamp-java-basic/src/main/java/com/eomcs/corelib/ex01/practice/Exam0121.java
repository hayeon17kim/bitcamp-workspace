package com.eomcs.corelib.ex01.practice;

public class Exam0121 {
  static class My {
    String name;
    int age;
    
    @Override
    public String toString() {
      return "My3 [name=" + name + ", age=" + age + "]";
    }
  }
  
  public static void main(String[] args) {
    My obj1 = new My();
    
    obj1.name = "홍길동";
    obj1.age = 20;
    
    System.out.println(obj1.toString());
    
    System.out.println(obj1);
  }
}
