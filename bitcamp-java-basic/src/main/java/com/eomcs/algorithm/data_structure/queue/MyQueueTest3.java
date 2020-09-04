package com.eomcs.algorithm.data_structure.queue;

public class MyQueueTest3 {
  public static void main(String[] args) throws Exception {
    MyQueue queue = new MyQueue();
    queue.offer("aaa");
    queue.offer("bbb");
    queue.offer("ccc");
    queue.offer("ddd");
    
    print(queue);
    MyQueue queue2 = queue.clone();
    queue2.poll();
    queue2.poll();
    queue2.poll();
    queue2.poll();
    
    print(queue2);
    print(queue);
    
  }
  
  private static void print(MyQueue queue) {
    for(int i = 0; i < queue.size(); i++) {
      System.out.println(queue.get(i));
    }
    System.out.println();
  }
}
