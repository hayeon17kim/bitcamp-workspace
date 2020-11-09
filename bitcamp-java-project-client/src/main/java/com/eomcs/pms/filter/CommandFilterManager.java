package com.eomcs.pms.filter;

import java.util.ArrayList;
import java.util.Map;
import com.eomcs.pms.handler.Request;

public class CommandFilterManager implements FilterChain{
  ArrayList<CommandFilter> filters = new ArrayList<>();
  
  int nextFilterIndex = 0;
  
  public void add(CommandFilter filter) {
    filters.add(filter);
    
  }
  
  public void reset() {
    this.nextFilterIndex = 0;
  }
  
  // 각각의 필터를 준비시킨다.
  public void init(Map<String,Object> context) throws Exception {
    for (CommandFilter filter : filters) {
      filter.init(context);
    }
  }
  
  public void destroy() {
    for (CommandFilter filter : filters) {
      filter.destroy();
    }
  }
  
  
  // 다음 순서의 필터를 실행시킨다.
  public void doFilter(Request request) throws Exception{
    // 보관소에서 해당 인덱스의 필터를 꺼낸다.
    if (nextFilterIndex >= filters.size()) {
      // 다음 필터가 없다.
      return;
    }
    // 보관소에서 해당 인덱스트이 필터를 꺼낸다.
    CommandFilter nextFilter = filters.get(nextFilterIndex++);
    nextFilter.init();
    nextFilter.doFilter(request, this);
    //  다음 필터 실행하기 원하면 나한테 얘기해! 
  }
}
