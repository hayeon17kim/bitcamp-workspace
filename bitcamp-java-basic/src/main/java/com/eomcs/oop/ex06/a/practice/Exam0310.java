package com.eomcs.oop.ex06.a.practice;

public class Exam0310 {
  public static void main(String[] args) {
    Vehicle v1 = new Vehicle();
    
    v1.model = "티코";
    v1.capacity = 5;
    
    Sedan s = (Sedan)v1;
    s.cc = 1980;
    s.valve = 16;
    s.sunroof = true;
    s.auto = true;
    
    System.out.printf("%s, %d, %d, %d, %b, %b\n",
        s.model, s.capacity,
        s.cc, s.valve,
        s.sunroof, s.auto);
  }
}
