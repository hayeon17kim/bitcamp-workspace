package com.eomcs.algorithm.data_structure.linkedlist;

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
    System.out.println(list.set(4, Integer.valueOf(123)));
    print(list);
    
    System.out.println("------------");
    print2(list.toArray());
    
    System.out.println("*******");
    print3(list.toArray());
  }
  
  static void print(MyLinkedList list) {
    for (int i = 0; i < list.size(); i++) {
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
  
  static void print3(MyLinkedList<String> list) {
    // => 복사할 항목의 개수 만큼 배열을 만들어 전달하면
    //    ArrayList는 새 배열을 만들지 않고 우리가 준 배열에 값을 담아 리턴한다.
    String[] arr = 
    
    // => 복사할 항목의 개수보다 작은 크기의 배열을 주면
    //    ArrayList는 새 배열을 만들어 값을 복사한 다음 리턴한다.
    
    //String[] arr2 = list.toArray(new String[]{});
 // 즉시 가비지가 된다.
    
    String[] arr = new String[2];
    String[] arr2 = list.toArray(arr);
    
    System.out.println(arr == arr2);
    
    for (Object obj : arr) {
      System.out.print(obj + ",");
    }
    System.out.println();
  }
}
