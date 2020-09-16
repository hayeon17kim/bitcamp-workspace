package com.eomcs.exception.ex3;

import java.util.Scanner;

public class Exam0620 {
  public static void main(String[] args) {
    Scanner keyScan = null;

    try {
      keyScan = new Scanner(System.in);
      System.out.print("입력> ");
      int value = keyScan.nextInt();
      System.out.println(value * value);
    } finally {
      keyScan.close();
      System.out.println("스캐너 자원 해제!");
    }
  }
}
