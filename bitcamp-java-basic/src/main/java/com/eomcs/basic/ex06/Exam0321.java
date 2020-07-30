package com.eomcs.basic.ex06;

//# 흐름 제어문 - break와 continue 활용

public class Exam0321 {
  public static void main(String[] args) {
    int count = 0;
    int sum = 0;

    //1부터 100까지의 짝수의 합은?
    // => continue 사용 전
    while(count < 100) {
      count++;
      if (count % 2 == 0) {
        sum += count;
      }
    }
    System.out.printf("count=%d, sum=%d\n", count, sum);
    System.out.println("----------");
    //

    // => continue 사용 후
    while(count < 100) {
      count++;
      if (count % 2 != 0)
        continue;
      sum += count;
    }
    System.out.printf("count=%d, sum%d\n", count, sum);
  }
}
