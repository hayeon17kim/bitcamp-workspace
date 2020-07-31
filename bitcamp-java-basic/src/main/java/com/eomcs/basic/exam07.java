package com.eomcs.basic;

import java.util.Scanner;

public class exam07 {
  public static void main(String[] args) {
    Scanner keyScan = new Scanner(System.in);
    System.out.println("밑변의 길이?");
    int len = keyScan.nextInt();

    int starLen = 1;
    while (starLen <= len) {
      int spaceCnt = 1;
      int spaceLen = (len - starLen) / 2;
      while (spaceCnt <= spaceLen) {
        System.out.print(" ");
        spaceCnt++;
      }

      int starCnt = 1;
      while (starCnt <= starLen) {
        System.out.print("*");
        starCnt++;
      }

      System.out.println();
      starLen += 2;

      keyScan.close();
    }
  }
}
