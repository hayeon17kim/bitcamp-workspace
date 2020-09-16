package com.eomcs.exception.ex3;

public class Exam0650 {
  static class A {
  }
  static class B implements AutoCloseable {
    @Override
    public void close() throws Exception {
      System.out.println("B 클래스의 자원을 해제하였습니다.");
    }
  }

  public static void main(String[] args) {
    B obj2 = null;
    try (obj2 = new B()) {
      System.out.println("try 블록 실행...");
    }
  }
}
