package com.eomcs.net.ex10;

import java.util.Base64.Encoder;
import java.util.Base64.Decoder;
import java.io.UnsupportedEncodingException;
import java.util.Base64;

public class Exam0110 {
  public static void main(String[] args) throws UnsupportedEncodingException {
    String str = "ABC012가각간";
    
    byte[] bytes = str.getBytes();
    for (byte b : bytes) {
      System.out.printf("%x ", b);
    }
    System.out.println();
    
    Encoder encoder = Base64.getEncoder();
    byte[] base64Bytes = encoder.encode(bytes);
    for(byte b : base64Bytes) {
      System.out.printf("%x ", b);
    }
    
    System.out.println();
    
    System.out.println(new String(base64Bytes));
    
    // Base64 디코딩
    // => Base64 코드를 원래의 바이너리 값으로 변환한다.
    Decoder decoder = Base64.getDecoder();
    byte[] bytes2 = decoder.decode(base64Bytes);
    
    System.out.printf(new String(bytes2, "UTF-8"));
    
  }
}
