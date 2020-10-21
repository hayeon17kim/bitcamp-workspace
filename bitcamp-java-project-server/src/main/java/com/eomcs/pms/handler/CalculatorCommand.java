package com.eomcs.pms.handler;

import java.io.BufferedReader;
import java.io.PrintWriter;
import com.eomcs.util.Prompt;

public class CalculatorCommand implements Command {

  @Override
  public void execute(PrintWriter out, BufferedReader in) {
    try {
      out.println("[계산기]");
      
      String input = Prompt.inputString("계산식?(예: 5 * 3");
      String[] arr = input.split(" ");
      if (arr.length != 3) {
        out.println("계산식이 옳지 않습니다.");
        out.println("계산식 예: 15 * 45");
        return;
      }
      
      int a = Integer.parseInt(arr[0]);
      String op  = arr[1];
      int b = Integer.parseInt(arr[2]);
      int result = 0;
      
      switch (op) {
        case "+": result = a + b; break;
        case "-": result = a - b; break;
        case "/": result = a / b; break;
        case "*": result = a * b; break;
        default:
          out.println("해당 연산을 지원하지 않습니다.");
          return;
      }
      
      out.printf("계산 결과: %d %s %d = %d", a, op, b, result);
      
    } catch (Exception e) {
      System.out.println("작업 처리 중 오류 발생!");
    }
    
  }

}
