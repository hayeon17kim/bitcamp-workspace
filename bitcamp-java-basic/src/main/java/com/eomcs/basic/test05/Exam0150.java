package com.eomcs.basic.test05;

//# 산술 연산자 : 암시적 형변환(implicit type conversion)

// 따로 안해도 JVM이 알아서 해 주는 
public class Exam0150 {
  public static void main(String[] args) {
    byte b = 1;
    short s = 2;
    int i = 3;
    long l = 4;
    float f = 5.5f;
    double d = 6.6;
    boolean bool = true;
    char c = 7;
    
    // byte + byte = int
    // => 연산을 하기 전에 byte 값이 int로 암시적 형변환 된다.
    //byte r1 = b + b
    
    // short + short = int
    // => 연산을 하기 전에 short 값이 int로 암시적 형변환 된다.
    // short r2 = s + s; // 컴파일 오류
    
    // byte + short = int
    
    // byte + int = int
    int r4 = b + i;
    
    // short + int = int
    int r5 = s + i;
    
    // int + long = long
    // int r6 = i + l;
    
    // long + float = float
    // long r7 = l + f;
    
    // int + float = float
    // int r8 = i + f;
    
    // float + double = double
    // float r9 = f + d;
    
    // byte + short + int + long + float + double = double
    
    // float + int + long = float
    
    // boolean + int = 컴파일 오류!
    // => 산술 연산자는 정수 타입 (byte, short, char, int, long)과
    //    부동소수점 타입(float, double)에 대해서만
    //    실행할 수 있다.
    //int r12 = bool + i;
    
    
  }
}
