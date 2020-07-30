package com.eomcs.basic.ex06;

import java.util.ArrayList;

// # 흐름 제어문 - for 반복문과 컬렉션

public class Exam0461 {
  public static void main(String[] args) {
    ArrayList list = new ArrayList();
    list.add("paraguay");
    list.add(234);
    list.add(true);
    list.add(3.14f);

    // for문에 컬렉션도 적용할 수 있다.
    // for (변수선언 : 컬렉션객체) 문장;
    for (Object value : list) {
      System.out.println(value);
    }

  }
}
