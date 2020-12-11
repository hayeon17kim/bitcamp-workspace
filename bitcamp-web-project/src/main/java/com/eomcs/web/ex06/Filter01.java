// 필터 초기화 파라미터 : web.xml에서 설정한 값 가져오기
package com.eomcs.web.ex06;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class Filter01 implements Filter {

  FilterConfig filterConfig;

  @Override
  public void init(FilterConfig filterConfig) throws ServletException {
    this.filterConfig = filterConfig;
    System.out.println("ex06.Filter01.init()");
  }

  @Override
  public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
      throws IOException, ServletException {

    // 필터의 DD 설정으로 지정한 파라미터 값 가져오기
    System.out.printf("ex06.Filter01 : aaa=%s\n", filterConfig.getInitParameter("aaa"));
    System.out.printf("ex06.Filter01 : encoding=%s\n", filterConfig.getInitParameter("encoding"));
    chain.doFilter(request, response);
  }
  
  @Override
  public void destroy() {
    System.out.println("ex06.Filter01.destroy()");
  }
}


