package com.eomcs.io.ex05;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class DataOutputStream extends FileOutputStream {

  public DataOutputStream(String filepath) throws FileNotFoundException {
    super(filepath);
  }


  public void writeUTF(String str) throws IOException {
    byte[] bytes = str.getBytes("UTF-8");
    this.write(bytes.length);
    this.write(bytes);
  }

  public void writeInt(int value) throws IOException {
    this.write(value >> 24);
    this.write(value >> 16);
    this.write(value >> 8);
    this.write(value);
  }

  public void writeBoolean(boolean b) throws IOException {
    this.write(b ? 1 : 0);
  }

}
