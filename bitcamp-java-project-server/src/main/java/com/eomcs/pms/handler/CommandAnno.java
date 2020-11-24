package com.eomcs.pms.handler;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

<<<<<<< HEAD
// 커맨드 객체에 붙일 특별한 주석
// => 커맨드의 이름을 설정하는 용도이다.
// => JVM에서 객체를 생성할 때 사용할 것이다.
//
=======

// 커맨드 객체에 붙일 특별한 주석
// => 커맨드의 이름을 설정하는 용도이다.
// => JVM에서 객체를 생성할 때 사용할 것이다. 
>>>>>>> b2246385c7ae9f527ca04b18fce4ea5b337d8508
@Retention(RetentionPolicy.RUNTIME)
public @interface CommandAnno {
  String value(); // 이름을 저장하는 프로퍼티
}
