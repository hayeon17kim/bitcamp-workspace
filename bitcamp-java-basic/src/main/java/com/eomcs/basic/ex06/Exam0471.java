package com.eomcs.basic.ex06;

import java.util.ArrayList;

public class Exam0471 {
  public static void main(String[] args) {
    ArrayList<String> list = new ArrayList<>();

    list.add("lithuania");
    list.add("paraguay");
    list.add("ukraine");
    list.add("france");
    list.add("morocco");

    for(String country : list) {
      System.out.println(country);
    }
  }
}
