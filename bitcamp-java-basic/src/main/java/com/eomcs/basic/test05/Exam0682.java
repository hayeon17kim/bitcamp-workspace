package com.eomcs.basic.test05;

public class Exam0682 {
  public static void main(String[] args) {
    // 주의!
    // 1) pre-fix 연산자나 post-fix 연산자를 리터럴에 적용할 수 없다.
    //int x = ++100;    // 컴파일 오류!
    //x = 100++;        // 컴파일 오류!
    
    // 2) 변수에 동시에 적용할 수 없다.
    int y = 100;
    //++y++; //컴파일 오류
    //(++y)++; //컴파일 오류
    //++(y++); //컴파일 오류! 변수가 아니라 값(리터럴)이기 때문에
  }
}