package com.eomcs.basic.ex07;

public class Exam0460 {
  static int sum(int value) {
    if (value == 1)
      return 1;
    return value + sum(value - 1);
  }
  
  public static void main(String[] args) {
    System.out.println(sum(100000));
  }
  
  /*
  long sum = 0;
  for (int i = 1; i <= 100000; i++) {
    sum += i;
  }
  System.out.println(sum);
   */
}
