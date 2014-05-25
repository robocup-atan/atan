package com.github.robocup_atan.atan.model;

/*
 * #%L
 * Atan
 * %%
 * Copyright (C) 2003 - 2014 Atan
 * %%
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 * 
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 * 
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 * #L%
 */

//~--- JDK imports ------------------------------------------------------------

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;
import java.io.StringWriter;

/**
 * A byte buffer class.
 *
 * @author Atan
 */
public class ByteBuffer extends ByteArrayOutputStream {

    /**
     * The constructor for ByteBuffer, specifying the size,
     * in bytes, of the byteBuffer.
     *
     * @param size a int.
     */
    public ByteBuffer(int size) {
        super(size);
    }

    /**
     * Returns the byte array.
     *
     * @return A byte array.
     */
    public byte[] getByteArray() {
        return buf;
    }

    /**
     * Sets the buffer contents.
     *
     * @param str The string to set.
     * @throws java.io.IOException if any.
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
     *
     * @return The string in the buffer.
     * @throws java.io.IOException if any.
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
     *
     * @return The length of the byte buffer.
     */
    public int length() {
        return buf.length;
    }

    /** {@inheritDoc} */
    @Override
    public void reset() {
        super.reset();
        for (int i = 0; i < buf.length; i++) {
            write(0);
        }
        super.reset();
    }
}
