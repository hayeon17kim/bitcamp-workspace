// anonymous class - 호출할 수퍼 클래스의 생성자 지정하기
package com.eomcs.oop.ex11.e;

public class Exam0310 {
  // 클래스는 스태틱으로 선언해야만 스태틱 멤버에서 접근할 수 있다.
  static class A {

    String name;

    public A() {
      name = "이름 없음";
    }
    // 외부에서 들어온 값을 final로 선언
    // 밖으로 들어온 값을 바꿔버리는 건 안됨
    // 이게 기본임.. 특별한 경우 아니면 파라미터는 final로 선언하면
    // 컴파일 단계에서 잘못된 사용을 걸러내서 깔끔한 코딩이 가능함.
    public A(final String name) {
      this.name = name;
    }

    public void print() {
      System.out.println(name);
    }
  }


  public static void main(final String[] args) {
    // 익명 클래스를 정의할 때 호출할 수퍼 클래스의 생성자를 지정할 수 있다.
    // 문법:
    // new 수퍼클래스명(파라미터,...) {}
    // 즉 생성자에 넘겨주는 파라미터로 호출될 생성자를 지정한다.
    //
    A obj = new A() {};
    obj.print();
    

    // 다음과 같이 익명 클래스의 인스턴스를 만들 때 값을 지정하면
    // 그 타입의 값을 받는 생성자가 호출된다.
    obj = new A("홍길동") {};
    obj.print();

    // 물론 다음과 같이 해당 타입의 값을 받을 생성자가 없으면
    // 컴파일 오류가 발생한다.
    //obj = new A(100) {};
  }
}
