package atan.view;

import java.io.*;
import javax.swing.text.*;

public class DocumentWriter extends Writer {

  private Document doc;

  public DocumentWriter(Document d) {
    doc = d;
  }
  public void write(char[] c, int from, int len) throws java.io.IOException {
    try {
      StringWriter w = new StringWriter();
      w.write(c , from, len);
      doc.insertString (0, w.toString(), null);
    } catch (BadLocationException ex) {
      throw new IOException("BadLocationExceptin was thrown: "+ex.getMessage());
    }
  }
  public void flush() throws java.io.IOException {
  }
  public void close() throws java.io.IOException {
  }


}