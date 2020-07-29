package com.eomcs.basic.test05;

public class Exam0412 {
  public static void main(String[] args) {
    System.out.println(3 << 1);
    //     0000000000 00000000 00000000 00000011 = 3
    //    0000000000 00000000 00000000 00000011x = 비트이동
    //     000000000 00000000 00000000 000000110 = 6
    
    System.out.println(3 << 33); //6
    System.out.println(3 << 65); //6
    System.out.println(3 << 97); //6
    
  }
}
