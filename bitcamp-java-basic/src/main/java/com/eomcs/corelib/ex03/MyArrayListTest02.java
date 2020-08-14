package com.eomcs.corelib.ex03;

public class MyArrayListTest02 {
  public static void main(String[] args) {
    MyArrayList.add("aaa"); 
    MyArrayList.add("bbb"); 
    MyArrayList.add("ccc"); 
    MyArrayList.add("ddd"); 
    MyArrayList.add("eee"); 
    
    MyArrayList.add("fff");   
    MyArrayList.add("ggg");
    MyArrayList.add("hhh");
    MyArrayList.add("iii");
    print();
    
    Object old = MyArrayList.remove(5);
    print();
    System.out.println(old);
    
    print();
    
    System.out.println(MyArrayList.get(7));
  }
  
  static void print() {
    for (int i = 0; i < MyArrayList.size; i++) {
      String str = (String) MyArrayList.get(i);
      System.out.printf(str + ",");    
    }
    System.out.println();
  }
}
