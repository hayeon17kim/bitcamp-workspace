// 다형성 - 다형적 변수와 형변환
package com.eomcs.oop.ex06.a.practice;

public class Exam0210 {
  public static void main(String[] args) {
    Vehicle v1 = new Sedan();
    
    v1.model = "티코";
    v1.capacity = 5;
    
    ((Sedan)v1).cc = 1980;
    ((Sedan)v1).valve = 16;
    ((Sedan)v1).sunroof = true;
    ((Sedan)v1).auto = true;
    
    System.out.printf("%s, %d, %d, %d, %b, %b\n",
        v1.model, v1.capacity,
        ((Sedan)v1).cc, ((Sedan)v1).valve,
        ((Sedan)v1).sunroof, ((Sedan)v1).auto);
    
    Sedan s = (Sedan)v1;
    s.cc = 1980;
    s.valve = 16;
    s.sunroof = true;
    s.auto = true;
    
    System.out.printf("%s, %d, %d, %d, %d, %b\n",
        s.model, s.capacity,
        s.cc, s.valve,
        s.sunroof, s.auto);
  }
}
