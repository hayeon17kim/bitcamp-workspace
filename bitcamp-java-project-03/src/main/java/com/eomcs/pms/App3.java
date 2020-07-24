package com.eomcs.pms;

import java.sql.Date;

public class App3 {

  public static void main(String[] args) {
    
    java.util.Scanner keyInput = new java.util.Scanner(System.in);

    System.out.println("[작업]");
    
    System.out.print("프로젝트? ");
    String project = keyInput.nextLine();
    
    System.out.print("번호? ");
    String str = keyInput.nextLine();
    int no = Integer.parseInt(str);
    
    System.out.print("내용? ");
    String content = keyInput.nextLine();
    

    System.out.print("완료일? ");
    java.sql.Date completedDate = java.sql.Date.valueOf(keyInput.nextLine());
    System.out.println("상태? ");
    System.out.println("0: 신규");
    System.out.println("1: 진행중");
    System.out.println("2: 완료");
    
    String state1 = keyInput.nextLine();
    String state2 = "";
//    if(status1.equals("0")) {
//      status2 = "신규";
//    } else if(status1.equals("1")) {
//      status2 = "진행중";
//    } else if (status1.equals("2")) {
//      status2 = "완료";
//    } else {
//      status2 = "잘못된 값";
//    
    switch(state1) {
      case "0":
        state2 = "신규";
        break;
      case "1":
        state2 = "진행";
        break;
      default:
        state2 = "완료";
        break;
    }
    
    
    
    System.out.print("담당자? ");
    String manager = keyInput.nextLine();
    
    keyInput.close();
    
    System.out.println("-------------");
    System.out.printf("프로젝트: %s\n", project);
    System.out.printf("번호: %d\n", no);
    System.out.printf("내용: %s\n", content);
    System.out.printf("완료일: %s\n", completedDate.toString());
    System.out.printf("상태: %s\n", state2);
    System.out.printf("담당자: %s\n", manager);
    
    
  }
}
