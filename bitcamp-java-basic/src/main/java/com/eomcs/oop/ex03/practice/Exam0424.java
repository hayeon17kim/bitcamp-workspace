package com.eomcs.oop.ex03.practice;

// 폰 처음 킬 때 기본적인 음량과 밝기와 볼륨이 있음..

// public class 는 반드시 소스파일 이름과 일치해야 한다. 
class SmartPhone {

  int volume;
  int bright;
  int contrast;

  private SmartPhone() {
    System.out.println("SmartPhone() 생성자 호출됨");
  }
  public SmartPhone(int volume) {
    System.out.println("SmartPhone(int) 생성자 호출됨");
    this.volume = volume;
    this.bright = 50;
    this.contrast = 50;
  }

}

public class Exam0424 {

  public static void main(String[] args) {
    // private 으로 접근을 제한한 경우 다른 클래스가 생성자를 지정할 수 없다.
    //SmartPhone obj1 = new SmartPhone();
    SmartPhone obj2 = new SmartPhone(50);
  }
}

