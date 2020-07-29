package com.eomcs.basic.ex05.assignment;

import java.util.Scanner;

//# 과제1
//- 다음 int 변수에 들어있는 값
//  다음과 같이 첫 바이트부터 끝 바이트까지 16진수로 순서대로 출력하라!
//실행 예)
//입력?
//aa
//bb
//cc
//bb

public class Test03 {

  public static void main(String[] args) {
    int value =  0xaabbccdd;
    
    //코드를 완성하시오!
    int a, b, c, d;
    a = value >> 24 & 0xff;
    b = value >> 16 & 0xff;
    c = value >> 8 & 0xff;
    d = value & 0xff;
    
    System.out.println(Integer.toHexString(a));
    System.out.println(Integer.toHexString(b));
    System.out.println(Integer.toHexString(c));
    System.out.println(Integer.toHexString(d));
    
  }

}








