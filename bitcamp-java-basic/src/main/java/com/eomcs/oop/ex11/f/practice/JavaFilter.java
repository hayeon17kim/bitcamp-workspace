package com.eomcs.oop.ex11.f.practice;
// 클래스의 종류: 패키지 멤버 클래스

import java.io.File;
import java.io.FilenameFilter;

// 패키지 멤버는 여러 다른 패키지에서 사용할 수 있다.

public class JavaFilter implements FilenameFilter {
  public boolean accept(File dir, String name) {
    if (name.endsWith(".java"))
      return true;
    return false;
  }
}
