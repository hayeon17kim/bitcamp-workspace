package com.eomcs.pms.listener;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

@WebListener
public class AppInitListener implements ServletContextListener{

  @Override
  public void contextInitialized(ServletContextEvent sce) {
    // TODO Auto-generated method stub
    ServletContextListener.super.contextInitialized(sce);
  }
@Override
public void contextDestroyed(ServletContextEvent sce) {
  // TODO Auto-generated method stub
  ServletContextListener.super.contextDestroyed(sce);
}
}
