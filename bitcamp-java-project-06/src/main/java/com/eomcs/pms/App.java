package com.eomcs.pms;


import java.util.Scanner;
import java.sql.Date;


public class App {

  static Scanner keyInput = new Scanner(System.in);

  // 회원
  static final int LENGTH = 5;
  static int[] no = new int[LENGTH];
  static String[] name = new String[LENGTH];
  static String[] email = new String[LENGTH];
  static String[] password = new String[LENGTH];
  static String[] photo = new String[LENGTH];
  static String[] tel = new String[LENGTH];
  static Date[] now = new Date[LENGTH];
  static int count = 0;
  
  static final int PLENGTH = 100;
  static int[] pno = new int[PLENGTH];
  static String[] ptitle = new String[PLENGTH];
  static String[] pcontent = new String[PLENGTH];
  static Date[] pstartDate = new Date[PLENGTH];
  static Date[] pendDate = new Date[PLENGTH];
  static String[] powner = new String[PLENGTH];
  static String[] pmembers = new String[PLENGTH];
  static int pcount = 0;
  
  static final int TLENGTH = 100;

  static String ttitle[] = new String[TLENGTH];
  static int tno[] = new int[TLENGTH];
  static String tcontent[] = new String[TLENGTH];
  static Date tendDate[] = new Date[TLENGTH];
  static int tstate[] = new int[TLENGTH];
  static String towner[] = new String[TLENGTH];
  static int tcount = 0;

  public static void main(String[] args) {
    
    System.out.println("[프로젝트]");
    
    loop: 
    while(true) {
      String command = promptString("명령> ");
      
      switch(command.toLowerCase()) {
        case "/member/add":
          addMember();  // addMember()에 따로 빼낸 코드를 실행하라. 
          // 이것을 매서드 호출이라 한다.
          break;
        case "/member/list":
          listMember();
          break;
        
        case "/project/add":
          addProject();
          break;
          
        case "/project/list":
          listProject();
          break;
          
        case "/task/add":
          addTask();
          break;
        
        case "/task/list":
          listTask();
          break;
          
        case "exit":
        case "quit":
          System.out.println("안녕!");
          break loop;
        default:
          System.out.println("실행할 수 없는 명령입니다.");
      }
      System.out.println("");
    }
    
    keyInput.close();
    System.out.println("종료!");

  }
  
  static void addMember(){
    System.out.println("[회원 등록]");
    
    no[count] = promptInt("번호? ");     
    name[count] = promptString("이름? "); 
    email[count] = promptString("이메일? ");
    password[count] = promptString("암호? ");
    photo[count] = promptString("사진? ");
    tel[count] = promptString("전화? ");
    now[count] = new Date(System.currentTimeMillis());
    
    count++;
  }
  
  static void listMember() {
    System.out.println("[회원 목록]");
    for (int i = 0; i < count; i++) {
      System.out.printf("%d, %s, %s, %s, %s\n", 
          no[i], name[i], email[i], tel[i], now[i].toString());
    }
  }
  
  static void addProject() {
    System.out.println("[프로젝트 등록]");
    pno[pcount] = promptInt("번호? ");
    ptitle[pcount] = promptString("프로젝트명? ");
    pcontent[pcount] = promptString("내용? ");
    pstartDate[pcount] = promptDate("시작일? ");
    pendDate[pcount] = promptDate("종료일? ");
    powner[pcount] = promptString("만든이? ");
    pmembers[pcount] = promptString("팀원? ");
    
    pcount++;
  }

  static void listProject() {
    System.out.println("[프로젝트 목록]");
    for(int i = 0; i < pcount; i++) {
      System.out.printf("%d, %s, %s, %s, %s\n", 
          pno[i], ptitle[i], pstartDate[i], pendDate[i], powner[i]);
    }
  }
  
  static void addTask() {
    System.out.println("[작업 등록]");
    
    ttitle[tcount] = promptString("프로젝트? ");
    tno[tcount] = promptInt("번호? ");
    tcontent[tcount] = promptString("내용? ");
    tendDate[tcount] = promptDate("완료일? ");
    tstate[tcount] = promptInt("상태? \n0: 신규\n1: 진행중\n2: 완료\n");
    towner[tcount] = promptString("담당자? ");
    
    count++;
  }
  

  static void listTask() {
    for(int i = 0; i < count; i++) {
      String stateTitle = null;
      switch (tstate[i]) {
        case 0:
          stateTitle = "신규";
          break;
        case 1:
          stateTitle = "진행중";
          break;
        case 2:
          stateTitle = "완료";
          break;
      }
      System.out.printf("%d, %s, %s, %s, %s", tno[i],ttitle[i], tendDate[i], stateTitle, towner[i]);
    }
  }
  
  static String promptString(String title) {
    System.out.print(title);
    return keyInput.nextLine();
  }
  
  static int promptInt(String title) {
    return Integer.parseInt(promptString(title));
  }
  
  static Date promptDate(String title) {
    return Date.valueOf(promptString(title));
  }
  
}
  

  

