package com.eomcs.basic.test05;
// 관계연산자: 부동소수점 비
public class Exam0220 {
  public static void main(String[] args) {
    double d1 = 987.6543;
    double d2 = 1.111111;
    System.out.println((d1 + d2) == 988.765411);
    
    double x = 234.765411;
    double y = 754.0;
    System.out.println((x + y) == 988.765411);
    
    System.out.println((d1 + d2) == (x + y));
    
    double EPSILON = 0.00001;
    System.out.println(Math.abs((d1 + d2) - (x + y)) < EPSILON); ;
  }
}
