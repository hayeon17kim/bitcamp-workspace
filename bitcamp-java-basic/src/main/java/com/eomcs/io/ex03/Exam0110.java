package com.eomcs.io.ex03;

import java.io.FileWriter;

public class Exam0110 {
  public static void main(String[] args) throws Exception {

    // 1) 문자 단위로 출력할 도구 준비
    FileWriter out = new FileWriter("temp/test2.txt");

    // 2) 문자 출력하기
    System.out.printf("file.encoding=%s\n", System.getProperty("file.encoding"));

    // => 이 예제를 이클립스에서 실행한다면,
    // 앞의 2바이트는 버리고,
    // 뒤의 2바이트(UCS2)를 UTF-8 코드표에 따라
    // 1 ~ 4 바이트 값으로 변환하여 파일에 쓴다.
    // => 즉 이클립스에서 자바 프로그램을 실행할 때
    // -Dfile.encoding=UTF-8 옵션을 붙여 실행하기 때문이다.
    // => OS의 기본 문자표로 출력하고 싶다면,
    // 콘솔창에서 위 옵션 없이 직접 이 클래스를 실행하라.
    //
    // UCS2에서 한글 '가'는 ac00이다.
    out.write(0x7a6bac00);
    out.write(0x7a5f0041);

  }
}
