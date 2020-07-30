package com.eomcs.basic.ex06;

import java.util.ArrayList;

public class Exam0470 {
  public static void main(String[] args) {
    // 제네릭 적용
    ArrayList<String> list = new ArrayList<>();
    list.add("manzana");
    list.add("papa");
    list.add("postres");
    list.add("batata");
    list.add("asado");

    for (int i = 0; i < list.size(); i++) {
      System.out.println(list.get(i));
    }
  }
}
