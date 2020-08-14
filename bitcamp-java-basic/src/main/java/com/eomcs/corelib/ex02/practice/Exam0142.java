package com.eomcs.corelib.ex02.practice;
//String - 다형적 변수와 형변환

public class Exam0142 {
  public static void main(String[] args) {
    Object obj = new String("Hello");
    String str = ((String) obj).toLowerCase();
    System.out.println(str);
    
    String x1 = (String) obj;
    str = x1.toLowerCase();
    System.out.println(str);
  }
}
