package com.eomcs.basic.ex06;

public class Exam0150 {
  public static void main(String[] args) {
    int age = 15;

    // else는 가장 가까운 if에 소속된다.
    if (age >= 19)
      if (age >= 70)
        System.out.println("지하철 무임승차가 가능합니다.");
    else
      System.out.println("미성년입니다.");
    System.out.println("----------------");

    // else문은 if 없이 단독으로 사용할 수 없다.
    // 오직 if가 있어야만 사용할 수 있다.
    // 그래서 if ~ else ~는 한 문장으로 취급한다.
    // 그런 이유로, 위의 if (age >= 70) ~ else ~는 한 문장으로 간주한다.

    if (age >= 19) {
      if (age >= 70)
        System.out.println("지하철 무임승차 가능합니다.");
      else
        system.println("미성년입니다.");
    }
    System.out.println("-----------------");

    // 만약 else문을 첫 번째 if문에 소속되게 학 ㅗ싶다면
    // 다음과 같이 두 번째 if문을 블록으로 묶어라!
    if (age >= 19) {
      if (age >= 70)
        System.out.println("지하철 무임승차 가능합니다.");
    }
    else
      System.out.println("미성년입니다.");
  }
}
