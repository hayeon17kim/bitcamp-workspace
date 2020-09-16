package com.eomcs.oop.ex12;

import java.util.function.Predicate;

public class PredicateExam {
  public static void main(String[] args) {
    // Predicate 인터페이스 구현체 준비하기
    Predicate<String> p = String::isEmpty;

    // 1) 로컬 클래스로 인터페이스 구현체 만들기
    class MyPredicate<T> implements Predicate<T> {
      @Override
      public boolean test(T t) {
        return ((String) t).isEmpty();
      }
    }
    Predicate<String> p2 = new MyPredicate<String>();

    // 2) 익명 클래스로 인터페이스 구현체 만들기
    Predicate<String> p3 = new Predicate<String>() {
      @Override
      public boolean test(String value) {
        return value.isEmpty();
      }
    };

    // 3) 람다로 인터페이스 구현체 만들기
    Predicate<String> p4 = str -> str.isEmpty();


    // 4) 메서드 레퍼런스를 사용하여 기존 클래스의 메서드를 인터페이스 구현체로 사용하기
    Predicate<String> p5 = String::isEmpty;
  }
}
