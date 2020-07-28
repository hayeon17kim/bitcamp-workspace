package com.eomcs.basic.test05;

//# 논리 연산자 : && vs &
public class Exam0330 {
  public static void main(String[] args) {
    boolean a = false;
    boolean b = false;
    boolean r = a && (b = true);
    System.out.printf("a=%b, b=%b, r=%b\n", a, b, r);
    
    a = false;
    b = false;
    r = a & (b = true);
    // => & 연산자의 경우 왼쪽 값으로 결과를 예측할 수 있다 하더라도
    //    결과에 상관 없이 & 오른쪽 문장을 무조건 실행한다.
    // r = false & (b 변수의 값을 true로 바꾸고, b 변수의 값을 이 자리에 놓는다.)
    // r = false & true
    // r = false
    System.out.printf("a=%b, b=%b, r=%b\n", a, b, b);
  }
}

// &&, ||
// - 앞의 피연산자의 값으로 결과를 알 수 있다면 뒤의 명령은 실행하지 않는다.
//
// &, |
// - 앞의 피연산자로 결과를 알 수 있을 지라도,
//   뒤에 놓은 명령까지 모두 실행한다. 