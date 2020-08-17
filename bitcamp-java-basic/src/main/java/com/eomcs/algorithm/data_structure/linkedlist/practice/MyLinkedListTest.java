package com.eomcs.algorithm.data_structure.linkedlist.practice;

import com.eomcs.algorithm.data_structure.linkedlist.MyLinkedList;

public class MyLinkedListTest {
  public static void main(String[] args) {
    MyLinkedList list = new MyLinkedList();
    list.add("aaa");
    list.add("bbb");
    list.add("ccc");
    list.add("ddd");

    System.out.println(list.get(0));
    System.out.println(list.get(1));
    System.out.println(list.get(2));
    System.out.println(list.get(3));
    //System.out.println(list.get(-1));
    //System.out.println(list.get(4));
    System.out.println("------------");
    print(list); // aaa,bbb,ccc,ddd,
    
    System.out.println("------------");
    
    list.add(2, "eee"); 
    list.add(0, "fff"); 
    list.add(6, "ggg"); 
    list.add("hhh");
    print(list);//fff, aaa, bbb, eee, ccc, ddd, ggg, hhh
    
    System.out.println("------------");
    System.out.println(list.remove(4));
    print(list);
    System.out.println(list.remove(0));
    print(list);
    System.out.println(list.remove(5));
    print(list);
    
    System.out.println("------------");
    
    System.out.println(list.set(1, "xxx"));
    print(list);
    System.out.println(list.set(0, "yyy"));
    print(list);
    System.out.println(list.set(4, "zzz"));
    print(list);
    
    System.out.println("------------");
    
    System.out.println("------------");
    print2(list.toArray());
    
  }
  
  static void print(MyLinkedList list) {
     for(int i = 0; i < list.size; i++) {
       System.out.print(list.get(i) + ",");
     }
     System.out.println();
  }
  
  static void print2(Object[] arr) {
    for (Object obj : arr) {
      System.out.print(obj + ",");
    }
    System.out.println();
  }
}
