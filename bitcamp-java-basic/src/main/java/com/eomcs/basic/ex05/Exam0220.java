// 관계 연산자 : 부동소수점 비교 
package com.eomcs.basic.ex05;

public class Exam0220 {
  public static void main(String[] args) {
    double d1 = 987.6543;
    double d2 = 1.111111;
    System.out.println((d1 + d2) == 988.765411);
    // 결과는 false이다.
    // 이유?
    // - 부동소수점 값을 연산할 때 IEEE 754 명세에 따라 
    //   작업을 수행한다. 그 과정에 값의 왜곡이 발생할 수 있다.
    // - CPU나 OS, JVM의 문제가 아니다.
    // - IEEE 754 명세에 따라 부동소수점을 처리하는 모든 
    //   컴퓨터에서 발생하는 문제이다.
    System.out.println(d1 + d2); 
    // 987.6543 + 1.111111 = 988.7654110000001
    // => 결과 뒤에 극소수의 값이 붙는다.
    // => 그래서 부동 소수점의 비교를 대충 다루지 말라!
    
    double x = 234.765411;
    double y = 754.0;
    System.out.println((x + y) == 988.765411);
    
    System.out.println(x + y);
    // d1 + d2와 달리 x + y의 계산 결과는 뒤에 극소수의 값이 붙지 않는다.
    // 234.765411 + 754.0 = 988.765411

    // IEEE 754의 변환 공식에 따라 발생되는 이런 문제를 
    // 실무 프로그래밍 할 때 해결하는 방법?
    //
    System.out.println((d1 + d2) == (x + y)); // false

    // 소수점 뒤에 붙은 극소수의 값을 무시하면 된다.
    // => JVM이 자동으로 처리하지 않는다.
    // => 다음과 같이 개발자가 직접 처리해야 한다.
    double EPSILON = 0.00001;
    System.out.println(Math.abs((d1 + d2) - (x + y)) < EPSILON);
//    
//    int v = 1234567;
//    for (int i = 0; i < 30; i++) {
//      int r = v * 2 / 1000_0000;
//      v = v * 2 / 1000_0000;
//      System.out.printf("%d => %d : %d\n", i+1, r, v);
//    }
//    //
//    
//    // [1][8][23]
//    // float에 넣기 전에 이미 왜곡된 수 
//    float f = 0.1234567f;
//    
//    // 정규화: 규칙에 따라 정렬하는 작업
//    // 소수점이 있으면 앞자리가 1 하나만 남도록 이동시킨다.
//    // 어떤 소수는 곱하기 2를 무한으로 해도 완벽하게 딱 떨어지지 않는다.
//    
//    // 1. 유효자리수면서 딱 떨어지는 경우 
//    // - 12.375 
//    
//    // 2. 유효자리수면서 무한으로 빠지는 경
//    // - 12.475f : 정확하게 나올 가능성 높음 (JVM이 해줌)
//    // - but 왜곡될 가능성 있음 
//    // 2. 유효자리수가 아닌 것
//    // - 
  }
}
