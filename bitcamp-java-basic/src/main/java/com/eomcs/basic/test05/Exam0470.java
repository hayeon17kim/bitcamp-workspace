package com.eomcs.basic.test05;

public class Exam0470 {
  public static void main(String[] args) {
    final int CSS               = 0x01; // 0000 0001
    final int HTML              = 0x02; // 0000 0010
    final int PHP               = 0x04; // 0000 0100
    final int PYTHON            = 0x08; // 0000 1000
    final int JAVASCRIPT        = 0x10; // 0001 0000
    final int JAVA              = 0x20; // 0010 0000
    final int CPP               = 0x40; // 0100 0000
    final int C                 = 0x80; // 1000 0000
    
    int lang = C | JAVA | PYTHON | HTML;
        
    System.out.printf("CSS : %b\n", (lang & CSS) == CSS);
    System.out.printf("HTML : %b\n", (lang & HTML) == HTML);
    System.out.printf("PHP : %b\n", (lang & PHP) == PHP);
    System.out.printf("Python : %b\n", (lang & PYTHON) == PYTHON);
    System.out.printf("Javascript : %b\n", (lang & JAVASCRIPT) == JAVASCRIPT);
    System.out.printf("Java : %b\n", (lang & JAVA) == JAVA);
    System.out.printf("C++ : %b\n", (lang & CPP) == CPP);
    System.out.printf("C : %b\n", (lang & C) == C);
    
    System.out.println("---------------------");
    
    System.out.printf("CSS : %b\n", (lang & CSS) > 0);
    System.out.printf("HTML : %b\n", (lang & HTML) > 0);
    System.out.printf("PHP : %b\n", (lang & PHP) > 0);
    System.out.printf("Python : %b\n", (lang & PYTHON) > 0);
    System.out.printf("Javascript : %b\n", (lang & JAVASCRIPT) > 0);
    System.out.printf("Java : %b\n", (lang & JAVA) > 0);
    System.out.printf("C++ : %b\n", (lang & CPP) > 0);
    System.out.printf("C : %b\n", (lang & C) > 0);
  } 
}
