package atan.test;

//~--- non-JDK imports --------------------------------------------------------

import atan.parser.CommandFilter;

/**
 * Class description
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
     * Method description
     */
    void reset() {
        type = UNDEFINED;
        cmd  = "";
    }

    /**
     * Method description
     * @return
     */
    boolean isTypeUndefined() {
        return type == UNDEFINED;
    }

    /**
     * Method description
     * @return
     */
    boolean isTypeError() {
        return type == ERROR;
    }

    /**
     * Method description
     * @return
     */
    boolean isTypeSee() {
        return type == SEE;
    }

    /**
     * Method description
     * @return
     */
    boolean isTypeHear() {
        return type == HEAR;
    }

    /**
     * Method description
     * @return
     */
    boolean isTypeSenseBody() {
        return type == SENSE_BODY;
    }

    /**
     * Method description
     * @return
     */
    boolean isTypeInit() {
        return type == INIT;
    }

    /**
     * Method description
     * @return
     */
    String getCommand() {
        return cmd;
    }

    /**
     * Method description
     * @param cmd
     */
    @Override
    public void seeCommand(String cmd) {
        type     = SEE;
        this.cmd = cmd;
    }

    /**
     * Method description
     * @param cmd
     */
    @Override
    public void hearCommand(String cmd) {
        type     = HEAR;
        this.cmd = cmd;
    }

    /**
     * Method description
     * @param cmd
     */
    @Override
    public void senseBodyCommand(String cmd) {
        type     = SENSE_BODY;
        this.cmd = cmd;
    }

    /**
     * Method description
     * @param cmd
     */
    @Override
    public void initCommand(String cmd) {
        type     = INIT;
        this.cmd = cmd;
    }

    /**
     * Method description
     * @param cmd
     */
    @Override
    public void errorCommand(String cmd) {
        type     = ERROR;
        this.cmd = cmd;
    }
}
