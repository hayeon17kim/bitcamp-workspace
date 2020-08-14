package com.eomcs.corelib.ex03;

public class MyArrayList05 {
  // 1) 인스턴스/객체(의 주소)를 담을 레퍼런스 배열을 준비한다.
  // 2) 인스턴스를 추가하는 add() 메서드 정의
  // 3) 특정 인덱스의 인스턴스를 리턴하는 get() 메서드 정의
  // 4) 인스턴스를 특정 위치에 삽입하는 add(int, Object)메서드 추가한다.
  // 5) 특정 위치의 항목을 다른 인스턴스로 교체하는 set(int, Object) 메서드를 추가한다.
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
  
  static public Object set(int index, Object element) {
    Object prevElement = elementData[index];
    elementData[index] = element;
    return prevElement;
  }
  
}
