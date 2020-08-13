package com.eomcs.corelib.ex01.practice;

public class Exam0161 {
  public static void main(String[] args){
    String obj1 = new String();
    Class<?> classInfo = obj1.getClass();
    System.out.println(classInfo.getName());
    
    String[] obj2 = new String[10];
    classInfo = obj2.getClass();
    System.out.println(classInfo.getName());
    
    int[] obj3 = new int[10];
    classInfo = obj3.getClass();
    System.out.println(classInfo.getName());
    
    float[] obj4 = new float[10];
    classInfo = obj4.getClass();
    System.out.println(classInfo.getName());
    
    double[] obj5 = new double[10];
    classInfo = obj5.getClass();
    System.out.println(classInfo.getName());
    
    System.out.println(new byte[10].getClass().getName());
    System.out.println(new short[10].getClass().getName());
    System.out.println(new long[10].getClass().getName());
    System.out.println(new char[10].getClass().getName());
    System.out.println(new boolean[10].getClass().getName());
    
  }
}
