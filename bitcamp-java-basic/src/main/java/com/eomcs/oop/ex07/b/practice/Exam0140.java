package com.eomcs.oop.ex07.b.practice;

public class Exam0140 {
  public static void main(String[] args) {
    Customer4 c1 = new Customer4();
    
    c1.setName("홍길동");
    c1.setAge(20);
    c1.setWeight(100);
    c1.setHeight(-50);
    
    System.out.printf("%s, %d, %d, %d",
        c1.getName(), c1.getAge(), c1.getWeight(), c1.getHeight());
  }
}
