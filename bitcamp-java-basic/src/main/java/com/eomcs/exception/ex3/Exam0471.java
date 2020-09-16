package com.eomcs.exception.ex3;

import java.io.IOException;
import java.sql.SQLException;

public class Exam0471 {
  static void m(int i) throws Exception, RuntimeException, SQLException, IOException {
    if (i == 0)
      throw new Exception();
    else if (i == 1)
      throw new RuntimeException();
    else if (i == 2)
      throw new SQLException();
    else if (i == 3)
      throw new IOException();
    else if (i < 0)
      throw new Error();
  }

  public static void main(String[] args) {
    try {
      m(-1);
    } catch (Throwable e) {
      System.out.println("애플리케이션 예외 발생!");
    }
  }
}
