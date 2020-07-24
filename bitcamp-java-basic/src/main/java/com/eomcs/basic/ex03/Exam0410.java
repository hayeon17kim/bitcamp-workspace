// Exam030.java

package com.eomcs.basic.ex03;


//# 문자 리터
class Exam0410 {
    public static void main(String[] args) {
      // 자바는 문자를 메모리에 저장할 때 Unicode 규칙에 따라
      // 2바이트 코드로 저장한다.
        
      // println()
      //
        System.out.println('A');
        System.out.println("가");
        System.out.println("\u0041");
        System.out.println("\u4eba");
        System.out.println(0x41);
        System.out.println("\u4eba");
    }
}

// - 문자를 메모리에 저장하려면
//   2진수로 바꿀 수 있어야 한다.
// - 문자를 2진수로 바꾸는 규칙을
//   "문자집합(Character Set)"이라 한다.
// - 문자 집합에는 여러 규칙이 있다.
//   - ASCII(7비트, American Standard Code for Information Interchange)
//     - 영어 대소문자, 숫자, 특수문자 등
//     - 'A' => 100_0001 = 0x41
//     - 'B' => 100_0010 = 0x42
//     - '1' => 011_0001 = 0x31
//     - '2' => 011_0002 = 0x32
//     - 한글(11172자)은 정의되어 있지 않다.
//   - ISO/IEC 8859
//     - ASCII 문자 + 유럽 문
//   - EUC-KR (16비트, KSC-5601)
//     - 한글 2350자에 대한 규칙
//     - '가' => 10110000_10100001 = 0xb0a1
//     - '각' => 10110000_10100010 = 0xb0a2
//     - 현대 통용되는 한글 음절 11172자를 모두 표현할 수 없다.
//   - unicode(16비트, ISO10646)
//     - 영어, 한글 모두 2바이트로 표현
//     - 모든 국가의 문자를 담고 있다.
//     - 'A' => 0x0041
//     - 'B' => 0x0042
//     - '1' => 0x0031
//     - '2' => 0x0032
//     - '가' => 0xac00
//     - '각' => 0xac01
//     - 영어를 2바이트로 표현하기 때문에 비효율적이다.
//     - 한글은 새로 정의했기 때문에 EUC-KR과 호환되지 않는다.
//   - UTF-8(Universal Coded Character Set Transformation Format, 8비트 ~ 32비트))
//     - unicode를 문자를 규칙 따라 1~4바이트로 변환한다.
//     - ISO-8850-1(영어, 숫자, 특수문자): 1바이트로 표현한다.
//       - 'A' => 0x41
//       - 'B' => 0x42
//       - '1' => 0x31
//     - 한글은 3바이트로 표현한다.
//       - 1110xxxx 10xxxxxx 10xxxxxx
//       - '가' => 0xac00(10101100_00000000, unicode) 
//              => 1110xxxx 10xxxxxx 10xxxxxx (변환규칙)
//              => 11101010 10110000 10000000 (규칙에 값 적용)
//              => 0xEAB080(UTF-8)
//     - 문자에 따라 바이트 크기가 다르다. 
//     - 기존의 ISO-8850-1은 1바이트로 표현한다.
//     - 한글은 규칙에 따라 3바이트로 변환한다.








