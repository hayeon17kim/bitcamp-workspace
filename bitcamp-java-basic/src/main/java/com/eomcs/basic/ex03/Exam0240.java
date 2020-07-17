// Exam0230.java
// 주제: 메모리 크기에 따른 표기법

package com.eomcs.basic.ex03;


class Exam0240 { 
    public static void main(String[] args){
        int a = 0xaaaa_aaaa;
        int b = -0xaaaa_aaaa;

        System.out.println(5 - 3);
        System.out.println(5 + (-3));

        // 0000 0011 <= +3 2진수
        // 1111 1101 <= -3 2진수(2의 보수)
        // 1000 0011 <= -3 Sign-Magnitude
        // 0111 1100 <= -3 Excess-K = -3 + 127 = 124
        //    K = 2**(비트수 - 1) -1 
        //      = 2**(8-1) -1
        //      = 2***7 -1
        //      = 128 -1
        //      = 127

        // 0111 1011 <= +123 2진수
        // 1000 0101 <= -123 2진수(2의 보수)
        // 1111 1011 <= -123 Sign-Magnitude
        // 0000 0100 <= -123 Excess-K = -123 + 127 = 4

        // 10101010 10101010 10101010 10101010 <= +aaaaaaaaa 2진수
        // 01010101 01010101 01010101 01010110 <= -123 2진수(2의 보수)
        // 55 55 55 56 <= 16진수
        // 

    }
}

