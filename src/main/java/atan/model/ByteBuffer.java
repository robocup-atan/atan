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
     * The constructor for ByteBuffer, specifying the size,
     * in bytes, of the byteBuffer.
     * @param size
     */
    public ByteBuffer(int size) {
        super(size);
    }

    /**
     * Returns the byte array.
     * @return A byte array.
     */
    public byte[] getByteArray() {
        return buf;
    }

    /**
     * Sets the buffer contents.
     * @param str The string to set.
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
     * Gets the buffer contents.
     * @return The string in the buffer.
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
     * Returns the length of the byte buffer.
     * @return The length of the byte buffer.
     */
    public int length() {
        return buf.length;
    }

    /**
     * @inheritDoc
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
