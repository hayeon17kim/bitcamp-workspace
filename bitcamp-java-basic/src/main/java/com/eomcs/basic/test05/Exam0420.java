package com.eomcs.basic.test05;

public class Exam0420 {
  public static void main(String[] args) {
    // >> 비트 이동 연산자 사용법
    // - 왼쪽 쪽 빈자리를 원래 숫자와 같은 부호 값으로 채운다.
    // - 양수라면 0, 음수라면 1을 채운다.
    // - 오른쪽 경계를 넘어간 비트는 자른다.
    
    int i = 0b01101001;             // 105
    
    System.out.println(i);
    
    System.out.println(i >> 1);     // 52
    
    System.out.println(i >> 2);     // 25
    
    System.out.println(i >> 3);     // 12
    
    System.out.println(i >> 4);     // 6
    
    
    // 오른쪽 이동
    // - 1비트 이동은 나누기 2한 것과 같은 효과를 준다.
    // - 예) n에 대해 x비트를 오른쪽으로 이동 = n / 2**x
    // - 소수점이 있는 경우 그 수보다 작은 바로 밑 정수값이 된다.
    // - 나누기 연산을 수행하는 것보다 계산 속도가 빠르다.
    //   실무에서는 나눗셈 연산이 비용(시간과 CPU사용량)이 많이 들기 때문에
    //   소수점 이하까지 정확하게 계산할 게 아니라면
    //   오른쪽 비트 이동 연산자를 사용하여 주로 처리한다. 
    //
  }
}
