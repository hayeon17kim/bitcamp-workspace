package com.eomcs.corelib.ex01.practice;

public class Exam0141 {
  static class My {
    String name;
    int age;
    
    @Override
    public int hashCode() {
      String str = String.format("%s,%d", this.name, this.age);
      return str.hashCode();
      // 재귀호출이 아니다!
      // 지금 이건 인스턴스 메서드
      // 나중에 My 클래스의 인스턴스가 사용할 메서드임
      // 그러나 str.hashCode()에서 hashCode()는 String 클래스의 인스턴스인 str
      // 이 쓰는 메서드임으로 그건 String 클래스에 hashCode()가 오버라이딩되어있다면 
      // 그것을 사용하고 오버라이딩 되어 있지 않다면 Object의 원래 해쉬
      // ...????
    }
  }
  
  public static void main(String[] args) {
    My obj1 = new My();
    obj1.name = "홍길동";
    obj1.age = 20;
    
    My obj2 = new My();
    obj2.name = "홍길동";
    obj2.age = 20;
    
    System.out.println(obj1 == obj2);
    System.out.println(obj1.equals(obj2));
    System.out.println(Integer.toHexString(obj1.hashCode()));
    System.out.println(Integer.toHexString(obj2.hashCode()));
    
    System.out.println(obj1);
    System.out.println(obj2);
  }
}
