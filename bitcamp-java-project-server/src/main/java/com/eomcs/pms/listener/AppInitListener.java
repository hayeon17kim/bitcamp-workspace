package com.eomcs.pms.listener;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;
<<<<<<< HEAD

@WebListener
public class AppInitListener implements ServletContextListener {

  @Override
  public void contextInitialized(ServletContextEvent sce) {
    System.out.println("프로젝트 관리 시스템(PMS)에 오신 걸 환영합니다!");
  }

  @Override
  public void contextDestroyed(ServletContextEvent sce) {
    System.out.println("프로젝트 관리 시스템(PMS)을 종료합니다!");
=======

@WebListener
public class AppInitListener implements ServletContextListener{

  @Override
  public void contextInitialized(ServletContextEvent sce) {
    // TODO Auto-generated method stub
    ServletContextListener.super.contextInitialized(sce);
>>>>>>> b2246385c7ae9f527ca04b18fce4ea5b337d8508
  }
@Override
public void contextDestroyed(ServletContextEvent sce) {
  // TODO Auto-generated method stub
  ServletContextListener.super.contextDestroyed(sce);
}
}
