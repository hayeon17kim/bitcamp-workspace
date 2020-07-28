package com.eomcs.basic.test05;

//# 산술 연산자 : 명시적 형변환

public class Exam0170 {
  public static void main(String[] args) {
    
    byte b;
    //b = 257;
    b = (byte)257;
    
    System.out.println(b);
    
    // 결론!
    // => 큰 메모리의 값을 작은 메모리에 넣으려고 형변환을 사용하기도 하는데
    //    다만 형변환하더라도(즉 작은 메모리에 넣더라도) 값이 잘리지 않을 때만 하라!
    // => 형변환하더라도 값이 소실되지 않을 때만 "명시적 형변환"을 지시하라!
  }
}
