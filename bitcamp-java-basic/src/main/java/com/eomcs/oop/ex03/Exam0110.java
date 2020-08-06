//162번 
package com.eomcs.oop.ex03;

public class Exam0110 {
  public static void main(String[] args) {
    class A {
      int v1;
      boolean v2;
      // 이 명령은 new 명령을 실행할 때 비로소 실행된다.
    }
    
    // A 클래스에 대해 new 명령ㅇ르 사용하기 전에는 v1, v2메모리는 존재하지 않는다.
    // 단지 설계도일 뿐이다.
    A obj1 = new A();
    A obj2 = new A();
    A obj3 = new A();
    
    // "인스턴스 변수는 레퍼런스를 통해 사용할 수 있다."
    obj1.v1 = 100;
    obj2.v1 = 200;
    obj3.v1 = 300;
    
    System.out.printf("%d, %d, %d\n", obj1.v1, obj2.v1, obj3.v1);
    
  }

}

// 인스턴스 변수는 new 명령을 실행할 때마다 생성되기 때문에
// 각각 구분되는 개별 데이터를 저장할 때 사용한다.
