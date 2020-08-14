package com.eomcs.corelib.ex03;

public class MyArrayList04 {
  // 1) 인스턴스/객체(의 주소)를 담을 레퍼런스 배열을 준비한다.
  // 2) 인스턴스를 추가하는 add() 메서드 정의
  // 3) 특정 인덱스의 인스턴스를 리턴하는 get() 메서드 정의
  static Object[] elementData = new Object[5];
  static int size;
  static public boolean add (Object e) {
    elementData[size++] = e;
    return true;
  }
  
  static public Object get(int index) {
    return elementData[index];
  }
  
  static void add (int index, Object e) {
    for (int i = size; i > index; i--) {
      elementData[i] = elementData[i-1];
    }
    elementData[index] = e;
    size++;
  }
  
}
