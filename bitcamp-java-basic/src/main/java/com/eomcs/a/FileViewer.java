package com.eomcs.a;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileViewer {
  public static void main(String[] args) throws IOException {
    FileInputStream in = new FileInputStream(args[0]);
    FileOutputStream out = new FileOutputStream(args[1]);
    int data = 0;
    while ((data = in.read()) != -1) {
      out.write(data);
    }
  }
}
