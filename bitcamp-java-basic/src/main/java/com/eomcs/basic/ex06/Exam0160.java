package com.eomcs.basic.ex06;

import java.util.Scanner;

public class Exam0160 {
  public static void main(String[] arge) {
    Scanner keyScan = new Scanner(System.in);
    System.out.print("나이를 입력하세요? ");
    int age = keyScan.nextInt();

    if (age < 8)
      System.out.println("아동입니다.");
    else {
      if (age < 14)
        System.out.println("어린이입니다.");
      else {
        if (age < 19)
          System.out.println("청소년입니다.");
        else {
          if (age < 65)
            System.out.println("성인입니다.");
          else
            System.out.println("노인입니다.");
        }
      }
    }

    keyScan.close();
  }
}
