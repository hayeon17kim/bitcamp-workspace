package com.eomcs.oop.ex04.practice;

import java.util.Calendar;
import java.util.Date;

public class Exam0210 {
  public static void main(String[] args) throws Exception {
    String s1 = new String("Hello");
    String s2 = new String("ABC가각");
    // 인스턴스 메서드
    // - none-static method
    // - 인스턴스 주소를 가지고 호출해야 한다.
    // - this라는 내장변수가 있다.
    // - 특정 인스턴스의 변수를 다루는 메서드

    char c1 = s1.charAt(1);
    System.out.println(c1);

    char c2 = s2.charAt(1);
    System.out.println(c2);

    System.out.println(s1.compareTo(s2));
    // 차이를 리턴한다.
    // 정렬상 앞에 있는지 뒤에 있는지 알기 위한 것
    // 음수면 이 문자열 앞에, 양수면 이 문자열 뒤에 있다는 뜻
    // 숫자 크기는 생각하지 마!

    System.out.println(s1.contains("ll"));
    System.out.println(s2.contains("ll"));
    // charSequence: 문자열
    // 문자열 안에 특정 문자열이 포함되어 있는지 알기 위해서

    System.out.println(s1.equals(s2));

    // encode this string into a sequence of using the platform's default charset.
    // (문자를 일련의 바이트로 코드화시킬 때 운영체제의 기본 문자 집합을 사용해서 일련의 바이트 배열로 코드화)
    // 영어는 둘다 똑같음. 한글이 문제야
    byte[] bytes = s2.getBytes(); // JVM(UTF-16) ==> OS기본문자표(linux/unix: UTF-8, windows: MS949)
    // "ABC가각"
    // - linux/unix: 41 42 43 ea b0 80 ea b0 81
    // - windows: 41 42 43 b0 a1 b0 a2
    for (byte b : bytes) {
      System.out.println(Integer.toHexString(b) + ", ");
    }
    System.out.println();
    
    for (byte b : bytes) {
      System.out.println(Integer.toHexString(b & 0xff) + ", ");
    }
    System.out.println();
    // 비록 바이트지만 출력할 때는 4바이트로 바뀐다.
    // 졸지에 앞에 ff가 붙어버림. 이걸 없애기 위해 &0xff 연산
    // 출력할 때는 4바이트 정수로 바꾼다. 기본적으로 4바이트니까.
    System.out.println("-------------------");
    byte[] bytes2 = s2.getBytes("ms949"); // 지정한 문자표
    // - windows: 41 42 43 b0 a1 b0 a2
    for (byte b : bytes2) {
      System.out.println(Integer.toHexString(b & 0xff));
      // static method: 주어진 파라미터만 가지고 작업
    }
    // so, 실무에서는 무조건 문자표를 지정해라 !!! (UTF-8로!!!!)


    System.out.println("-------------------");

    String s3 = String.format("Hello, %s!", "Monica");
    System.out.println(s3);

    String s4 = String.join(", ", "monica", "maria", "julia");
    System.out.println(s4);

    String s5 = String.valueOf(true);
    // 문자열을 리턴
    // (문자열을 담고 있는 스트링 인스턴스를 생성하고 그 주소를 리턴)
    String s6 = String.valueOf(100);
    String s7 = String.valueOf(3.14f);
    System.out.printf("%s, %s, %s", s5, s6, s7);

    System.out.println(Math.abs(-100));
    System.out.println(Math.ceil(-3.28));
    System.out.println(Math.floor(-3.28));
    System.out.println(Math.round(3.4));
    System.out.println(Math.round(3.5));
    System.out.println(Math.pow(2, 7));

    Date d1 = new Date();
    System.out.println(d1.getYear() + 1900);
    System.out.println(d1.getMonth() + 1);
    System.out.println(d1.getDate());
    System.out.println(d1.getDay());

    long millis = Date.parse("Sat, 12 Aug 1995, 13:30:25 GMT");
    System.out.println(millis);

    // 이름이 같은 클래스는 하나는 그냥 다 써줘야 함
    java.sql.Date d2 = java.sql.Date.valueOf("2020-08-10");
    System.out.println(d2.getYear() + 1900);
    System.out.println(d2.getMonth() + 1);
    System.out.println(d2.getDate());

    long curr = System.currentTimeMillis();
    Date d3 = new Date(curr);
    System.out.println(d3.getYear() + 1900);
    System.out.println(d3.getMonth() + 1);
    System.out.println(d3.getDate());

    Calendar cal = Calendar.getInstance();
    System.out.println(cal.get(1)); // year
    System.out.println(cal.get(2) + 1); // month
    System.out.println(cal.get(5)); // date
    System.out.println(cal.get(7)); // 요일(1~7)
    System.out.println(cal.get(4)); // 해당 월의 몇 번째 주
    System.out.println(cal.get(10)); // 12hour
    System.out.println(cal.get(11)); // 24hour
    System.out.println(cal.get(12)); // 분
    System.out.println(cal.get(13)); // 초

    System.out.println("--------------------");

    System.out.println(cal.get(Calendar.YEAR)); // year
    System.out.println(cal.get(Calendar.MONTH) + 1); // month
    System.out.println(cal.get(Calendar.DATE)); // date
    System.out.println(cal.get(Calendar.DAY_OF_WEEK)); // 요일(1~7)
    System.out.println(cal.get(Calendar.WEEK_OF_MONTH)); // 해당 월의 몇 번째 주
    System.out.println(cal.get(Calendar.HOUR)); // 12hour
    System.out.println(cal.get(Calendar.HOUR_OF_DAY)); // 24hour
    System.out.println(cal.get(Calendar.MINUTE)); // 분
    System.out.println(cal.get(Calendar.SECOND)); // 초

    // int -> Integer, byte -> Byte, short -> Short, long -> Long
    // float -> Float, double -> Double, char -> Character
    Integer i1 = new Integer(100);
    Integer i2 = new Integer(100);

    System.out.println(i1.toString());
    System.out.println(i2.toString());
    System.out.println(i1 == i2);

    Integer i3 = Integer.valueOf(100);
    Integer i4 = Integer.valueOf(100);
    // 값이 같으면 굳이 따로 heap에 만들지 않음

    System.out.println(i3.toString());
    System.out.println(i4.toString());
    System.out.println(i3 == i4);
  }

}
