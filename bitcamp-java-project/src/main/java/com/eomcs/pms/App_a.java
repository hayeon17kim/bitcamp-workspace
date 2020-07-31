package com.eomcs.pms;


import java.util.Scanner;
import java.sql.Date;

// 1) 회원의 번호, 이름, 이메일, 암호, 사진, 전화번호, 등록일을 담을 수 있는
//    메모리를 설계한다. => Member 클래스 정의
// 2) 
public class App_a {

  public static void main(String[] args) {
    
    // 값을 담기 위해 메모리를 준비할 때
    // 어떤 종류의 메모리를 준비해야 하는 지 설계도를 작성한다.
    // => 이것을 "클래스 정의" 라고 부른다. 
    class Member {
      int no;
      String name;
      String email;
      String password;
      String photo;
      String tel;
      Date now;
    }
    
    
    Scanner keyInput = new Scanner(System.in);

    System.out.println("[회원]");
    
    final int MAX_LENGTH = 5;
    int[] no = new int[MAX_LENGTH];
    String[] name = new String[MAX_LENGTH];
    String[] email = new String[MAX_LENGTH];
    String[] password = new String[MAX_LENGTH];
    String[] photo = new String[MAX_LENGTH];
    String[] tel = new String[MAX_LENGTH];
    Date[] now = new Date[MAX_LENGTH];
    long currentMillis = 0;
    int count = 0;
    
    //MAX_LENGTH = 100;
    
    for (int i = 0; i < MAX_LENGTH; i++) {
      count ++;
      System.out.print("번호? ");
      no[i] = keyInput.nextInt();
      keyInput.nextLine();     
      
      System.out.print("이름? ");
      name[i] = keyInput.nextLine();
      
      System.out.print("이메일? ");
      email[i] = keyInput.nextLine();
      
      System.out.print("암호? ");
      password[i] = keyInput.nextLine();
      
      System.out.print("사진? ");
      photo[i] = keyInput.nextLine();
      
      System.out.print("전화? ");
      tel[i] = keyInput.nextLine();
      
      currentMillis = System.currentTimeMillis();
      now[i] = new Date(currentMillis);
      
      System.out.println("");
      
      System.out.println("계속 입력하시겠습니까?(y/N) ");
      
    
      String response = keyInput.nextLine();
      if (response.equalsIgnoreCase("y") == false) {
        break;  // 반복문을 멈춰라.
      }
    }

    keyInput.close();
    
    System.out.println("--------------------------");
    
    for (int i = 0; i < count; i++) {
      System.out.printf("%d, %s, %s, %s, %s\n", 
          no[i], name[i], email[i], tel[i], now[i].toString());
    }
    
  }
}
