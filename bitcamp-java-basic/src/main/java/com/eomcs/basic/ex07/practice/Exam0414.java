package com.eomcs.basic.ex07.practice;

import java.util.ArrayList;

// Stack과 Heap 메모리 영역
//
public class Exam0414 {
  
  static class Score {
    String name;
    int kor;
    int eng;
    int sum;
    float aver;
    // 배열은 한 타입만 여러개 만드는 것
    // 설계도를 만든 후에 설계도에 따라 new Score(); 인스턴스를 만든다. 
  }

  public static void main(String[] args) throws Exception {
    Score s = new Score();
    
    Score s2;
    s2 = createObject();
    
  }
  
  //- Score 설계도에 따라 Heap에 생성한 메모리의 주소를 리턴
  //- Score 클래스에 따라 Heap에 생성한 인스턴스 주소를 리턴 
  //- Score 클래스의 인스턴스를 생성한 후 그 주소를 리턴
  //- Score 클래스의 인스턴스를 리턴
  //- Score의 인스턴스를 리턴
  //- Score 객체를 리턴
  
  // 객체는 주고받을 수 없음.
  // 인스턴스를 주고받는 다는 말은 주소를 주고받는다는 얘기
  // 월급의 레퍼런스를 받는 것. 돈 자체를 받는게 아님. 아파트의 레퍼런스만 받음 
  // 과자 사탕 처럼 주고받을 수 있는 것은 자바 원시 타입임 
  static Score createObject() {
    Score s = new Score();
    return s;
    
  }
  

  
}