package com.eomcs.generic.ex02.practice;

public class LinkedList {
  protected class Bucket {
    public Object value;
    public Bucket next;
    public Bucket prev;
  }
  
  protected Bucket head;
  protected Bucket tail;
  
  public LinkedList() {
    head = new Bucket();
    tail = head;
  }
  
  
  public void add(Object value) {
    tail.value = value;
    Bucket bucket = new Bucket();
    tail.next = bucket;
    bucket.prev = tail;
    tail = bucket;
  }
  
  public Object get(int i) {
    Bucket cursor = head;
    int count = 0;
    
    while (cursor != tail) {
      if (count == i)
        return cursor.value;
      count++;
      cursor = cursor.next;
    }
    return null;
  }
  
  public int size() {
    Bucket cursor = head;
  }
}
