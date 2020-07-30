package com.eomcs.basic.ex06;
// 중첩된 반복문 탈출!

public class Exam0330 {
  public static void main(String[] args) {
    int x = 2, y = 1;

    // 5 * 5까지만 출력해라!

    while(x <= 9) {
      while (y <= 9) {
        System.out.printf("%d X %d = %d \n", x, y, x * y);
        if (x == 5 && y == 5)
          break;
        y++;
      }
      System.out.println();
      x++;
      y = 1;
    }
    System.out.println("종료!");
  }
}
