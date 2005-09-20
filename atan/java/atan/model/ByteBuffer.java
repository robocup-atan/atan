package atan.model;

import java.io.*;

public class ByteBuffer extends ByteArrayOutputStream {

  public ByteBuffer(int size) {
    super(size);
  }
  public byte[] getByteArray () {
    return buf;
  }
  public void setString (String str) throws IOException {
    Reader r = new StringReader(str);
    int c;
    reset();
    while (((c = r.read()) != 0) && (c != -1)) write(c);
  }
  public  String getString () throws IOException {
    ByteArrayInputStream in = new ByteArrayInputStream(buf);
    int c;
    StringWriter w = new StringWriter();
    while (((c = in.read()) != 0) && (c != -1)) {
      w.write((char)c);
    }
    return w.getBuffer().toString();
  }
  public int length () {
    return buf.length;
  }
  public void reset () {
    super.reset();
    for (int i=0; i<buf.length; i++) write(0);
    super.reset();
  }
}