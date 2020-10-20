package com.eomcs.pms;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Hashtable;
import java.util.List;
import java.util.Map;
import com.eomcs.context.ApplicationContextListener;
import com.eomcs.pms.listener.AppInitListener;
import com.eomcs.pms.listener.DataHandlerListener;
import com.eomcs.util.Prompt;

//Stateful 통신
//=> 클라이언트가 연결되면 클라이언트가 보낸 메시지를 그대로 리턴해 준다.
//=> 클라이언트의 요청을 반복해서 처리한다.
//=> 클라이언트가 quit 명령을 보내면 응답한 후 연결을 끊는다.
//=> 응답의 끝에는 빈 줄을 보내도록 응답 프로토콜을 정의한다.
//   - 프로토콜이란? 클라이언트/서버 간의 데이터를 주고 받는 형식이다.
//=> 클라이언트 연결이 끊어지면 다음 클라이언트와 연결하는 것을 반복한다.
//=> 클라이언트가 접속하거나 연결을 끊으면 로그를 남긴다.
//=> 다중 클라이언트의 동시 접속을 처리한다.
//   - Thread 를 상속 받아 스레드 만들기
public class ServerApp {
  
  boolean stop = false;
  
  // 옵저버와 공유할 맵 객체
  Map<String,Object> context = new Hashtable<>();

  // 옵저버를 보관할 컬렉션 객체
  List<ApplicationContextListener> listeners = new ArrayList<>();

  // 옵저버를 등록하는 메서드
  public void addApplicationContextListener(ApplicationContextListener listener) {
    listeners.add(listener);
  }

  // 옵저버를 제거하는 메서드
  public void removeApplicationContextListener(ApplicationContextListener listener) {
    listeners.remove(listener);
  }


  // service() 실행 전에 옵저버에게 통지한다.
  private void notifyApplicationContextListenerOnServiceStarted() {
    for (ApplicationContextListener listener : listeners) {
      // 곧 서비스를 시작할테니 준비하라고,
      // 서비스 시작에 관심있는 각 옵저버에게 통지한다.
      // => 옵저버에게 맵 객체를 넘겨준다.
      // => 옵저버는 작업 결과를 파라미터로 넘겨준 맵 객체에 담아 줄 것이다.
      listener.contextInitialized(context);
    }
  }
  
  // service() 실행 후에 옵저버에게 통지한다.
  private void notifyApplicationContextListenerOnServiceStopped() {
    for (ApplicationContextListener listener : listeners) {
      // 서비스가 종료되었으니 마무리 작업하라고,
      // 마무리 작업에 관심있는 각 옵저버에게 통지한다.
      // => 옵저버에게 맵 객체를 넘겨준다.
      // => 옵저버는 작업 결과를 파라미터로 넘겨준 맵 객체에 담아 줄 것이다.
      listener.contextDestroyed(context);
    }
  }
  
  public static void main(String[] args) {
    
    ServerApp server = new ServerApp();

    // 옵저버 등록
    server.addApplicationContextListener(new AppInitListener());
    server.addApplicationContextListener(new DataHandlerListener());

    server.service(8888);
  }
  
  public void service(int port) {
    notifyApplicationContextListenerOnServiceStarted();
    try (ServerSocket serverSocket = new ServerSocket(port)) {
      System.out.println("서버 실행 중...");

      while (true) {
        
        if (stop) {
          break;
        }
        
        Socket clientSocket = serverSocket.accept();
        new Thread(()  -> handleClient(clientSocket)).start();
      }
    } catch (Exception e) {
      e.printStackTrace();
    }
    notifyApplicationContextListenerOnServiceStopped();
  }
  
  public void handleClient(Socket clientSocket) {
    InetAddress address = clientSocket.getInetAddress();
    System.out.printf("클라이언트(%s)가 연결되었습니다.\n",
        address.getHostAddress());

    try (Socket socket = clientSocket;
        BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        PrintWriter out = new PrintWriter(socket.getOutputStream())) {

      while (true) {
        String request = in.readLine();
        if (request.equalsIgnoreCase("quit")) {
          out.println("안녕!");
          out.println();
          out.flush();
          break;
        } else if (request.equalsIgnoreCase("stop")) {
          stop = true;
          out.println("서버를 종료하는 중입니다.");
          out.println();
          out.flush();
          break;
        }
      }

    } catch (Exception e) {
      System.out.println("클라이언트와의 통신 오류!");
    }

    System.out.printf("클라이언트(%s)와의 연결을 끊었습니다.\n",
        address.getHostAddress());
  }
}