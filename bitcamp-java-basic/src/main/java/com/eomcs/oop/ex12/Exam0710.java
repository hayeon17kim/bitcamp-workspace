package com.eomcs.oop.ex12;

import java.util.ArrayList;
import java.util.List;

public class Exam0710 {
  static interface ListFactory {
    List create();
  }

  public static void main(String[] args) {
    ListFactory f1 = ArrayList::new;

    List list = f1.create();

    System.out.println(list instanceof ArrayList);
    System.out.println(list.getClass().getName());
  }
}
