package com.eomcs.pms.handler;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.Servlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
@CommandAnno("/hello")
// Command 규칙에 따라 클래스를 정의한다.
public class HelloCommand implements Servlet {

  @Override
  public void service(ServletRequest req, ServletResponse res)
      throws ServletException, IOException {
    PrintWriter out = request.getWriter();
    out.println("안녕하세요!");
    // TODO Auto-generated method stub
    
  }
}
