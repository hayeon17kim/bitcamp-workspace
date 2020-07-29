package com.eomcs.basic.test05;

public class Exam0630 {
  public static void main(String[] args) {
    int i = 7;
    
    int j = i++;
    // j = 7
    // i = i + 1 = 8
    
    // 위 문장은 다음과 같이 실행된다.
    // int temp = i;
    // i = i + 1;
    // j = temp;
    //
    // 1) i 값을 그자리에 놓는다.
    //    => j = 7;
    //    => 7 값을 j에 저장할 수 없다.
    //    => 왜? 아직 = 연산자 오른쪽의 모든 식이 수행되지 않는다.
    // 2) ++ 연산 실행
    //    => 즉 i = i + 1 실행 
    //    => i = 8 이 되었다.
    // 3) 할당 연산자 실행
    //    => j = 7;
    
    
    System.out.println(i);  // 8
    System.out.println(j);  // 7
  }
}
