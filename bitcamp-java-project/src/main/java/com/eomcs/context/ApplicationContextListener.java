package com.eomcs.context;

import java.util.Map;

public interface ApplicationContextListener {
  
  public void contextInitialized(Map<String, Object> map);
  public void contextDestroyed(Map<String, Object> map);
}
