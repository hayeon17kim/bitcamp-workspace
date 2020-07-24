package com.eomcs.basic.ex04;



public class Exam0431 {
  public static void main(String[] args) {
    
    char c;
    
    c = 0;
    c = 65535;
    
    // char(2byte) 크기의 메모리 범위를 초과하면 문법 오류이다.
    // c = -1;
    // c = 65536;
  }
}
