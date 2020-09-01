package com.eomcs.util;

import java.util.Arrays;

// ArrayList 가 다룰 객체의 타입을 파라미터로 받을 수 있도록 '타입 파라미터'를 선언한다. 
public class ArrayList<E> {

  static final int DEFAULT_CAPACITY = 3;
  Object[] elementData;
  int size = 0;

  public ArrayList() {
    // 배열을 만들 때는 타입 파라미터를 사용할 수 없다.
    //list = new E[DEFAULT_CAPACITY]; // 컴파일 오류!
    elementData = new Object[DEFAULT_CAPACITY];
  }

  public ArrayList(int initialCapacity) {
    if (initialCapacity <= DEFAULT_CAPACITY) {
      elementData = new Object[DEFAULT_CAPACITY];
    } else {
      elementData = new Object[initialCapacity];
    }
  }

  // 메서드의 파라미터를 선언할 때 클래스 선언부에 지정한 타입 파라미터의 이름을 사용한다.  
  public boolean add(E e) {
    if (size == elementData.length) {
      grow();
    }
    elementData[size++] = e;
    return true;
  }
  
  private void grow() {
    int newCapacity = elementData.length + (elementData.length >>1);
    elementData = Arrays.copyOf(elementData, newCapacity);
  }
  
  public void add(int index, E element) {
    if (size == elementData.length) {
      grow();
    }
    if (index < 0 || index > size) {
      throw new ArrayIndexOutOfBoundsException("인덱스가 유효하지 않습니다.");
    }
    for (int i = size; i > index; i--) {
      elementData[i] = elementData[i -1];
    }
    elementData[index] = element;
    size++;
  }
  
  @SuppressWarnings("unchecked")
  public E set(int index, E element) {
    if (index < 0 || index > size) {
      throw new ArrayIndexOutOfBoundsException("인덱스가 유효하지 않습니다.");
    } 
    Object old = elementData[index];
    elementData[index] = element;
    return (E) old;
  }
  
  @SuppressWarnings("unchecked")
  public E remove(int index) {
    Object old = elementData[index];
    
    System.arraycopy(elementData, index + 1, elementData, index, this.size - (index + 1));
    
    size--;
    elementData[size] = null;
    return (E) old;
  }
  
  @SuppressWarnings("unchecked")
  public E get(int index) {
    if (index < 0 || index >= size) {
      throw new ArrayIndexOutOfBoundsException("인덱스가 유효하지 않습니다.");
    }
    return (E) elementData[index];
  }
  
  public int size() {
    return this.size;
  }
  
  public Object[] toArray() {
    Object[] arr = Arrays.copyOf(elementData, this.size);
    return arr;
  }
  
  //메서드의 리턴 타입을 선언할 때 클래스 선언부의 타입 파라미터의 이름을 사용한다.
  @SuppressWarnings("unchecked")
  public E[] toArray(E[] arr) {
    if (arr.length < this.size) {
      return (E[]) Arrays.copyOf(this.elementData, this.size, arr.getClass());
    }
    // Object[] 배열이 아닌 임의 타입 배열을 만들어 복사하려면 
    // Arrays.copyOf() 를 호출할 때 반드시 배열의 타입 정보를 넘겨야 한다.
    // 이를 위해 toArray() 메서드에서 배열의 타입 정보를 받을 수 있도록 파라미터를 선언한다.
    System.arraycopy(this.elementData, 0, arr, 0, this.size);
    return arr;
  }
}




