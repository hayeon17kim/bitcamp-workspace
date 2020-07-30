package com.eomcs.basic.ex06;

// 상수를 쓰는 이유: 코드가 명확해짐.

public class Exam0200 {



  public static void main(String[] args) {
    final int DEVELOPER = 1;
    final int GENERAL_MANAGER = 2;
    final int BUILDING_MANAGER = 3;

    int type = 2;

    // 복잡한 조건일 경우 if 문이 낫다.
    if (type == DEVELOPER) {        // 개발
      System.out.println("정보처리자격증");
      System.out.println("졸업증명서");
      System.out.println("이력서");
    } else if (type == GENERAL_MANAGER) { // 일반관리
      System.out.println("졸업증명서");
      System.out.println("이력서");
    } else if (type == BUILDING_MANAGER) { // 시설관리
      System.out.println("이력서");
    } else {
      System.out.println("잘못된 지원입니다.");
    }

    System.out.println("----------------");

    // 단순 비교
    switch (type) {
      case DEVELOPER :
        System.out.println("정보처리자격증");
      case GENERAL_MANAGER :
        System.out.println("졸업증명서");
      case BUILDING_MANAGER:
        System.out.println("이력서");
        break;
      default:
        System.out.println("잘못된 지원입니다.");

    }

    System.out.println("----------------");

    int score = 70;

    switch (score) {
      case 100:
      case 90:
        System.out.println("A");
        break;
      case 80:
      case 70:
        System.out.println("B");
        break;
      case 60:
      case 50:
        System.out.println("C");
        break;
      default:
        System.out.println("F");
    }

    System.out.println("----------------");
    String value = "developer";
    final String value2 = "hello";

    switch (value) {    // 4byte 이하 정수(byte, short, int, char), 문자열
      case "developer":
        break;
      case "manager":
        break;
      case value2:
        break;
      case "ok" + "haha":   // 상수 표현식
        break;
      default:
    }

    int value3 = 100;
    final int x = 200;
    switch (value3) {
      case 100:
        break;
      case 100 + 3:
        break;
      case x:
        break;

    }

    System.out.println("-----------------");

    Job type2 = Job.DEV;

    switch (type2) {
      case DEV:
        break;
      case GM:
        break;
      case BM:
        break;
    }


    // 리터럴과 상수는 case에 올 수 있지만 변수는 올 수 없다.
    // 저 자리에는 값을 고정해야 한다. 변수는 바뀔 수 있다.
    // 상수가 되는 순간 중복되는 것을 검사할 수 있다.
    //

    // 범위는 if
  }

  enum Job {
   DEV, GM, BM
  }


  // 상수 그룹을 별도로 만들어서 이름만 기술
  // https://woowabros.github.io/tools/2017/07/10/java-enum-uses.html
  // 변수 자체는 int이기 때문에 아무 숫자나 넣을 수 있다. 이 실수를 방지하기 위해
  // 지정된 상수값만 넣는 변수를 만들고 싶음
  // 상수가 1인지 문자열인지 지정x
  // 상수를 저장할 변수를 만듦
  // Job type2 = Job.DEV; (그룹명을 반드시 언급해야 한다. 그룹에 있는 상수값을 넣어라.)






}
