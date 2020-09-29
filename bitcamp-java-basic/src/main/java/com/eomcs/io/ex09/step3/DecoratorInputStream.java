package com.eomcs.io.ex09.step3;

import java.io.IOException;
import java.io.InputStream;

public class DecoratorInputStream extends InputStream {

  InputStream 연결부품;

  public DecoratorInputStream(InputStream in) {
    연결부품 = in;
  }

  @Override
  public int read() throws IOException {
    // TODO Auto-generated method stub
    return 연결부품.read();
  }

  @Override
  public void close() throws IOException {
    연결부품.close();
  }

}
