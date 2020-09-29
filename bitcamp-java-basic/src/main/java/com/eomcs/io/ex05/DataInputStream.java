package com.eomcs.io.ex05;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class DataInputStream extends FileInputStream {
  public DataInputStream(String filepath) throws FileNotFoundException {
    super(filepath);
  }

  public String readUTF() throws IOException {
    int size = this.read();
    byte[] buf = new byte[size];
    this.read(buf);
    return new String(buf, "UTF-8");
  }

  public int readInt() throws IOException {
    int i = 0;
    i += this.read() << 24;
    i += this.read() << 16;
    i += this.read() << 8;
    i += this.read();
    return i;
  }

  public boolean readBoolean() throws IOException {
    return this.read() == 1;
  }
}
