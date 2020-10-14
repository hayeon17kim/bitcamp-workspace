package com.eomcs.pms;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import com.eomcs.context.ApplicationContextListener;
import com.eomcs.pms.handler.Command;
import com.eomcs.pms.listener.AppInitListener;
import com.eomcs.pms.listener.DataHandlerListener;
import com.eomcs.pms.listener.RequestMappingListener;

public class ServerApp {
  
  // 클라이언트가 stop명령을 보내면 이 값이 true로 변경된다.
  // 인스턴스 메서드가 되면 안된다. handleClient가 static 이기 때문에  static 멤버에만 접근 가능하다.
  static boolean stop = false;

  static Map<String, Object> context;

  List<ApplicationContextListener> listeners = new ArrayList<>();


  private void addApplicationContextListener (ApplicationContextListener listener) {
    listeners.add(listener);
  }

  private void removeApplicationContextListener (ApplicationContextListener listener) {
    listeners.remove(listener);
  }

  private void notifyApplicationContextListenerOnServiceStarted() {
    for (ApplicationContextListener listener : listeners) {
      listener.contextInitialized(context);
    }
  }

  private void notifyApplicationContextListenerOnServiceStopped() {
    for (ApplicationContextListener listener : listeners) {
      listener.contextDestroyed(context);
    }
  }

  public void service(int port) {
    
    notifyApplicationContextListenerOnServiceStarted();
    
    try (ServerSocket ss = new ServerSocket(8888)){
      System.out.println("서버 실행 중...");
      while (true) {
        Socket clientSocket = ss.accept();
        
        new Thread(() ->handleClient(clientSocket)).start();
        if (stop) {
          break; // 즉시 멈추진 않고, 다음의 클라이언트가 접속할 때 안되겠지.
        }
      }
    } catch (Exception e) {
      e.printStackTrace();
    }
    notifyApplicationContextListenerOnServiceStopped();
  }

  public static void main(String[] args) {
    ServerApp server = new ServerApp();
    
    // 리스너(옵저버 /구독자) 등록 
    server.addApplicationContextListener(new AppInitListener());
    server.addApplicationContextListener(new DataHandlerListener());
    server.addApplicationContextListener(new RequestMappingListener());
    
    server.service(8888);
  }

  private static void handleClient(Socket clientSocket) {
    InetAddress address = clientSocket.getInetAddress();
    System.out.printf("클라이언트(%s)가 연결되었습니다.\n", address.getHostAddress());
    try (Socket socket = clientSocket; // try 블록에서 떠날 때 close()가 자동 호출된다.
        BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        PrintWriter out = new PrintWriter(socket.getOutputStream()))  {
      while (true) {
        String request = in.readLine();
        
        Command command = (Command) context.get(request);
        if (command != null) {
          command.execute();
        } else {
          sendResponse("해당 명령을 처리할 수 없습니다!", out);
        }
        
        
        sendResponse(request, out);   
        if (request.equalsIgnoreCase("quit"))
          break;
        else if (request.equalsIgnoreCase("stop")) {
          stop= true; // 서버의 상태를 멈추라는 의미로 true로 설정한다.
          break;
        }
      }
    } catch (Exception e) {
    }
    
    System.out.printf("클라이언트(%s)와의 연결을 끊습니다.\n", address.getHostAddress());
  }


  private static void sendResponse(String message, PrintWriter out) {
    out.println(message);
    out.println(); // 응답이 끝났음을 알리는 빈 줄 출력 
    out.flush();

  }
}


