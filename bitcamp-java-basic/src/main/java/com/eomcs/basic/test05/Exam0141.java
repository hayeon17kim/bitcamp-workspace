package com.eomcs.basic.test05;

//# 산술 연산자: 연산의 결과 타입 

public class Exam0141 {
  public static void main(String[] args) {
    
    // 연산을 수행한 후 생성된 결과도 피연산자와 같은 타입이다.
    
    int i = 5;
    int j = 2;
    float r = i / j;
    System.out.println(r); //2.0
    
    // 해결책!
    // - 변수에 들어 있는 값을 다른 타입으로 바꿔라.
    //   "형변환(type conversion = type casting)" 하라!
    r = (float)i / (float)j;
    
    System.out.println(r);
  }
}


// 형변환(type casting = type conversion)?
// - 변수나 리터럴을 다른 타입의 값으로 바꾸는 것이다.
// - 주의!
//   원래 변수의 타입을 바꾸는 것이 아니다.
//   내부적으로는 변수에 들어 있는 값을 꺼내
//   지정된 타입의 임시 메모리를 만들어 저장한다.

// 결론!
// 1) 자바의 최소 연산 단위는 int이다.
//    따라서 int 보다 작은 크기의 메모리 값을 다룰 때는
//    내부적으로 int로 자동 형변환을 수행한 다음에 연산을 수행한다.
//    내부적으로 자동 형변환하는 것을 
//    "암시적 형변환(implicit type conversion)"이라 부른다.
// => byte + byte = int
// => short + short = int
// => byte + short = int
//
// 2) 연산 결과는 항상 피연산자의 타입과 같다.
// => int + int = int
// => long + long = long
// => float + float = float
// => double + double = double
//
// 3) 다른 타입과 연산을 수행할 때는 
//    내부적으로 같은 타입으로 맞춘 다음에 실행한다. 