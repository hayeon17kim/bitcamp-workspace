package com.eomcs.basic.ex06;

import java.util.ArrayList;

public class Exam0460 {
  public static void main(String[] args) {
    // 배열은 같은 타입의 값만 보관할 수 있지만
    // 컬렉션은 다른 타입의 값도 보관할 수 있다.
    //
    // 배열은 크기가 고정되지만,
    // 컬렉션은 크기가 가변적이다.

    ArrayList list = new ArrayList();
    list.add("cake");
    list.add(23994);
    list.add(true);
    list.add(3.14);

    for (int i = 0; i < list.size(); i++) {
      System.out.println(list.get(i));
    }

  }
}
