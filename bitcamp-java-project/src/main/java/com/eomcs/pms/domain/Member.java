package com.eomcs.pms.domain;

import java.sql.Date;

public class Member {
  private int no;
  private String name;
  private String email;
  private String password;
  private String photo;
  private String tel;
  private Date registeredDate;

  public int getNo() {
    return no;
  }

  public void setNo(int no) {
    this.no = no;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public String getPhoto() {
    return photo;
  }

  public void setPhoto(String photo) {
    this.photo = photo;
  }

  public String getTel() {
    return tel;
  }

  public void setTel(String tel) {
    this.tel = tel;
  }

  public Date getRegisteredDate() {
    return registeredDate;
  }

  public void setRegisteredDate(Date registeredDate) {
    this.registeredDate = registeredDate;
  }

  public String toCsvString() {
    return String.format("%d,%s,%s,%s,%s,%s,%s", getNo(), getName(), getEmail(), getPassword(),
        getPhoto(), getTel(), getRegisteredDate());
  }

  public static Member valueOfCsv(String csv) {
    // 한 줄을 콤마(,)로 나눈다.
    String[] data = csv.split(",");

    // 한 줄에 들어 있던 데이터를 추출하여 Board 객체에 담는다.
    // // => 번호, 제목, 내용, 작성자, 등록일, 조회수
    Member member = new Member();
    member.setNo(Integer.parseInt(data[0]));
    member.setName(data[1]);
    member.setEmail(data[2]);
    member.setPassword(data[3]);
    member.setPhoto(data[4]);
    member.setTel(data[5]);
    member.setRegisteredDate(Date.valueOf(data[6]));

    return member;
  }

}
