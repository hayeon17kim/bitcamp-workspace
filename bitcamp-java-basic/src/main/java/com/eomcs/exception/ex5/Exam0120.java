package com.eomcs.exception.ex5;

import java.sql.Date;
import java.util.Scanner;

public class Exam0120 {
  static Board read() throws RuntimeException {
    try (Scanner keyScan = new Scanner(System.in)) {
      Board board = new Board();

      System.out.print("변호> ");
      board.setNo(Integer.parseInt(keyScan.nextLine()));

      System.out.print("제목> ");
      board.setTitle(keyScan.nextLine());

      System.out.print("내용> ");
      board.setContent(keyScan.nextLine());

      System.out.print("등록일> ");
      board.setCreatedDate(Date.valueOf(keyScan.nextLine()));

      return board;
    }
  }

  public static void main(String[] args) {
    try {
      Board board = read();
      System.out.printf("번호: %d\n", board.getNo());
      System.out.printf("제목: %s\n", board.getTitle());
      System.out.printf("내용: %s\n", board.getContent());
      System.out.printf("등록일: %s\n", board.getCreatedDate());
    } catch (RuntimeException e) {
      System.out.println(e.getMessage());
      System.out.println("게시물 입력 중에 오류 발생!");
    }

  }
}
