// 데코레이터 패턴 적용 - 부품과 부품을 손쉽게 연결할 수 있다. 기능 확장 및 제거가 매우 쉽다.
package com.eomcs.io.ex09.step3;

import java.io.FileOutputStream;

public class Exam0110 {

  public static void main(String[] args) throws Exception {

    FileOutputStream fileOut = new FileOutputStream("temp/test");

    DataOutputStream out = new DataOutputStream(fileOut);

    Member member = new Member();
    member.name = "AB가각간";
    member.age = 27;
    member.gender = true;


    out.writeUTF(member.name);

    out.writeInt(member.age);
    out.writeBoolean(member.gender);

    out.close();

  }

}
