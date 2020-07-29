package com.eomcs.basic.ex05.assignment;

public class Test03_answer {

  public static void main(String[] args) {
    int value =  0xaabbccdd;
    
    //코드를 완성하시오!
    
    System.out.println(Integer.toHexString(value >> 24 & 0xff));
    System.out.println(Integer.toHexString(value >> 16 & 0xff));
    System.out.println(Integer.toHexString(value >> 8 & 0xff));
    System.out.println(Integer.toHexString(value & 0xff));
    
  }
}
