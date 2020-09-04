package com.eomcs.util;

public class Queue<E> extends LinkedList<E> implements Cloneable {

  public boolean offer(E e) {
    return add(e);
  }

  public E poll() {
    if (size() == 0)
      return null;
    return remove(0);
  }

  public E peek() {
    if (size() == 0)
      return null;
    return get(0);
  }

  @SuppressWarnings("unchecked")
  @Override
  public Queue<E> clone() throws CloneNotSupportedException {
    Queue<E> newQueue = new Queue<>();
    Object[] values = toArray();
    for (Object value : values) {
      newQueue.offer((E) value);
    }
    return newQueue;
  }
}
