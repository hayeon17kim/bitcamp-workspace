package com.eomcs.pms.handler;

import java.io.BufferedReader;
import java.io.PrintWriter;
import java.util.Map;

public class Request {
  String commandPath;
  Map<String,Object> context;
  PrintWriter out;
  BufferedReader in;
  String sessionId;

<<<<<<< HEAD
  public Request(
      String commandPath,
      Map<String,Object> context,
      PrintWriter out,
      BufferedReader in,
      String sessionId) {

=======
  public Request(String commandPath, Map<String,Object> context, PrintWriter out, BufferedReader in, String sessionId) {
>>>>>>> b2246385c7ae9f527ca04b18fce4ea5b337d8508
    this.commandPath = commandPath;
    this.context = context;
    this.out = out;
    this.in = in;
    this.sessionId = sessionId;
  }
<<<<<<< HEAD
=======
  
  public PrintWriter getWriter() {
    return out;
  }
  
  public BufferedReader getReader() {
    return in;
  }
>>>>>>> b2246385c7ae9f527ca04b18fce4ea5b337d8508

  public String getCommandPath() {
    return commandPath;
  }

  public Map<String, Object> getContext() {
    return context;
  }
<<<<<<< HEAD

  public PrintWriter getWriter() {
    return out;
  }

  public BufferedReader getReader() {
    return in;
  }

  @SuppressWarnings("unchecked")
  public Map<String,Object> getSession() {
    return (Map<String,Object>) context.get(sessionId);
  }

  public void invalidateSession() {
    context.remove(sessionId);
  }
=======
  
  @SuppressWarnings("unchecked")
  public Map<String, Object> getSession() {
    return (Map<String, Object>) context.get(sessionId);
  }
  
  public void invalidateSession() {
    context.remove(sessionId);
  }

>>>>>>> b2246385c7ae9f527ca04b18fce4ea5b337d8508
}




