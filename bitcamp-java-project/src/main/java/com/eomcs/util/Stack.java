package com.eomcs.util;

public class Stack<E> extends LinkedList<E> implements Cloneable {
  public E pop() {
    if (size() == 0) {
      return null;
    }
    return remove(size() - 1);
  }

  public boolean push(E e) {
    return add(e);
  }

  public E peek() {
    return get(size() - 1);
  }

  public boolean empty() {
    return size() == 0;
  }

  @Override
  @SuppressWarnings("unchecked")
  public Stack<E> clone() throws CloneNotSupportedException {
    Stack<E> newStack = new Stack<E>();
    Object[] values = toArray();
    for (Object value : values) {
      newStack.push((E) value);
    }
    return newStack;
  }
}
