package com.eomcs.oop.ex09.e.practice.project4;

import com.eomcs.oop.ex09.e.practice.Computer;

public class NewComputer1 implements Computer {
  @Override
  public void compute() {
    System.out.println("새 컴퓨터...");
  }

  @Override
  public void touch() {
    System.out.println("오호라.. 터치가 되네..");
  }
}
