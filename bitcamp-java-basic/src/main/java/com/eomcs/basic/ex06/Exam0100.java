package com.eomcs.basic.ex06;

public class Exam0100 {
  public static void main(String[] args) {
    int age = 28;

    if (age >= 19) {
      System.out.println("성인");
    }

    if (age >= 68) {
      System.out.println("노인연금 수령 대상자입니다.");
    }

    System.out.println("==================");

    int gender = 1;

    if (gender == 1) {
      System.out.println("여성");
      System.out.println("----");
    } else {
      System.out.println("남성");
      System.out.println("----");
    }

    System.out.println("==================");

    int age2 = 17;
    if (age2 >= 19)
      if (age2 >= 65)
        System.out.println("지하철 무임승차 가능합니다.");
      else
        System.out.println("미성년입니다.");
    else
      System.out.println("okok");

    System.out.println("==================");

    int age3 = 67;

    if (age3 < 6)
      System.out.println("아동!");
    else
      if(age3 < 14)
        System.out.println("어린이!");
      else
        if (age3 < 19)
          System.out.println("청소년!");
        else
          if (age3 < 65)
            System.out.println("성인!");
          else
            System.out.println("노인!");

    System.out.println("==================");

    age3 = 3;

    if (age3 < 6)
      System.out.println("아동!");
    else if(age3 < 14)
      System.out.println("어린이!");
    else if (age3 < 19)
      System.out.println("청소년!");
    else if (age3 < 65)
      System.out.println("성인!");
    else
      System.out.println("노인!");

    System.out.println("==================");

    age3 = 67;

    if (age3 < 6)
      System.out.println("아동!");
    else if(age3 < 14)
      System.out.println("어린이!");
    else if (age3 < 19)
      System.out.println("청소년!");
    else if (age3 < 65)
      System.out.println("성인!");
    else
      System.out.println("노인!");

    System.out.println("==================");

    age3 = 22;



  }
}

// C : 0 이외의 모든 숫자는 true 값
// 자바 : true와 false가 명확히 있음
// 파이썬 : 들여쓰기 자체가 블럭
//boolean 타입의 값이 반드시 와야 한다.
// else 는 가장 가까운 if에 소속된다.
