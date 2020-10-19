package com.eomcs.concurrent.ex7;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Exam0110 {
  public static void main(String[] args) {
    ExecutorService executorService = Executors.newFixedThreadPool(3);
    // 이전에는 스레드에게 주면서 start()를 했다면,
    // 스레드 풀이 알아서 스레드를 생성해서(혹은 있는 스레드를 사용해서) start() 시킬 것이다.
    executorService.execute(() -> System.out.printf("%s 스레드 실행!", Thread.currentThread().getName()));
    
    executorService.shutdown();
    System.out.println("main() 종료!");
  }
}
