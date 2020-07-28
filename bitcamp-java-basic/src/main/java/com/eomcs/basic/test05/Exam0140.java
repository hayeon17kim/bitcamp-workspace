package com.eomcs.basic.test05;

//# 산술 연산자 : 데이터 타입과 연산자

public class Exam0140 {
  public static void main(String[] args) {
    // 데이터 타입에 따라 제공되는 연산자가 다르다.
    
    System.out.println(5.75 % 0.24);
    //System.out.println(true % false);
    //System.out.println(true + true);
    
    System.out.println("Hello," + "world!");
    //System.out.println("Hello," - "-");
    //System.out.println("Hello," * 5);
    
    System.out.println(true && true);
    //System.out.println(10 && 10);
    // 논리연산자(&&, ||)의 피연산자는 반드시 boolean 타입이어야 한다.
  }
}
