package com.eomcs.basic.ex06;

public class Exam0130 {
  public static void main(String[] arge) {

    // if 문의 조건은 반드시 boolean 데이터여야 한다.
    if (true) System.out.println("1111");
    if (false) System.out.println("2222");
    if (10 < 8 +5) System.out.println("3333");

    //if (1) System.out.println("4444");
    //if (3.14f) System.out.println("44444");
    //if (0b0110 & 0b0011) System.out.println("4444");

    // == 연산자 대신 = 를 사용하는 경우 (오타)
    int a = 100;
    if (a == 100) System.out.println("5555");

    //if (a = 100) System.out.println("6666");

    boolean b;
    if (b = true) System.out.println("된다!");
  }
}
