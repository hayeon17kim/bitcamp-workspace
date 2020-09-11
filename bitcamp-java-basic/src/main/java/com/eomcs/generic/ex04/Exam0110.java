package com.eomcs.generic.ex04;

// 제네릭이 적용 안 된 메서드의 리턴 타입은 Object[]이다.
public class Exam0110 {
  static Object[] reverse(Object[] arr) {
    for (int i = 0; i < arr.length / 2; i++) {
      Object temp = arr[i];
      int targetIndex = arr.length - 1 - i;
      arr[i] = arr[targetIndex];
      arr[targetIndex] = temp;
    }
    return arr;
  }

  // 제네릭이 적용된 메서드의 리턴 타입은 파라미터 타입과 같은 String[]이다.
  static <T> T[] reverse2(T[] arr) {
    for (int i = 0; i < arr.length / 2; i++) {
      T temp2 = arr[i];
      int targetIndex = arr.length - 1 - i;
      arr[i] = arr[targetIndex];
      arr[targetIndex] = temp2;
    }
    return arr;
  }

  public static void main(String[] args) {
    Object[] arr = reverse(new String[] {"a", "b", "c", "d", "e", "i", "j", "k"});
    for (Object value : arr) {
      System.out.print(value + ", ");
    }
  }
}
