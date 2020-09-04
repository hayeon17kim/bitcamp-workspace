package com.eomcs.oop.ex09.e.practice;

import com.eomcs.oop.ex09.e.practice.project1.FirstComputer;
import com.eomcs.oop.ex09.e.practice.project2.SecondComputer;
import com.eomcs.oop.ex09.e.practice.project3.ThirdComputer;
import com.eomcs.oop.ex09.e.practice.project4.NewComputer1;
import com.eomcs.oop.ex09.e.practice.project4.NewComputer2;
import com.eomcs.oop.ex09.e.practice.project4.NewComputer3;

public class User {
  public static void main(String[] args) {
    play(new FirstComputer());
    play(new SecondComputer());
    play(new ThirdComputer());
    play(new NewComputer1());
    play(new NewComputer2());
    play(new NewComputer3());
  }

  static void play(Computer computer) {
    computer.compute();
    computer.touch();
  }
}
