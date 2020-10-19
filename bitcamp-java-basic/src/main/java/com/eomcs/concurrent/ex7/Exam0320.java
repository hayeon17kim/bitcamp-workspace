package com.eomcs.concurrent.ex7;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Exam0320 {
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
    Future<?> future1 = executorService.submit(new MyRunnable(6000));
    Future<?> future2 = executorService.submit(new MyRunnable(4000));
    future2.get();
    System.out.println("두 번째 작업이 끝났음");
    future1.get();
    System.out.println("첫 번째 작업이 끝났음");
    System.out.println("main() 종료!");
  }
}
