package com.eomcs.basic.test05;

public class Exam0411 {
  public static void main(String[] args) {
    
    // 0111 1111 1111 1111 1111 1111 1111 1010 =  21_4748_3642
    // 1000 0000 0000 0000 0000 0000 0000 0110 = -21_4748_3642
    
    // 음수를 왼쪽으로 이동할 때는 부호비트에 상관 없이 무조건 이동
    int a = -0x7f_ff_ff_fa; // -21_4748_3642
    System.out.println(a);
    System.out.println(a << 1); // 12
    System.out.println(a << 2); // 24
    System.out.println(a << 3); // 48
    System.out.println(a << 4); // 96
    
    // 결론!
    // 왼쪽으로 x 만큼 비트를 이동시키는 것은 주어진 양수에 대해 2**x 로 곱한 것과 같다.
    // 주의!
    // 음수일 경우는 양수로 바뀔 수 있다.
  }
}
