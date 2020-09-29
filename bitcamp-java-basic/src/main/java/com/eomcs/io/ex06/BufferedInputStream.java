package com.eomcs.io.ex06;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class BufferedInputStream extends FileInputStream {

  byte[] buf = new byte[8192];
  int size;
  int cursor;

  public BufferedInputStream(String filepath) throws FileNotFoundException {
    super(filepath);
    // TODO Auto-generated constructor stub
  }

  @Override
  public int read() throws IOException {
    if (cursor == size) {
      this.size = this.read(buf);
      if (this.size == -1) {
        return -1;
      }
      this.cursor = 0;
    }
    return buf[cursor++] & 0x000000ff;
  }

}
