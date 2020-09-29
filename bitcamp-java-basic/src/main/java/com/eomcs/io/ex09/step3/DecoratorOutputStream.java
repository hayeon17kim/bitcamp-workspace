package com.eomcs.io.ex09.step3;

import java.io.IOException;
import java.io.OutputStream;

public class DecoratorOutputStream extends OutputStream {

  OutputStream 연결된부품;

  public DecoratorOutputStream(OutputStream 부품) {
    this.연결된부품 = 부품;
  }

  @Override
  public void write(int b) throws IOException {
    연결된부품.write(b);
  }

  @Override
  public void close() throws IOException {
    연결된부품.close();
  }
}
