package com.eomcs.basic.test05;

public class Exam0460 {
  public static void main(String[] args) {
    final int CSS        = 0x01;
    final int HTML       = 0x02;
    final int PHP        = 0x04;
    final int PYTHON     = 0x08;
    final int JAVASCRIPT = 0x10;
    final int JAVA       = 0x20;
    final int CPP        = 0x40;
    final int C          = 0x80;
    
    int lang = JAVA | C | PYTHON | HTML;
    
    System.out.println(Integer.toBinaryString(lang));
  }
}
