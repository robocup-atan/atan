package atan.test;

//~--- non-JDK imports --------------------------------------------------------

import atan.parser.CommandFilter;

/**
 *
 * @author Atan
 */
public class TestCommandFilter implements CommandFilter {
    private final static int ERROR      = 1;
    private final static int HEAR       = 3;
    private final static int INIT       = 5;
    private final static int SEE        = 2;
    private final static int SENSE_BODY = 4;
    private final static int UNDEFINED  = 0;
    private String           cmd        = "";
    private int              type       = UNDEFINED;

    /**
     *
     */
    void reset() {
        type = UNDEFINED;
        cmd  = "";
    }

    /**
     *
     * @return
     */
    boolean isTypeUndefined() {
        return type == UNDEFINED;
    }

    /**
     *
     * @return
     */
    boolean isTypeError() {
        return type == ERROR;
    }

    /**
     *
     * @return
     */
    boolean isTypeSee() {
        return type == SEE;
    }

    /**
     *
     * @return
     */
    boolean isTypeHear() {
        return type == HEAR;
    }

    /**
     *
     * @return
     */
    boolean isTypeSenseBody() {
        return type == SENSE_BODY;
    }

    /**
     *
     * @return
     */
    boolean isTypeInit() {
        return type == INIT;
    }

    /**
     *
     * @return
     */
    String getCommand() {
        return cmd;
    }

    /**
     *
     * @param cmd
     */
    @Override
    public void seeCommand(String cmd) {
        type     = SEE;
        this.cmd = cmd;
    }

    /**
     *
     * @param cmd
     */
    @Override
    public void hearCommand(String cmd) {
        type     = HEAR;
        this.cmd = cmd;
    }

    /**
     *
     * @param cmd
     */
    @Override
    public void senseBodyCommand(String cmd) {
        type     = SENSE_BODY;
        this.cmd = cmd;
    }

    /**
     *
     * @param cmd
     */
    @Override
    public void initCommand(String cmd) {
        type     = INIT;
        this.cmd = cmd;
    }

    /**
     *
     * @param cmd
     */
    @Override
    public void errorCommand(String cmd) {
        type     = ERROR;
        this.cmd = cmd;
    }

    /**
     *
     * @param cmd
     */
    @Override
    public void serverParamCommand(String cmd) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    /**
     *
     * @param cmd
     */
    @Override
    public void playerParamCommand(String cmd) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    /**
     *
     * @param cmd
     */
    @Override
    public void playerTypeCommand(String cmd) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    /**
     *
     * @param cmd
     */
    @Override
    public void changePlayerTypeCommand(String cmd) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    /**
     *
     * @param cmd
     */
    @Override
    public void okCommand(String cmd) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    /**
     *
     * @param cmd
     */
    @Override
    public void warningCommand(String cmd) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
