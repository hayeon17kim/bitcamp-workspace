package com.eomcs.pms.listener;

import java.util.Map;
import com.eomcs.context.ApplicationContextListener;

public class AppInitContextListener implements ApplicationContextListener {
  
  public void contextInitialized(Map<String, Object> context) {
    System.out.println("PMS에 오신 것을 환영합니다!");
  }
  public void contextDestroyed(Map<String, Object> context) {
    System.out.println("PMS를 종료합니다!");
  }

}
