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

public class Test4 {

  public static void main(String[] args) {
    Scanner keyScan = new Scanner(System.in);
  
    System.out.print("값: ");
    int number = keyScan.nextInt();

    // 몇자리 수인지 확인하고 변수에 집어넣기 => while 문 안에 if
    
    int count = 0;
    int mulTen = 1;
    
    // 자리수 count 변수에 넣기 
    while(number/mulTen > 0) {
      if(number/mulTen > 0) {
        count ++;
        mulTen *= 10;
      }
    }
    
    mulTen = 1;

    int fisrtContainer = 0;
    int secondContainer = 0;
    
    System.out.println("-------");
    
    // 역순으로 출력하기 
    for (int i = 0; i < count; i++) {
      fisrtContainer = (number % (mulTen * 10) - secondContainer) / mulTen;
      secondContainer += mulTen * fisrtContainer;
      mulTen *= 10;
      System.out.println(fisrtContainer);
    }
    
    keyScan.close();
  }

}




////똑바로
//
//int a = testNumber / 1000;
//int b = (245 - a * 1000) / 100;
//int c = 245 - a * 1000 - b * 100;
//
//System.out.println(a);
//System.out.println(b);
//System.out.println(c);
//
//// 역순 
//int x = testNumber % 10;
//int y = (testNumber % 100 - x) / 10;
//int z = (testNumber % 1000 - (x + 10 * y)) / 100;
//int w = (testNumber % 10000 - (x + 10 * y + 100 * z))/1000;
//
//System.out.println("-------");
//System.out.println(x);
//System.out.println(y);
//System.out.println(z);
//System.out.println(w);
//






