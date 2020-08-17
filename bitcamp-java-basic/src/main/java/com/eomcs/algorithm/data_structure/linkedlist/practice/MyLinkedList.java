package com.eomcs.algorithm.data_structure.linkedlist.practice;
//1) LinkedList 클래스 정의
//2) 값을 담을 노드 클래스를 설계한다.
//3) 첫 번째 노드와 마지막 노드의 주소를 담을 필드를 추가한다.
// 목록 크기를 저장할 필드를 추가한다.
//4) 목록에 값을 추가하는 add() 메서드를 정의한다.
//5) 목록에서 값을 조회하는 get() 메서드를 정의한다.
//6) 목록에서 특정 인덱스 위치에 값을 삽입하는 add(int, Object) 메서드를 정의한다.
//- Node의 생성자를 추가한다.
//7) 목록에서 특정 인덱스에 값을 제거하는 remove(int) 메서드를 정의한다.
//8) 목록에서 특정 인덱스의 값을 바꾸는 set(int, Object) 메서드를 정의한다.
//9) 목록의 데이터를 새 배열에 담아 리턴하는 toArray() 메서드를 정의한다.
public class MyLinkedList {
  
  Node first;
  Node last;
  public int size;
  
  static class Node {
    Object value;
    Node next;
    
    public Node() {}
    public Node(Object value) {
      this.value = value;
    }
  }
  
  // boolean add(Object)
  public boolean add(Object element) {
    Node node = new Node(element);
    if (first == null) {
      first = node;
    } else {
      last.next = node;
    }
    last = node;
    size++;
    return true;
  }
  
  // void add(int, Object)
  public void add(int index, Object element) {
    if (index < 0 || index > this.size) {
      throw new IndexOutOfBoundsException();
    }
    Node node = new Node(element);
    
    size++;
    
    if(index == 0) {
      node.next = first;
      first = node;
      return;
    }
    
    Node cursor = first;
    for (int i = 0; i < index - 1; i++) {
      cursor = cursor.next;
    }
    
    node.next = cursor.next;
    cursor.next = node;
    
  }
  
  // Object get(int)
  public Object get(int index) {
    if (index < 0 || index >= this.size) {
      throw new IndexOutOfBoundsException();
    }
    Node cursor = first;
    for (int i = 0; i < index; i++) {
      cursor = cursor.next;
    } 
    // index=0이라면 아예 for loop 자체가 실행 x
    return cursor.value;
  }
  
  // Object remove(int)
  public Object remove(int index) {
    
    if (index < 0 || index >= this.size) {
      throw new IndexOutOfBoundsException();
    }
    
    size--;
    
    if (index == 0) {
      Node old = first;
      first = old.next;
      old.next = null;
      return old.value;
    }
    
    Node cursor = first;
    for (int i = 0; i < index - 1; i++) {
      cursor = cursor.next;
    }
    
    Node old = cursor.next;
    cursor.next = old.next;
    old.next = null;
    
    return old.value;
  }
  
  
  // Object set(int, Object)
  public Object set(int index, Object element) {
    
    if (index < 0 || index >= this.size) {
      throw new IndexOutOfBoundsException();
    }
    
    Node cursor = first;
    for (int i = 0; i < index; i++) {
      cursor = cursor.next;
    }
    Node old = cursor;
    cursor.value = element;
    return old.value;
  }
  
  // Object[] toArray()
  public Object[] toArray() {
    Object[] arr = new Object[this.size];
    Node cursor = first;
    int i = 0;
    while (cursor != null) {
      arr[i++] = cursor;
      cursor = cursor.next;
    }
    return arr;
  }

}
