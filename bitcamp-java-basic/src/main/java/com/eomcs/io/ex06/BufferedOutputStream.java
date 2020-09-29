package com.eomcs.io.ex06;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class BufferedOutputStream extends FileOutputStream {
  public BufferedOutputStream(String filepath) throws FileNotFoundException {
    super(filepath);
  }

  byte[] buf = new byte[8192];
  int cursor = 0;

  @Override
  public void write(int b) throws IOException {
    if (cursor == buf.length) {
      this.write(buf);
      cursor = 0;
    }

    buf[cursor++] = (byte) b;
  }

  @Override
  public void flush() throws IOException {
    if (cursor > 0)
      this.write(buf, 0, cursor);
  }
}
