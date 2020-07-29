package com.eomcs.basic.ex05.assignment;

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

public class Test4_1 {

  public static void main(String[] args) {
    
    int value = 23459876;
    
    System.out.println(value % 10);
    value = value / 10;
    
    System.out.println(value % 10);
    value = value / 10;
    
    System.out.println(value % 10);
    value = value / 10;
    
    System.out.println(value % 10);
    value = value / 10;
    
    System.out.println(value % 10);
    value = value / 10;
    
    System.out.println(value % 10);
    value = value / 10;
    
    System.out.println(value % 10);
    value = value / 10;
    
    System.out.println(value % 10);
    value = value / 10;
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






