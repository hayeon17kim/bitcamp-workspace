package com.eomcs.corelib.ex03;

import java.util.ArrayList;

public class MyArrayListTest4 {
  public static void main(String[] args) {
    ArrayList list1 = new ArrayList();
    
    list1.add("add");
    list1.add("bbb");
    list1.add("ccc");
    list1.add("ddd");
    
    ArrayList list2 = new ArrayList();
    list2.add("add");
    list2.add("bbb");
    list2.add("ccc");
    list2.add("ddd");
    
    print(list1);
    System.out.println("-------------");
    print(list2);
    

  }
  
  static void print(ArrayList list) {
    for (int i = 0; i < list.size(); i++) {
      String str = (String) list.get(i);
      System.out.printf(str + ",");    
    }
    System.out.println();
  }
}
