package atan.model;

//~--- JDK imports ------------------------------------------------------------

import java.io.Writer;

/**
 * A null logger. Used to avoid errors.
 * @author Atan
 */
public class NullLogger extends Writer {

    /**
     *
     * @param parm1
     * @param parm2
     * @param parm3
     * @throws java.io.IOException
     */
    @Override
    public void write(char[] parm1, int parm2, int parm3) throws java.io.IOException {}

    /**
     *
     * @throws java.io.IOException
     */
    @Override
    public void flush() throws java.io.IOException {}

    /**
     *
     * @throws java.io.IOException
     */
    @Override
    public void close() throws java.io.IOException {}
}
