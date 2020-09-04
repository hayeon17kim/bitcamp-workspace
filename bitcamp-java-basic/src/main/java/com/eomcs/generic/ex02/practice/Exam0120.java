package com.eomcs.generic.ex02.practice;

import java.util.LinkedList;
import com.eomcs.generic.ex02.LinkedList2;

public class Exam0120 {
  public static void main(String[] args) {
    LinkedList2<Member> list = new LinkedList2<>();
    list.add(new Member("홍길동", 20));
    
    // 제네릭으로 타입을 지정하면 해당 타입이 아닌 경우 컴파일 오류가 발생한다.
    // 따라서 유효하지 않은 값이 들어가는 것을 막을 수 있다.
  }
}
