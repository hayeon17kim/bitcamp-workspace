package com.eomcs.concurrent.ex7;

import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Exam0510 {
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
    ExecutorService executorService = Executors.newFixedThreadPool(3);
    // 이전에는 스레드에게 주면서 start()를 했다면,
    // 스레드 풀이 알아서 스레드를 생성해서(혹은 있는 스레드를 사용해서) start() 시킬 것이다.
    executorService.execute(new MyRunnable(6000));
    executorService.execute(new MyRunnable(2000));
    executorService.execute(new MyRunnable(4000));
    executorService.execute(new MyRunnable(3000));
    // 예외 발생
    executorService.execute(new MyRunnable(4000));
    System.out.println("main() 종료!");
  }
}
