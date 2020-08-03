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
public class App_d {

  public static void main(String[] args) {
    

    Scanner keyInput = new Scanner(System.in);

    
    System.out.println("[회원]");
    
    // 최대 5명의 회원 정보를 입력 받는 변수를 선언
    int[] no = new int[5];
    String[] name = new String[5];
    String[] email = new String[5];
    String[] password = new String[5];
    String[] photo = new String[5];
    String[] tel = new String[5];
    Date[] now = new Date[5];
    long currentMillis = 0;
    int count = 0;
    
    for (int i = 0; i < 5; i++) {
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
