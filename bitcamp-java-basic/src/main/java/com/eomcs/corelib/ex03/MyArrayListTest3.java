package com.eomcs.corelib.ex03;

public class MyArrayListTest3 {
  public static void main(String[] args) {
    MyArrayList list1 = new MyArrayList();
    
    list1.add("add");
    list1.add("bbb");
    list1.add("ccc");
    list1.add("ddd");
    
    MyArrayList list2 = new MyArrayList();
    list2.add("add");
    list2.add("bbb");
    list2.add("ccc");
    list2.add("ddd");
    
    print(list1);
    System.out.println("-------------");
    print(list2);
    

  }
  
  static void print(MyArrayList list) {
    for (int i = 0; i < list.size(); i++) {
      String str = (String) list.get(i);
      System.out.printf(str + ",");    
    }
    System.out.println();
  }
}
