package com.eomcs.basic.ex06;

public class Exam0331 {
  public static void main(String[] args) {
    int x = 2;
    int y = 1;

    loop:
      while(x <= 9) {
        while(y <= 9) {
          System.out.printf("%d x %d = %d\n", x, y, x * y);
          if(x == 5 && y == 5)
            break loop;
          y++;
        }
        System.out.println();
        x++;
        y = 0;
      }
    System.out.println("종료!");
  }
}

// do
