package com.eomcs.basic.ex07.practice;

// call by value vs call by reference

public class Exam0310 {
 
  // "새로운 종류의 메모리"!!!를 만들어라
  //  새 데이터 타입을 정의
  // 클래스를 정의 : 새 데이터 타입을 정의 : 새 메모리를 설계한다 
  // (문자열과 Int값과  boolean값을 담을 메모리)
  // 새로운 메모리는 항상 new 로 적어야 한다.
  static class Person {
    String name;
    int age;
    boolean working;
  }
  
  public static void main(String[] args) {
    int a = 200;
    m1(a);  // 매서드 호출할 때 만들어진 값은 호출하고 나면 사라짐
    System.out.println(a);
    
    a = 300;
    
    m1(a);
    System.out.println();
    
    int[] arr = new int[3];
    arr[0] = 100;
    arr[1] = 200;
    arr[2] = 300;
    m2(arr); // call by reference
    
    System.out.println(arr[0]);
    System.out.println(arr[1]);
    System.out.println(arr[2]);
    
    System.out.println("-----------");
    Person p;// Person설계도에 따라 메모리를 만들고 주소를 저장한다.
    p = new Person();
    
    System.out.printf("%s, %d, %b\n", p.name, p.age, p.working);
    
    m3(p); // call by reference
    
    System.out.printf("%s, %d, %b\n", p.name, p.age, p.working);
  }
  
  static void m1(int a) {
    a = 100;
  }
  
  static void m2(int[] arr) {
    arr[0] *= 2;
    arr[1] *= 3;
    arr[2] *= 4;
  }
  
  static void m3(Person p) {
    p.name = "monica";
    p.age = 25;
    p.working = false;
  }
}

// 시험지:
// 1. 다음 계산을 수행하라.
//    a 변수에 100을 넣어라.
//    b 변수에 200을 넣어라.
//    a와 b를 더해 그 결과를 출력하라.
//
// 코드는 시험지(명령어)임. 풀이과정이 아니라. 
// 명령어를 사용하는 동안에 사용하는 메모리가 stack