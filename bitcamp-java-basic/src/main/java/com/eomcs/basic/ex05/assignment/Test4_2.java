package com.eomcs.basic.ex05.assignment;

import java.util.Scanner;

//# 과제
//- 다음 int 변수에 들어 있는 값을
//  각 자리수에 10 진수 값을 역순으로 출력하라. 
//실행 예)
//값: 23459876
//6
//7
//8
//9
//5
//4
//3
//2

public class Test4_2 {

  public static void main(String[] args) {
    
    Scanner scanner = new Scanner(System.in);
    
    int value = scanner.nextInt();
    
    while (value > 0) {
      System.out.println(value % 10);
      value = value / 10;
    }
    
    scanner.close();
  }

}








