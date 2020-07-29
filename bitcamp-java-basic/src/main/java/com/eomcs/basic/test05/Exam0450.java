package com.eomcs.basic.test05;

public class Exam0450 {
  public static void main(String[] args) {
    
    // 32바이트 소요 
    boolean c, cpp, java, js, python, php, html, css;
    c = true;
    cpp = false;
    java = true;
    js = false;
    python = true;
    php = false;
    html = true;
    css = false;
    
    // 배열 
    // 8바이트 소요
    boolean[] lang = new boolean[8];
    lang[0] = true;
    lang[1] = false;
    lang[2] = true;
    lang[3] = false;
    lang[4] = true;
    lang[5] = false;
    lang[6] = true;
    lang[7] = false;
    
    // 비트 연산자 사용 후
    // => 4바이트 변수 한 개만 있으면
    //    최대 32개의 데이터를 저장할 수 있다.
    int lang2 = 0;
    // 00000000 00000000 00000000 00000000
    
    lang2 |= 0x80;
    lang2 |= 0x20;
    lang2 |= 0x08;
    lang2 |= 0x02;
    
    System.out.println(Integer.toBinaryString(lang2));
  }
}
