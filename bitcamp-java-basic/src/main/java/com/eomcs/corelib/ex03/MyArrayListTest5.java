package com.eomcs.corelib.ex03;

public class MyArrayListTest5 {
  public static void main(String[] args) {
    // 제네릭 타입 안알려주고 써도 실행하는 데 전혀 상관 없음
    // 근데 알려달라고 했으면 알려 줘야지!
    MyArrayList<String> list1 = new MyArrayList<>();
    list1.add("aaa"); // aaa
    list1.add("bbb"); // aaa,bbb
    list1.add("ccc"); // aaa,bbb,ccc
    list1.add("ddd"); // aaa,bbb,ccc,ddd
    list1.add("eee"); // aaa,bbb,ccc,ddd,eee
    list1.add(1, "fff"); // aaa,fff,bbb,ccc,ddd,eee
    list1.set(3, "ggg"); // aaa,fff,bbb,ggg,ddd,eee
    System.out.println("==> " + list1.remove(2)); // // aaa,fff,ggg,ddd,eee
    print(list1);
  }
  
  static void print(MyArrayList<String> list) {
    for (int i = 0; i < list.size(); i++) {
      String str = (String) list.get(i);
      System.out.printf(str + ",");    
    }
    System.out.println();
  }
  
  
}
