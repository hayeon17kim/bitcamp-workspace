package com.eomcs.basic.ex07;

import java.util.Scanner;

//# 메서드 : 사용 전
//
public class Exam0110 {
  public static void main(String[] args) {
    Scanner keyScan = new Scanner(System.in);
    System.out.print("밑변의 길이? ");
    int length = keyScan.nextInt();
    
    int starLength = 1;
    while (starLength <= length) {
      int spaceCount = 1; 
      int spaceLength = (length - starLength) / 2;
      while (spaceCount <= spaceLength) {
        System.out.print(" ");
        spaceCount++;
      }
      
      int starCount = 1;
      while (starCount <= starLength) {
        System.out.print("*");
        starCount++;
      }
      
      System.out.println();
      starLength += 2;
    }
    
    keyScan.close();
    
    int i = 0;

    // 1부터 10까지 출력하기
    do
      System.out.println(++i);
    while (i < 10);
    
  }
}