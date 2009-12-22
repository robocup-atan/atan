package atan.model;

//~--- JDK imports ------------------------------------------------------------

import java.io.Writer;

/**
 * Class description
 * @author Atan
 */
public class NullLogger extends Writer {

    /**
     * Constructs ...
     */
    public NullLogger() {}

    /**
     * Method description
     * @param parm1
     * @param parm2
     * @param parm3
     * @throws java.io.IOException
     */
    public void write(char[] parm1, int parm2, int parm3) throws java.io.IOException {}

    /**
     * Method description
     * @throws java.io.IOException
     */
    public void flush() throws java.io.IOException {}

    /**
     * Method description
     * @throws java.io.IOException
     */
    public void close() throws java.io.IOException {}
}
