package com.eomcs.pms;

import java.sql.Date;
import java.util.Scanner;

public class App3 {

  public static void main(String[] args) {
    
    class Task {
      String title;
      int no;
      String content;
      Date completedDate;
      String state;
      String owner;
    
    }

    Scanner keyInput = new Scanner(System.in);

    final int LENGTH = 100;
    
    Task tasks[] = new Task[LENGTH];

    System.out.println("[작업]");

    int count = 0;

    for (int i = 0; i < LENGTH; i++) {

      count++;
      Task t = new Task();
      
      System.out.print("프로젝트? ");
      t.title = keyInput.nextLine();

      System.out.print("번호? ");
      t.no = keyInput.nextInt();
      keyInput.nextLine();

      System.out.print("내용? ");
      t.content = keyInput.nextLine();

      System.out.print("완료일? ");
      t.completedDate = Date.valueOf(keyInput.nextLine());

      System.out.println("상태? ");
      System.out.println("0: 신규");
      System.out.println("1: 진행중");
      System.out.println("2: 완료");

      switch (keyInput.nextInt()) {
        case 0:
          t.state = "신규";
          break;
        case 1:
          t.state = "진행중";
          break;
        case 2:
          t.state = "완료";
          break;
      }

      keyInput.nextLine();

      System.out.print("담당자? ");
      t.owner = keyInput.nextLine();
      
      tasks[i] = t;


      System.out.println("계속 입력하시겠습니까? (y / N)");
      String response = keyInput.nextLine();
      if (!response.equalsIgnoreCase("y")) {
        break;
      }

    }
    System.out.println("-------------");
    System.out.println("[프로젝트1]");

    for(int i = 0; i < count; i++) {
      Task t = new Task();
      t = tasks[i];
      System.out.printf("%d, %s, %s, %s, %s", 
          t.no, 
          t.title, 
          t.completedDate, 
          t.state, 
          t.owner);
    }

    keyInput.close();




  }
}
