// 변수 선언
// - 데이터를 저장할 메모리를 확보하는 명령
//
package com.eomcs.basic.ex04;

public class Exam0100 {
  public static void main(String[] args) {
    int i;
    int i2;
    int i3;
    
    int x, y, z;
    
    i = 100;
    x = i;
    y = i * x;
    
    byte b1;
    byte b2;
    
    b1 = 10; // [00001010]
    b2 = 12; // [00001100]
    b1 = b2; // [00001100]
    
    i = b1;  // [00000000000000000000000000001100]
    
    // b2 =i;   // 자바에서  메모리의 값은 작은 메모리에 저장할 수 없다.
    b2 = (byte)i; // 명령어로 강제로 잘라서 집어넣음 (잘려도 상관 없을 때)
    
    // JVM에게 내리는 명령
    // 정수값을 담을 4바이트 메모리를 확보하고 그 이름을 a라고 하라. 
    // 그리고 a라는 메모리에 값을 넣어라.
    int a = 100;
    int b = 200;
    
    // initialize
    // 값을 초기화시킨다.
    int aa, bb = 100, cc = 200, dd;
    
    byte xx = 10;   // 00001010
    xx = 12;        // 00001100
    xx= 78;         // 01001110
  }
  
}