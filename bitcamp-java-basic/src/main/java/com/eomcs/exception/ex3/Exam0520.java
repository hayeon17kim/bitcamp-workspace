package com.eomcs.exception.ex3;

import java.io.IOException;
import java.sql.SQLException;

public class Exam0520 {
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

  public static void main(String[] args) throws Exception {
    try {
      m(1);
    } finally {
      // try 문을 나가기 전에 무조건 실행해야 할 작업이 있다면
      // catch 블록이 없어도 finally 블록만 사용할 수 있다.
      System.out.println("finally");
    }
  }
}
