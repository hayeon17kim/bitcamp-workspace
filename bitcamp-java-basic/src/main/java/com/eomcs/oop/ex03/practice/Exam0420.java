package com.eomcs.oop.ex03.practice;

// 폰 처음 킬 때 기본적인 음량과 밝기와 볼륨이 있음..

public class Exam0420 {
  
  static class SmartPhone {

    int volume;
    int bright;
    int contrast;
    
    // 다음과 같이 기본 생성자를 직접 정의할 수 있다.
    public SmartPhone() {
      System.out.println("SmartPhone() 생성자 호출됨");
    }
    
  }
  
  public static void main(String[] args) {
    // 인스턴스를 생성할 때 반드시 호출될 생성자를 지정해야 한다.
    // 안하면 문법 오류이다.
    // => new 클래스명(생성자에 넘겨 줄 값)
    // => 예) new A(); <- 생성자의 파라미터가 없기 때문에 값을 넘겨 주지 않는다.
    // => 예) new A(100); <- 생성자의 파라미터가 int이기 때문에 정수 값을 넘긴다.
    
    //new A; // 컴파일 오류
    
    // SmartPhone 인스턴스를 만들 때 기본 생성자가 호출되게 한다.
    
    // 다음과 같이 호출될 생성자를 지정하지 않으면 문법 오류이다.
    //SmartPhone obj1 = new SmartPhone; // 컴파일 오류 
    
    // 다음과 같이 존재하지 않는 생성자를 지정하면
    // 문법 오류이다.
    // SmartPhone obj1 = new SmartPhone(100); // int 파라미터를 가지는 생성자가 없다.
    
    // 다음과 같이 기본 생성자를 지정할 수 있다.
    SmartPhone obj1 = new SmartPhone(); // 파라미터가 없는 생성자 
    System.out.println(obj1.volume);
    System.out.println(obj1.bright);
    System.out.println(obj1.contrast);
  }
}
