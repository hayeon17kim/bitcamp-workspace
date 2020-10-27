package com.eomcs.net.ex08;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;

public class Exam0110 {
  public static void main(String[] args) throws Exception {
    URL url = new URL("https://www.daum.net");
    
    InputStream in = url.openStream();
    BufferedReader in2 = new BufferedReader(new InputStreamReader(in));
    
    while (true) {
      String str = in2.readLine();
      if (str == null)
        break;
      
      System.out.println(str);
    }
    
    in2.close();
    in.close();
  }
}
