package com.eomcs.basic.ex07;

import java.util.Scanner;

//# 메서드 : 리팩토링
//
public class Exam0130 {

  public static void printSpaces(int len) {
    for (int i = 0; i < len; i++) {
      System.out.print(" ");
    }
  }
  
  public static void printStars (int len) {
    for (int i = 0; i < len; i++){
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
    }
    
    keyScan.close();
  }
}