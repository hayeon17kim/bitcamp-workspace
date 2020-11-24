package com.eomcs.pms.handler;

<<<<<<< HEAD
// 사용자의 명령을 처리하는 객체에 대해 호출할 메서드 규칙을 정의 한다.
public interface Command {
  // 향후 커맨드 객체에게 전달할 파라미터가 추가될 가능성을 위해
  // 파라미터 값들을 단일 Request 객체에 담아서 넘긴다.
  // 나중에 전달할 값이 늘어나더라도 execute() 메서드는 변경할 필요가 없다.
  // Request 클래스만 변경하면 된다.
=======
import java.io.BufferedReader;
import java.io.PrintWriter;
import java.util.Map;

// 사용자의 명령을 처리하는 객체에 대해 호출할 메서드 규칙을 정의 한다.
public interface Command {
  // 클라이언트 요청 처리와 관련된 객체들 간에
  // 데이터 교환을 위해 맵 객체를 파라미터로 넘긴다.
  // 향후 커
>>>>>>> b2246385c7ae9f527ca04b18fce4ea5b337d8508
  void execute(Request request);
}
