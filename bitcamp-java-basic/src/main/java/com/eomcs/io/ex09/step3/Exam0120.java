package com.eomcs.io.ex09.step3;

import java.io.FileInputStream;

public class Exam0120 {
  public static void main(String[] args) throws Exception {
    FileInputStream fileIn = new FileInputStream("temp/test6");
    DataInputStream in = new DataInputStream(fileIn);

    Member member = new Member();
    member.name = in.readUTF();
    member.age = in.readInt();
    member.gender = in.readBoolean();

    in.close();

    System.out.printf("%s\n", member);
  }
}
