package atan.model;

//~--- JDK imports ------------------------------------------------------------

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;
import java.io.StringWriter;

/**
 * A byte buffer class.
 * @author Atan
 */
public class ByteBuffer extends ByteArrayOutputStream {

    /**
     * The default constructor for ByteBuffer
     * @param size
     */
    public ByteBuffer(int size) {
        super(size);
    }

    /**
     *
     * @return
     */
    public byte[] getByteArray() {
        return buf;
    }

    /**
     *
     * @param str
     * @throws IOException
     */
    public void setString(String str) throws IOException {
        Reader r = new StringReader(str);
        int    c;
        reset();
        while (((c = r.read()) != 0) && (c != -1)) {
            write(c);
        }
    }

    /**
     *
     * @return
     * @throws IOException
     */
    public String getString() throws IOException {
        ByteArrayInputStream in = new ByteArrayInputStream(buf);
        int                  c;
        StringWriter         w = new StringWriter();
        while (((c = in.read()) != 0) && (c != -1)) {
            w.write((char) c);
        }
        return w.getBuffer().toString();
    }

    /**
     *
     * @return
     */
    public int length() {
        return buf.length;
    }

    /**
     *
     */
    @Override
    public void reset() {
        super.reset();
        for (int i = 0; i < buf.length; i++) {
            write(0);
        }
        super.reset();
    }
}
