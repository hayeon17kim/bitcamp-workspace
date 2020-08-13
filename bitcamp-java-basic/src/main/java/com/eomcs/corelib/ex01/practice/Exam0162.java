// Object 클래스 - getClass() 와 배열의 항목 이름
package com.eomcs.corelib.ex01.practice;

public class Exam0162 {
  public static void main(String[] args) {
    String[] obj2 = new String[10];
    Class<?> classInfo = obj2.getClass();
    System.out.println(classInfo.getName());
    
    Class<?> compTypeInfo = classInfo.getComponentType();
    System.out.println(compTypeInfo.getName());
    
    System.out.println(obj2.getClass().getComponentType().getName());
  }
}
