package com.eomcs.pms;

import java.sql.Date;

public class App2 {

  public static void main(String[] args) {
    java.util.Scanner keyInput = new java.util.Scanner(System.in);

    final int LENGTH = 10;

    // 여러 개의 프로젝트 정보를 입력받기 위해 변수 준비
    int[] no = new int[LENGTH];
    String[] title = new String[LENGTH];
    String[] content = new String[LENGTH];
    Date[] startDate = new Date[LENGTH];
    Date[] endDate = new Date[LENGTH];
    String[] owner = new String[LENGTH];
    String[] members = new String[LENGTH];

    System.out.println("[프로젝트]");

    int count = 0;

    for (int i = 0; i < LENGTH; i++) {

      count++;

      System.out.printf("번호? ");
      no[i] = keyInput.nextInt();
      keyInput.nextLine();

      System.out.print("프로젝트명? ");
      title[i] = keyInput.nextLine();

      System.out.print("내용? ");
      content[i] = keyInput.nextLine();

      System.out.print("시작일? ");
      startDate[i] = Date.valueOf(keyInput.nextLine());

      System.out.print("종료일? ");
      endDate[i] = Date.valueOf(keyInput.nextLine());

      System.out.print("만든이? ");
      owner[i] = keyInput.nextLine();

      System.out.print("팀원?: ");
      members[i] = keyInput.nextLine();

      System.out.println("");
      System.out.println("계속 입력 하시겠습니까? (y/N)");
      String response = keyInput.nextLine();



      if (!response.equalsIgnoreCase("y"))  //응답이 y가 아니라면 if문을 실행하라.
        break;

      System.out.println("");
    }

    keyInput.close();
    System.out.println("------------------");

    for(int i = 0; i < count; i++) {
      System.out.printf("%d, %s, %s, %s, %s\n", no[i], title[i], startDate[i], endDate[i], owner[i]);
    }


  }
}
