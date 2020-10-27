package com.eomcs.concurrent.ex5;

public class Account {
  String accountId;
  long balance;
  
  public Account(String accountId, long balance) {
    this.accountId = accountId;
    this.balance = balance;
  }
  
  public long withdraw (long money) {
    long b = this.balance;
    delay();
    b -= money;
    delay();
    if (b < 0)
      return 0;
    delay();
    this.balance = b;
    delay();
    return money;
  }
  
  private void delay() {
    int delayCount = (int)(Math.random() * 1000);
    for (int i = 0; i < delayCount; i++)
      Math.asin(45.765); 
  }
}
