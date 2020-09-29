package com.eomcs.util;

public interface ObjectFactory<E> {
  E create(String csv);
}
