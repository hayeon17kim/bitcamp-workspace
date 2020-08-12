package com.eomcs.oop.ex07.b.practice;

public class Customer3 {
  private String name;
  private int age;
  private int weight;
  private int height;
  
  public void setName(String name) {
    if (name == null) {
      this.name = "이름없음";
      return;
    }
    
    if (name.length() < 2) {
      this.name = "이름없음";
      return;
    }
    
    if(name.length() > 5) {
      this.name = name.substring(0, 5);
    } else {
      this.name = name;
    }
  }
  
  public void setAge(int age) {
    if (age < 1 || age > 120) {
      this.age = 0;
      return;
    } 
    this.age = age;
  }
  
  public void setWeight(int weight) {
    if (weight < 1 || weight > 200) {
      this.weight = 0;
      return;
    } 
    this.weight = weight;
  }
  
  public void setHeight(int height) {
    if (height < 1 || height > 300) {
      this.height = 0;
      return;
    }
    this.height = height;
  }
  
  public String getName() {
    return this.name;
  }
  
  public int getAge() {
    return this.age;
  }
  
  public int getWeight() {
    return this.weight;
  }
  
  public int getHeight() {
    return this.height;
  }
}
