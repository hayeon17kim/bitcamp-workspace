package com.eomcs.pms;

import java.sql.Date;
import java.util.Scanner;

public class App3 {

  public static void main(String[] args) {

    Scanner keyInput = new Scanner(System.in);

    final int LENGTH = 100;

    String title[] = new String[LENGTH];
    int no[] = new int[LENGTH];
    String content[] = new String[LENGTH];
    Date endDate[] = new Date[LENGTH];
    String state[] = new String[LENGTH];
    String owner[] = new String[LENGTH];

    System.out.println("[작업]");

    int count = 0;

    for (int i = 0; i < LENGTH; i++) {

      count++;

      System.out.print("프로젝트? ");
      title[i] = keyInput.nextLine();

      System.out.print("번호? ");
      no[i] = keyInput.nextInt();
      keyInput.nextLine();

      System.out.print("내용? ");
      content[i] = keyInput.nextLine();

      System.out.print("완료일? ");
      endDate[i] = Date.valueOf(keyInput.nextLine());

      System.out.println("상태? ");
      System.out.println("0: 신규");
      System.out.println("1: 진행중");
      System.out.println("2: 완료");

      switch (keyInput.nextInt()) {
        case 0:
          state[i] = "신규";
          break;
        case 1:
          state[i] = "진행중";
          break;
        case 2:
          state[i] = "완료";
          break;
      }

      keyInput.nextLine();

      System.out.print("담당자? ");
      owner[i] = keyInput.nextLine();


      System.out.println("계속 입력하시겠습니까? (y / N)");
      String response = keyInput.nextLine();
      if (!response.equalsIgnoreCase("y")) {
        break;
      }

    }
    System.out.println("-------------");
    System.out.println("[프로젝트1]");

    for(int i = 0; i < count; i++) {
      System.out.printf("%d, %s, %s, %s, %s", no[i],title[i], endDate[i], state[i], owner[i]);
    }

    keyInput.close();




  }
}
