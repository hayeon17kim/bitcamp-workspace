package com.eomcs.pms.domain;

import java.sql.Date;

public class Board {
  private int no;
  private String title;
  private String content;
<<<<<<< HEAD
  private int writer;
=======
  private Member writer;
>>>>>>> 2c80e05befb42327ac0ad96bc702c2a763386f29
  private Date registeredDate;
  private int viewCount;

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
<<<<<<< HEAD
  public int getWriter() {
    return writer;
  }
  public void setWriter(int writer) {
=======
  public Member getWriter() {
    return writer;
  }
  public void setWriter(Member writer) {
>>>>>>> 2c80e05befb42327ac0ad96bc702c2a763386f29
    this.writer = writer;
  }
  public Date getRegisteredDate() {
    return registeredDate;
  }
  public void setRegisteredDate(Date registeredDate) {
    this.registeredDate = registeredDate;
  }
  public int getViewCount() {
    return viewCount;
  }
  public void setViewCount(int viewCount) {
    this.viewCount = viewCount;
  }
}






