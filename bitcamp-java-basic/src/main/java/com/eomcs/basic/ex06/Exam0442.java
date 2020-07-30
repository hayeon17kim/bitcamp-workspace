package com.eomcs.basic.ex06;

public class Exam0442 {
  public static void main(String[] args) {
    String[] series = {"la casa de los flores", "casa de papel", "narcos", "the stranger things", "elementary"};
    for (int i = 0; i < series.length; i+=2) {
      System.out.println(series[i]);
    }
  }
}
