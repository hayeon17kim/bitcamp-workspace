package com.eomcs.design_pattern.flyweight.after;

import java.util.Scanner;

public class BrushTest {
  public static void main(String[] args) {
    BrushPool brushPool = new BrushPool();
    
    Scanner keyboard = new Scanner(System.in);
    while (true) {
      System.out.print("패턴? ");
      String pattern = keyboard.nextLine();
      System.out.print("선 길이? ");
      int length = Integer.parseInt(keyboard.nextLine());
      if (length < 0)
        break;
      
      Brush brush = brushPool.getBrush(pattern);
      // 사용자가 입력한 패턴의 브러시를 브러시풀에서 꺼내 쓴다.
      // - 매번 생성하지 않기 때문에 가비지 생성이 줄어든다.
      // - 이것이 "Flyweight" 패턴을 사용하는 이유이다.
      brush.draw(length);
    }
    keyboard.close();
  }
}
