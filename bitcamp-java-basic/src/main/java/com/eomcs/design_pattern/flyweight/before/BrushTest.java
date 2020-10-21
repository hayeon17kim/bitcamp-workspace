package com.eomcs.design_pattern.flyweight.before;

import java.util.Scanner;

public class BrushTest {
  public static void main(String[] args) {
    Scanner keyboard = new Scanner(System.in);
    while (true) {
      System.out.print("패턴? ");
      String pattern = keyboard.nextLine();
      System.out.print("선 길이? ");
      int length = Integer.parseInt(keyboard.nextLine());
      if (length < 0)
        break;
      
      Brush brush = new Brush(pattern);
      brush.draw(length);
    }
    keyboard.close();
  }
}
