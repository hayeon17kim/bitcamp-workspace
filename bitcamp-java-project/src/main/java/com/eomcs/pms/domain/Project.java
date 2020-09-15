package com.eomcs.pms.domain;

import java.sql.Date;

public class Project {
  private int no;
  private String title;
  private String content;
  private Date startDate;
  private Date endDate;
  private String owner;
  private String members;

  public int getNo() {
    return no;
  }

  public void setNo(int no) {
    this.no = no;
  }

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public String getContent() {
    return content;
  }

  public void setContent(String content) {
    this.content = content;
  }

  public Date getStartDate() {
    return startDate;
  }

  public void setStartDate(Date startDate) {
    this.startDate = startDate;
  }

  public Date getEndDate() {
    return endDate;
  }

  public void setEndDate(Date endDate) {
    this.endDate = endDate;
  }

  public String getOwner() {
    return owner;
  }

  public void setOwner(String owner) {
    this.owner = owner;
  }

  public String getMembers() {
    return members;
  }

  public void setMembers(String members) {
    this.members = members;
  }

  public String toCsvString() {
    return String.format("%d,%s,%s,%s,%s,%s,%s\n", getNo(), getTitle(), getContent(),
        getStartDate(), getEndDate(), getOwner(), getMembers());
  }

  public static Project valueOfCsv(String csv) {
    // 한 줄을 콤마(,)로 나눈다.
    String[] data = csv.split(",");

    // 한 줄에 들어 있던 데이터를 추출하여 Board 객체에 담는다.
    // // => 번호, 제목, 내용, 작성자, 등록일, 조회수
    Project project = new Project();
    project.setNo(Integer.parseInt(data[0]));
    project.setTitle(data[1]);
    project.setContent(data[2]);
    project.setStartDate(Date.valueOf(data[3]));
    project.setEndDate(Date.valueOf(data[4]));
    project.setOwner(data[5]);
    project.setMembers(data[6]);

    return project;
  }
}
