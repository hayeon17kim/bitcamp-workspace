package com.eomcs.pms.handler;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.Servlet;
<<<<<<< HEAD
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

@WebServlet("/hello")
public class HelloCommand implements Servlet {

  @Override
  public void service(ServletRequest request, ServletResponse response)
      throws ServletException, IOException {

    response.setContentType("text/plain;charset=UTF-8");
    PrintWriter out = response.getWriter();
    out.println("안녕하세요!");
  }

  @Override
  public void init(ServletConfig config) throws ServletException {
    // TODO Auto-generated method stub

  }

  @Override
  public ServletConfig getServletConfig() {
    // TODO Auto-generated method stub
    return null;
=======
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
    
>>>>>>> b2246385c7ae9f527ca04b18fce4ea5b337d8508
  }

  @Override
  public String getServletInfo() {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public void destroy() {
    // TODO Auto-generated method stub

  }


}
