package atan.view;

import java.io.*;
import java.awt.*;


public class TextAreaWriter extends Writer {


  private TextArea textArea;

  public TextAreaWriter(TextArea ta) {
    textArea = ta;
  }
  public void write(char[] c, int from, int len) throws java.io.IOException {
    StringWriter w = new StringWriter();
    w.write(c , from, len);
    textArea.append(w.toString());
  }
  public void flush() throws java.io.IOException {
  }
  public void close() throws java.io.IOException {
  }
}