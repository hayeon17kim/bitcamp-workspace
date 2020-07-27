package com.eomcs.basic.ex04;

public class Exam0570 {
  public static void main(String[] args) {
    int[] arr1 = new int[5];
    
    arr1[0] = 100;
    arr1[1] = 90;
    arr1[2] = 80;
    arr1[3] = 70;
    arr1[4] = 60;
    
    // 1) 배열 선언 + 초기화 명령
    int arr2[] = new int[] {100, 90, 80, 70, 60};
    
    // 2) 배열 선언 + 초기화 명령 2
    int arr3[] = {0, 0, 0, 0, 0};
    
    // 그러나 배열 변수를 선언한 후 따로 초기화시킬 때는 
    // 다음과 같이 new 명령ㅇ르 생략할 수 없다.
    int[] arr4;
    //arr4 = {100, 90, 80, 70 ,60}; //컴파일 오류!
    
    int[] arr5;
    arr5 = new int[] {0, 0, 0, 0, 0};
  }
}
