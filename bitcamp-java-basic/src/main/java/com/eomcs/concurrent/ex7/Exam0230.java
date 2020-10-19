package com.eomcs.concurrent.ex7;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

// 생성자는 계속 실행중이고 여기는 Runnable객체를 이렇게 받는다.
// setcount를 호출할 때는 wait을 한다.
// 실행하자마자 큐에 들어갔다가 이 작업을 한다. 큐에 들어간 걸 꺼내서
// 스레드에 관련되어 만들고
public class Exam0230 {
  
  static class MyRunnable implements Runnable {
    int millisec;
    
    public MyRunnable(int millisec) {
      this.millisec = millisec;
    }
    
    public void run() {
      try {
        System.out.printf("%s 스레드 실행 중...\n", Thread.currentThread().getName());
        
        Thread.sleep(millisec);
        System.out.printf("%s 스레드 종료!\n", Thread.currentThread().getName());
      } catch (Exception e) {
        System.out.printf("%s 스레드 실행 중 오류 발생!\n", Thread.currentThread().getName());
      }
    }
  }
  public static void main(String[] args) throws Exception {
    ExecutorService executorService = Executors.newSingleThreadExecutor();
    
    executorService.execute(new MyRunnable(6000));
    executorService.execute(new MyRunnable(3000));
    executorService.execute(new MyRunnable(9000));
    executorService.execute(new MyRunnable(2000));
    executorService.execute(new MyRunnable(4000));
    
    System.out.println("main() 종료!");
  }
}
