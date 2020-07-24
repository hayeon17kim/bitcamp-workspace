package com.eomcs.basic.ex04;

public class Exam0430 {
  public static void main(String[] args) {
    char c;
    
    c = 0;
    c = 65535;
    //c = -1;
    //c =65536;
    
    c = 65;         //A
    c = 0x42;       //B
    c = 0b01000011; //C
    System.out.println(c);
    
    short s = 65;
    System.out.println(s);
    
    // '' 문자 코드를 리턴해주는 연산자
    c = '헐'; // '' 연산자는 문자의 유니코드 값을 리턴한다.
    // 메모리에 문자를 저장한다는 말은 틀렸다.
    // 헐이라는 문자의 문자 코드값을 저장한다.
    // 16비트 문자 코드를 저장한다.
    // 문자코드에는 아스키, utf-8, 유니코드 등이 있는데 
    // 자바는 유니코
    
    //s = '헐';
    
    int i = '헐';
    System.out.println(i);
    
    for(int x = 65; x < 85; x ++) {
      System.out.println((char)x);
    }
    
    boolean b1, b2;
    b1 = true;
    b2 = false;
    
    System.out.println(b1);
    System.out.println(b2);
    
    // 논리값은 정수로 다룰 수 없다!
    //
    //i = b1;
    //i = b2;
    //b1 = 1;
    // 내부적으로는 (메모리상에서는) 1 또는 0이지만
    // 코딩할 때는 정수값을 다이렉트로 불린으로 넣거나 반대도 안
  }
}
