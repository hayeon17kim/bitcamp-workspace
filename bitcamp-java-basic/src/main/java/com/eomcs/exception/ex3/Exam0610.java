package com.eomcs.exception.ex3;

import java.util.Scanner;

public class Exam0610 {
  public static void main(String[] args) {
    Scanner keyScan = new Scanner(System.in);

    System.out.print("입력> ");
    int value = keyScan.nextInt();
    System.out.println(value * value);

    keyScan.close();
  }
}
