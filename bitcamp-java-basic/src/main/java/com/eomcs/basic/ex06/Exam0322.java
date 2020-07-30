package com.eomcs.basic.ex06;

public class Exam0322 {
  public static void main(String[] args) {
    int count = 0;
    int sum = 0;

    //1부터 100까지의 카운트를 하는데 단 합은 50까지만 계산한다.
    // => break 사용 전
    count = 0;
    sum = 0;
    while (count < 100) {
      count++;
      if (count > 50)
        continue;
      sum += count;
    }
    System.out.printf("count=%d, sum=%d\n", count, sum);


    // => break 사용 후
    count = 0;
    sum = 0;
    while (count < 100) {
      count++;
      if (count > 50)
        break;
      sum += count;
    }
    System.out.printf("count=%d, sum=%d\n", count, sum);
  }
}
