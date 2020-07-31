package com.eomcs.basic.exam07;

import java.util.Scanner;

public class Exam0100 {
  public static void printSpaces(int len) {
    for (int i = 0; i < len; i++) {
      System.out.println(" ");
    }
  }

  public static void printStars(int len) {
    for (int i = 0; i < len; i++) {
      System.out.println("*");
    }
  }

  public static int getSpaceLength(int totalStar, int displayStar) {
    return (totalStar - displayStar) / 2;
  }

  public static void main(String[] args) {
    Scanner keyScan = new Scanner(System.in);
    System.out.print("밑변의 길이? ");
    int len = keyScan.nextInt();

    for (int starLen = 1; starLen <= len; starLen += 2) {
      printSpaces(getSpaceLength(len, starLen));
      printStars(starLen);
      System.out.println();
    }
    keyScan.close();
  }
}
