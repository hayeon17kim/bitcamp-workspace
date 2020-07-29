package com.eomcs.basic.test05;

//# 비트 이동 연산자 : 응용 I

public class Exam0440 {
  public static void main(String[] args) {
    
    int i = 0x27a130ff;
    int a, b, c, d;
    System.out.println(i);
    System.out.println(Integer.toHexString(i));
    
    a = i >> 24;
    
    b = (i >> 16) & 0xff;
    
    c = (i >> 8) & 0xff;
    
    d = i & 0xff;
    
    System.out.println(Integer.toHexString(a));
    System.out.println(Integer.toHexString(b));
    System.out.println(Integer.toHexString(c));
    System.out.println(Integer.toHexString(d));
  }
}
