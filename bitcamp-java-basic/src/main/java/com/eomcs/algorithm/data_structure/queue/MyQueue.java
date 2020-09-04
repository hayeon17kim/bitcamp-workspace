package com.eomcs.algorithm.data_structure.queue;

import com.eomcs.algorithm.data_structure.linkedlist.MyLinkedList;

public class MyQueue<E> extends MyLinkedList<E> implements Cloneable {
  public boolean offer(E e) {
    add(e);
    return true;
  }
  
  public E poll() {
    if (size() == 0) {
      return null;
    }
    return remove(0);
  }
  
  public E peek() {
    if (size() == 0) {
      return null;
    }
    return get(0);
  }
  
  @SuppressWarnings("unchecked")
  public MyQueue<E> clone() throws CloneNotSupportedException {
    MyQueue<E> newQueue = new MyQueue<>();
    Object[] values = toArray();
    
    for (Object value : values) {
      newQueue.offer((E)value);
    }
    
    return newQueue;
  }
}
