package com.eomcs.pms.filter;

import java.util.Map;
import com.eomcs.pms.handler.Command;
import com.eomcs.pms.handler.Request;

// 필터 역할 
// - Command 객체를 찾아 실행한다.
public class DefaultCommandFilter implements CommandFilter{

  
  
  @Override
  public void doFilter(Request request, FilterChain next) {
    // Request 보관소에서 커맨드 객체가 들어 있는 map을 꺼낸다.
    Map<String, Object> context = request.getContext();
    
    // context 맵에서 커맨드 객체가 들어 있는 맵을 꺼낸다.
    Map<String, Command> commandMap = (Map<String, Command>) context.get("commandMap");
    
    Command command = commandMap.get(request.getCommandPath());
    // 커맨드나 필터가 사용할 객체 준비
    
    //logOut.println(inputStr);
    if (command != null) {
      try {
        command.execute(context);
        // 실행 중 오류가 발생할 수 있는 코드는 try 블록 안에 둔다.
      } catch (Exception e) {
        // 오류가 발생하면 그 정보를 갖고 있는 객체의 클래스 이름을 출력한다.
        System.out.println("--------------------------------------------------------------");
        System.out.printf("명령어 실행 중 오류 발생: %s\n", e);
        System.out.println("--------------------------------------------------------------");
      }
    } else {
      System.out.println("실행할 수 없는 명령입니다.");
    }
  }
}
