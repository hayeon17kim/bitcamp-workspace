package com.eomcs.pms.filter;

import com.eomcs.pms.handler.Request;

// 필터 역할
// - 로그인하지 않은 경우 커맨드를 실행시키지 않는다.
public class AuthCommandFilter implements CommandFilter {

  @Override
  public void doFilter(Request request, FilterChain next) throws Exception {
    // Request 보관소에서 커맨드 객체가 들어 있는 map을 꺼낸다.
    if (request.getCommandPath().equals("/login") || request.getContext().get("loginUser") != null) {
      next.doFilter(request);
    } else {
      System.out.println("로그인이 필요합니다.");
    }
  }
}
