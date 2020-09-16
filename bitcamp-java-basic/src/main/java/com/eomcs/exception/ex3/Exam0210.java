package com.eomcs.exception.ex3;

import java.io.FileNotFoundException;

public class Exam0210 {
  static void m1() throws Throwable {
    throw new Throwable();
  }

  static void m2() throws FileNotFoundException, RuntimeException {
    int a = 100;
    if (a < 0)
      throw new FileNotFoundException();
    else
      throw new RuntimeException();
  }

  public static void main(String[] args) {}
}
