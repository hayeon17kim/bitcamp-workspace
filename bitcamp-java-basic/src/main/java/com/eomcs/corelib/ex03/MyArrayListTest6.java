package com.eomcs.corelib.ex03;

public class MyArrayListTest5 {
  public static void main(String[] args) {
    // 제네릭 타입 안알려주고 써도 실행하는 데 전혀 상관 없음
    // 근데 알려달라고 했으면 알려 줘야지!
    MyArrayList<String> list1 = new MyArrayList<>(100);
    
    list1.add("add");
    list1.add("bbb");
    list1.add("ccc");
    list1.add("ddd");
    list1.add("eee");
    list1.add("fff");
    list1.add("ggg");
    list1.add(Integer.parseInt("1"));
    
    print(list1);
    System.out.println("-------------");
    
    MyArrayList list2 = new MyArrayList();
    list2.add("fff");
    list2.add("ggg");
    list2.add("hhh");
    list2.add("iii");
    list2.add("jjj");
    list2.add("kkk");
    list2.add("lll");

    print(list1);    
    System.out.println("---------");
    print2(list1);
  }
  
  static void print(MyArrayList<String> list) {
    for (int i = 0; i < list.size(); i++) {
      String str = (String) list.get(i);
      System.out.printf(str + ",");    
    }
    System.out.println();
  }
  
  static void print2(MyArrayList<String> list) {
    String[] arr = new String[list.size()];
    String[] arr2 = list.toArray(arr);
    System.out.println(arr == arr2);
    for (int i = 0; i < list.size(); i++) {
      System.out.printf(arr[i] + ",");    
    }
    System.out.println();
  }
  
  static void print3(MyArrayList<String> list) {
    String[] arr = new String[list.size()];
    String[] arr2 = list.toArray(arr);
    for (int i = 0; i < list.size(); i++) {
      String str = (String) list.get(i);
      System.out.printf(str + ",");    
    }
    System.out.println();
  }
}
