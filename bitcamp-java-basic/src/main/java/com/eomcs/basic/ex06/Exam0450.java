package com.eomcs.basic.ex06;

//# 흐름 제어문 - for(:) 와 배열
//
public class Exam0450 {
  public static void main(String[] args) {
    String[] bands = {"Beach House", "My Bloody Valentine", "Joy Division", "The Smiths", "Cupido"};

    for (String band : bands) {
      System.out.println(band);
    }

  }
}
