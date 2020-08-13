package com.eomcs.corelib.ex01.practice;

public class Exam0170 {
  static class Score {
    String name;
    int kor;
    int eng;
    int math;
    int sum;
    float aver;
    
    public Score() {}
    
    public Score(String name, int kor, int eng, int math) {
      this.name = name;
      this.kor = kor;
      this.eng = eng;
      this.math = math;
      this.sum = this.kor + this.eng + this.math;
      this.aver = this.sum / 3f;
    }
    
    @Override
    public String toString() {
      return "Score [name=" + name + ", kor=" + kor + ", eng=" + eng
          + "sum=" + sum + "aver=" + aver + "]";
      
    }
  }
  
  public static void main(String[] args) {
    Score s1 = new Score("홍길동",100, 100, 100);
    System.out.println(s1);
    
    Score s2 = new Score("홍길동", 100, 100, 100);
    System.out.println(s1 == s2);
    System.out.println(s1);
    System.out.println(s2);
    
    //Score s3 = s1.clone();
    
    
  }
}
