package com.eomcs.pms.filter;

import com.eomcs.pms.handler.Request;

class Filter1 implements CommandFilter {

  public void doFilter(Request request, FilterChain next) {
    System.out.println("Filter1 ==> ");
    try {
      
      next.doFilter(request);
    } catch (Exception e) {
      
    }
    System.out.println("<=== Filter1");
  }
}

class Filter2 implements CommandFilter {

  public void doFilter(Request request, FilterChain next) {
    System.out.println("Filter2 ==> ");
    System.out.println("<=== Filter2");
  }
}

public class Test1 {
  public static void main(String[] args) {
    CommandFilterManager filterManager = new CommandFilterManager();
    filterManager.add(new Filter1());
    filterManager.add(new Filter2());
    filterManager.doFilter(null);
  }
}
