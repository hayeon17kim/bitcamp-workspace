package com.eomcs.basic.test05;

public class Exam0430 {
  public static void main(String[] args) {
    // >>> 비트 이동 연산자 사용법
    // - 오른쪽으로 비트를 이동시킨다.
    // - 왼쪽 빈자리를 음수 양수 상관 없이 무조건 0으로 채운다.
    // - 오른쪽 경계를 넘어간 비트는 자른다.
    int i = 0b01101001;
    
    System.out.println(i);          // 105
     
    System.out.println(i >>> 1);    // 52
    
    System.out.println(i >>> 2);    // 26
    
    System.out.println(i >>> 3);    // 13
    
    System.out.println(i >>> 4);    // 6
  }
}
