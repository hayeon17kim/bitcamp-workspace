// toString(): 다형적 변수와 형변환
package com.eomcs.corelib.ex02.practice;

public class Exam0141 {
  public static void main(String[] args) {
    Object obj = new String("Hello");
    String x1 = (String) obj;
    
    String x2 = obj.toString();
    System.out.println(x1 == x2);
  }
}
