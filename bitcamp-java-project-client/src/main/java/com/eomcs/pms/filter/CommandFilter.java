package com.eomcs.pms.filter;

import java.util.Map;
import com.eomcs.pms.handler.Request;

// 역할
// - 필터를 실행할 때 호출하는 메서드를 정의한다.

public interface CommandFilter {
  default void init(Map<String, Object> context) throws Exception {}
 
  void doFilter(Request request, FilterChain next) throws Exception;
  
  default void destroy() throws Exception{}
 
}
