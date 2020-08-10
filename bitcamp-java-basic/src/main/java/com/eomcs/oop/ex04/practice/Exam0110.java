package com.eomcs.oop.ex04.practice;

import java.util.Calendar;
import java.util.Date;

public class Exam0110 {
  public static void main(String[] args) throws Exception {
    String s1 = new String();
    System.out.println("=> " + s1); // 빈 문자열
    
    String s2 = new String("String"); 
    // 로컬 변수는 항상 값이 담겨 있어야 함.
    // 값을 저장하지 않고 조회할 수 없다.
    // 빈 문자열과 null은 다르다.
    // 2
    
    char[] chars = new char[] {'H', 'e', 'l', 'l', 'o', '2', '!'};
    String s3 = new String(chars); // 캐릭터 배열을 받아서 인스턴스를 초기화시킴 
    System.out.println("=> " + s3);
    
    byte[] bytes = new byte[] {
        0x41, //A => 0041(01000001) => (00000000 01000001) (2바이트 유니코드로 바꿔서 저장)
        0x42, //B => 0042
        (byte)0xEA, //가 -128 ~ 127 (7f) // 형변환 안 하면 양수로 취급되고 그 순간 4바이트 됨
        // 강제로 바이트 메모리에 집어넣어 => 잘라도 괜찮아!
        // => AC00
        (byte)0xB0, 
        (byte)0xB0, 
        (byte)0x80, //각 => AC01
        (byte)0xEA,
        (byte)0xB0,
        (byte)0x81
    };
    
    String s4 = new String(bytes, "UTF-8"); // 규칙을 알려줘야 역으로 바꿀 수 있음
    System.out.println(s4);
    
    // 규칙을 제대로 알려주지 않으면 완전히 깨짐
    
    byte[] bytes2 = new byte[] {
        0x41, 
        0x42, 
        (byte)0xB0, //가 ==> AC00
        (byte)0xA1, 
        (byte)0xB0, //각 ==> AC01
        (byte)0xA2,
        (byte)0xB6, //똘 (EUC-KR)
        (byte)0xCA,
        (byte)0xBC, // 똠 (MS949/CP949)
        (byte)0x63,
        (byte)0xB6, // (EUC-KR)
        (byte)0xCB
    };
    
    String s5 = new String(bytes2, "MS949"); // 규칙을 알려줘야 역으로 바꿀 수 있음
    // MS949 : 11172자
    // EUC-KR : 2350자
    System.out.println(s5);
    
    // 규칙을 제대로 알려주지 않으면 완전히 깨짐
    
    Date d1 = new Date(); //실행하는 시점의 날짜와 시분초로 초기화시킨다.
    System.out.println(d1.toString());
    System.out.println(d1);  // 내부적으로 이렇게 d1.toString();
    // 아규먼트가 primitive type이나 String 타입이 아니면
    
    // 자바의 모든 클래스나 배열에 대해서 toString을 호출할 수 있다.
    // 인스턴스에 대해  toString()을 호출하여 그 리턴 값을 출력한다.
    
    int[] arr = new int[] {100, 200, 300};
    System.out.println(arr.toString()); //I@119d7047
    // 인트배열@해시코드
    // 인스턴스 식별할 때 사용하는 고유값 (주민등록번호)
    // 메모리 주소가 아니라!!! 해시코드이다.
    // 해시코드 값은 변경 가능
    
    int a = 100;
    System.out.println(a);
    
    Date d2 = new Date(100000);
    System.out.println(d2);
    // 사용하지 말라는 메서드
    // 객체지향적이지 않음.. 곧 사라질 메서드
    
    Date d3 = new Date(120, 8, 10);
    System.out.println(d3);
    
    // 클래스 중에서는 생성자를 공개하지 않은 경우가 있다.
    // 이런 클래스의 인스턴스를 만들려면 보통 다음 2가지 방법을 사용한다.
    // 1) 다른 클래스의 도움을 받는다.
    // 2) 해당 클래스에서 제공하는 클래스(static) 메서드를 사용한다.
    // 
    //Calendar c1 = new Calendar();
    Calendar c1 = Calendar.getInstance();
    System.out.println(c1); // c1은 원시타입이나 스트링이 아님. 따라서 c1.toString()의 리턴값을 출력
    
    Car car1 = new Car();
    Car car2 = new Car();
    System.out.println(car1 == car2);
    
    car1.model = "티코";
    car1.cc = 980;
    car2.model = "쏘나타";
    car2.cc = 1980;
    System.out.println(car1.model);
    System.out.println(car2.model);
    
    Car2 car3 = Car2.getInstance();
    Car2 car4 = Car2.getInstance();
    System.out.println(car3 == car4);
    car3.model = "비트카";
    System.out.println(car4.model);
    
  }
  
}

// 중첩 클래스(nested class)
// - 클래스 안에서 겹쳐서 선언되는 클래스
// 패키지 멤버 클래스: 바깥에 선언
class Car {
  String model;
  int cc;
}

class Car2 {
  String model;
  int cc;
  static Car2 obj; // 주소 넣을 것
  
  // 외부에서 호출 못함
  private Car2() {}
  
  // static method
  // 클래스이름 가지고 바로 호출 가능
  static Car2 getInstance() {
    // 보통 생성자를 private으로 막는 경우는
    // 인스턴스를 한 개만 생성하도록 제한하고 싶을 때이다.
    if (obj == null) {
      obj = new Car2(); // 주소가 들어있지 않다면 호출
    }
    return obj;
  }
}
//유니코드(2byte yyyyyyyy yyyyyyyy)
//UTF-8 (1111yyyy 11yyyyyy 11yyyyyy)

// 첫번째가 1로 시작하는지, 0으로 시작하는지, 숫자 범위가 어떻게 되는지
// 규칙
// 가 --> EA B0 B0 (11101010 10110000 10000000)
//


// UTF-8? UCS2(UTF-16) ===> UTF-8
// 비트암호
// 문자 ---> 암호
// A    ---> 0100 0001
// B    ---> 0100 0010
// 가   ---> 1110 1010 <- 앞이 1이네? 127을 넘어가네? 뒤에 2바이트를 더 읽어야겠구나!


// 