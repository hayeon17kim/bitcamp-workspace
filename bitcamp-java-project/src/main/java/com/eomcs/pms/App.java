package com.eomcs.pms;

import com.eomcs.pms.domain.Board;
import com.eomcs.pms.domain.Member;
import com.eomcs.pms.domain.Project;
import com.eomcs.pms.domain.Task;
import com.eomcs.pms.handler.BoardHandler;
import com.eomcs.pms.handler.MemberHandler;
import com.eomcs.pms.handler.ProjectHandler;
import com.eomcs.pms.handler.TaskHandler;
import com.eomcs.util.LinkedList;
import com.eomcs.util.AbstractList;
import com.eomcs.util.Prompt;
import com.eomcs.util.Queue;
import com.eomcs.util.Stack;

public class App {

  public static void main(String[] args) {
    // 추상클래스는 인스턴스를 만들 수 없다.
    // => 화나는가? 화내지 말라.
    // => 그 추상 클래스를 만든 개발자는
    // 서브 클래스를 만들 때 상속받는 용으로 쓰라고 만든 클래스다.
    // => 그러나 일반 용도로 사용하지 못하게 막는 것은 당연하다.
    // List<Board> boardList = new List<>(); // 컴파일 오류!

    // BoardHandler가 작업하는데 필요한 객체(의존 객체)를 이렇게 외부에서 생성자를 통해 주입한다.
    // => '의존 객체 주입(Dependency Injection; DI)라 부른다.
    // => 의존 객체 교체가 쉬워진다.
    AbstractList<Board> boardList = new LinkedList<>();
    AbstractList<Project> projectList = new LinkedList<>();
    AbstractList<Task> taskList = new LinkedList<>();
    AbstractList<Member> memberList = new LinkedList<>();

    BoardHandler boardHandler = new BoardHandler(boardList);
    MemberHandler memberHandler = new MemberHandler(memberList);
    ProjectHandler projectHandler = new ProjectHandler(memberHandler, projectList);
    TaskHandler taskHandler = new TaskHandler(memberHandler, taskList);
    Stack<String> commandStack = new Stack<>();
    Queue<String> commandQueue = new Queue<>();

    loop: while (true) {
      String command = Prompt.inputString("명령> ");

      // 사용자가 입력한 명령을 보관한다.
      commandStack.push(command);
      commandQueue.offer(command);

      switch (command) {
        case "/member/add":
          memberHandler.add();
          break;
        case "/member/list":
          memberHandler.list();
          break;
        case "/member/detail":
          memberHandler.detail();
          break;
        case "/member/update":
          memberHandler.update();
          break;
        case "/member/delete":
          memberHandler.delete();
          break;
        case "/project/add":
          projectHandler.add();
          break;
        case "/project/list":
          projectHandler.list();
          break;
        case "/project/detail":
          projectHandler.detail();
          break;
        case "/project/update":
          projectHandler.update();
          break;
        case "/project/delete":
          projectHandler.delete();
          break;
        case "/task/add":
          taskHandler.add();
          break;
        case "/task/list":
          taskHandler.list();
          break;
        case "/task/detail":
          taskHandler.detail();
          break;
        case "/task/update":
          taskHandler.update();
          break;
        case "/task/delete":
          taskHandler.delete();
          break;
        case "/board/add":
          boardHandler.add();
          break;
        case "/board/list":
          boardHandler.list();
          break;
        case "/board/detail":
          boardHandler.detail();
          break;
        case "/board/update":
          boardHandler.update();
          break;
        case "/board/delete":
          boardHandler.delete();
          break;
        case "history":
          printCommandHistory(commandStack);
          break;
        // history2 명령을 처리한다.
        case "history2":
          printCommandHistory2(commandQueue);
          break;
        case "quit":
        case "exit":
          System.out.println("안녕!");
          break loop;
        default:
          System.out.println("실행할 수 없는 명령입니다.");
      }
      System.out.println(); // 이전 명령의 실행을 구분하기 위해 빈 줄 출력
    }

    Prompt.close();
  }

  static void printCommandHistory(Stack<String> commandStack) {
    try {
      // 스택은 한 번 pop() 하면 데이터가 제거된다.
      // 따라서 복제본을 만들어 사용한다.
      // 또한 clone() 메서드는 복제 작업 중 오류가 발생하면 예외를 발생시키기 때문에
      // try...catch... 블록으로 처리한다.
      Stack<String> history = commandStack.clone();

      int count = 0;
      while (!history.empty()) {
        System.out.println(history.pop());
        count++;

        // 5개 출력할 때 마다 계속 출력할지 묻는다.
        if ((count % 5) == 0 && Prompt.inputString(":").equalsIgnoreCase("q")) {
          break;
        }
      }
    } catch (Exception e) {
      System.out.println("history 명령 처리 중 오류 발생!");
    }
  }

  static void printCommandHistory2(Queue<String> commandQueue) {
    try {
      // Queue는 한 번 poll() 하면 데이터가 제거된다.
      // 따라서 복제본을 만들어 사용한다.
      // 또한 clone() 메서드는 복제 작업 중 오류가 발생하면 예외를 발생시키기 때문에
      // try...catch... 블록으로 처리한다.
      Queue<String> history = commandQueue.clone();

      int count = 0;
      while (history.size() > 0) {
        System.out.println(history.poll());
        count++;

        // 5개 출력할 때 마다 계속 출력할지 묻는다.
        if ((count % 5) == 0 && Prompt.inputString(":").equalsIgnoreCase("q")) {
          break;
        }
      }
    } catch (Exception e) {
      System.out.println("history2 명령 처리 중 오류 발생!");
    }
  }
}
