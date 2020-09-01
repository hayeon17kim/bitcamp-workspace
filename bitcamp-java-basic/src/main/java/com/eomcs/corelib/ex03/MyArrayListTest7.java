package com.eomcs.corelib.ex03;

public class MyArrayListTest7 {
  public static void main(String[] args) {
    String s = "djfkdj";
    // 무슨 클래스 정보 담을 지 모르면 ?
    Class<?> classInfo = String.class;
    System.out.println(classInfo);
    //스태틱 필드

    //인스턴스 필드로 알아내는 방법
    Class<?> classInfo2 = s.getClass();
    System.out.println(classInfo2);

    System.out.println(classInfo == classInfo2);
  }
}
