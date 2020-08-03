package com.eomcs.pms;

import java.sql.Date;

public class App2 {

  public static void main(String[] args) {
    java.util.Scanner keyInput = new java.util.Scanner(System.in);
    class Project {
      int no;
      String title;
      String content;
      Date startDate;
      Date endDate;
      String owner;
      String members;
    }
    final int LENGTH = 10;

    // 여러 개의 프로젝트 정보를 입력받기 위해 변수 준비
    Project[] projects = new Project[LENGTH];
    
    
    
    System.out.println("[프로젝트]");

    int count = 0;

    for (int i = 0; i < LENGTH; i++) {

      count++;
      
      Project p = new Project();

      System.out.printf("번호? ");
      p.no = keyInput.nextInt();
      keyInput.nextLine();

      System.out.print("프로젝트명? ");
      p.title = keyInput.nextLine();
      // p가 가리키는 인스턴스의 endDate 필드
      // p가 가리키는 객체의 endDate 필드
      // p 객체의 endDate 필드 
      
      System.out.print("내용? ");
      p.content = keyInput.nextLine();

      System.out.print("시작일? ");
      p.startDate = Date.valueOf(keyInput.nextLine());

      System.out.print("종료일? ");
      p.endDate = Date.valueOf(keyInput.nextLine());

      System.out.print("만든이? ");
      p.owner = keyInput.nextLine();

      System.out.print("팀원?: ");
      p.members = keyInput.nextLine();
      
      projects[i] = p;
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
      Project p = new Project();
      p = projects[i];
      System.out.printf("%d, %s, %s, %s, %s\n", p.no, p.title, p.startDate, p.endDate, p.owner);
    }


  }
}
