package com.eomcs.pms;

// ex) Scanner는 java.util에 있는 Scanner라는 것을 먼저 알려주
import java.util.Scanner;
import java.sql.Date;

// 1) 낱개의 변수를 사용하여 여러 회원 정보 처리하기 
// 2) 조건문을 사용하여 입출력 제어하기
//  - 필요한 만큼만 입력 받고 출력하고 싶다.
// 3) 배열을 사용하여 여러 개의 값을 다루기
//  - 배열을 사용하면 간단하게 여러 개의 변수를 선언할 수 있다. 
// 4) 반복문을 사용하여 여러 개의 값을 다루기
//  - 반복문을 사용하면 같은 코드를 중복해서 작성할 필요가 없다.
// 5) 배열 개수를 변수에서 관리하기
//  - 변수의 값만 바꾸면 배열 개수를 바로 변경할 수 있어 편하다.
// 6) 상수를 사용하여 초기 값을 변경하지 못하게 막기
//  - 변수는 중간에 값을 바꿀 수 있기 때문에 값을 바꾸지 말아야 하는 경우
//    상수로 선언한다.
// 7) 매서드를 사용하여 코드를 분리하기
//  - 매서드를 사용하면 기능별로 코드를 별도의 블럭으로 분리할 수 있다.
//  - 작은 단위로 코드가 분리되면 관리하기 쉽다.

public class App_g {
  

  static int count = 0;
  static final int MAX_LENGTH = 5;
  static int[] no = new int[MAX_LENGTH];
  static String[] name = new String[MAX_LENGTH];
  static String[] email = new String[MAX_LENGTH];
  static String[] password = new String[MAX_LENGTH];
  static String[] photo = new String[MAX_LENGTH];
  static String[] tel = new String[MAX_LENGTH];
  static Date[] now = new Date[MAX_LENGTH];

  public static void main(String[] args) {

    System.out.println("[회원]");
    
    inputMembers();  // 별도의 블럭으로 분리한 코드를 실행하기 
    
    System.out.println("--------------------------");
    
    printMembers();
    
  }
  
  static void inputMembers() {
    
    Scanner keyInput = new Scanner(System.in);
    long currentMillis = 0;
    
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
  }
  
  static void printMembers() {
    for (int i = 0; i < count; i++) {
      System.out.printf("%d, %s, %s, %s, %s\n", 
          no[i], name[i], email[i], tel[i], now[i].toString());
    }
  }
  
  
  
  
}
