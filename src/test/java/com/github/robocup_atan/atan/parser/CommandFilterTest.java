package com.github.robocup_atan.atan.parser;

//~--- non-JDK imports --------------------------------------------------------

import com.github.robocup_atan.atan.parser.CommandFilter;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * <p>CommandFilterTest class.</p>
 *
 * @author Atan
 * @since 1.0
 */
public class CommandFilterTest {

    /**
     * <p>Constructor for CommandFilterTest.</p>
     */
    public CommandFilterTest() {}

    /**
     * <p>setUpClass.</p>
     *
     * @throws java.lang.Exception if any.
     */
    @BeforeClass
    public static void setUpClass() throws Exception {}

    /**
     * <p>tearDownClass.</p>
     *
     * @throws java.lang.Exception if any.
     */
    @AfterClass
    public static void tearDownClass() throws Exception {}

    /**
     * <p>setUp.</p>
     */
    @Before
    public void setUp() {}

    /**
     * <p>tearDown.</p>
     */
    @After
    public void tearDown() {}

    /**
     * Test of seeCommand method, of class CommandFilter.
     */
    @Test
    public void testSeeCommand() {
        System.out.println("seeCommand");
        String        cmd      = "";
        CommandFilter instance = new CommandFilterImpl();
        instance.seeCommand(cmd);
    }

    /**
     * Test of hearCommand method, of class CommandFilter.
     */
    @Test
    public void testHearCommand() {
        System.out.println("hearCommand");
        String        cmd      = "";
        CommandFilter instance = new CommandFilterImpl();
        instance.hearCommand(cmd);
    }

    /**
     * Test of senseBodyCommand method, of class CommandFilter.
     */
    @Test
    public void testSenseBodyCommand() {
        System.out.println("senseBodyCommand");
        String        cmd      = "";
        CommandFilter instance = new CommandFilterImpl();
        instance.senseBodyCommand(cmd);
    }

    /**
     * Test of initCommand method, of class CommandFilter.
     */
    @Test
    public void testInitCommand() {
        System.out.println("initCommand");
        String        cmd      = "";
        CommandFilter instance = new CommandFilterImpl();
        instance.initCommand(cmd);
    }

    /**
     * Test of errorCommand method, of class CommandFilter.
     */
    @Test
    public void testErrorCommand() {
        System.out.println("errorCommand");
        String        cmd      = "";
        CommandFilter instance = new CommandFilterImpl();
        instance.errorCommand(cmd);
    }

    /**
     * Test of serverParamCommand method, of class CommandFilter.
     */
    @Test
    public void testServerParamCommand() {
        System.out.println("serverParamCommand");
        String        cmd      = "";
        CommandFilter instance = new CommandFilterImpl();
        instance.serverParamCommand(cmd);
    }

    /**
     * Test of playerParamCommand method, of class CommandFilter.
     */
    @Test
    public void testPlayerParamCommand() {
        System.out.println("playerParamCommand");
        String        cmd      = "";
        CommandFilter instance = new CommandFilterImpl();
        instance.playerParamCommand(cmd);
    }

    /**
     * Test of playerTypeCommand method, of class CommandFilter.
     */
    @Test
    public void testPlayerTypeCommand() {
        System.out.println("playerTypeCommand");
        String        cmd      = "";
        CommandFilter instance = new CommandFilterImpl();
        instance.playerTypeCommand(cmd);
    }

    /**
     * Test of changePlayerTypeCommand method, of class CommandFilter.
     */
    @Test
    public void testChangePlayerTypeCommand() {
        System.out.println("changePlayerTypeCommand");
        String        cmd      = "";
        CommandFilter instance = new CommandFilterImpl();
        instance.changePlayerTypeCommand(cmd);
    }

    /**
     * Test of okCommand method, of class CommandFilter.
     */
    @Test
    public void testOkCommand() {
        System.out.println("okCommand");
        String        cmd      = "";
        CommandFilter instance = new CommandFilterImpl();
        instance.okCommand(cmd);
    }

    /**
     * Test of warningCommand method, of class CommandFilter.
     */
    @Test
    public void testWarningCommand() {
        System.out.println("warningCommand");
        String        cmd      = "";
        CommandFilter instance = new CommandFilterImpl();
        instance.warningCommand(cmd);
    }

    /**
     *
     * @author Atan
     */
    public static class CommandFilterImpl implements CommandFilter {

        /**
         *
         * @param cmd
         */
        @Override
        public void seeCommand(String cmd) {}

        /**
         *
         * @param cmd
         */
        @Override
        public void hearCommand(String cmd) {}

        /**
         *
         * @param cmd
         */
        @Override
        public void senseBodyCommand(String cmd) {}

        /**
         *
         * @param cmd
         */
        @Override
        public void initCommand(String cmd) {}

        /**
         *
         * @param cmd
         */
        @Override
        public void errorCommand(String cmd) {}

        /**
         *
         * @param cmd
         */
        @Override
        public void serverParamCommand(String cmd) {}

        /**
         *
         * @param cmd
         */
        @Override
        public void playerParamCommand(String cmd) {}

        /**
         *
         * @param cmd
         */
        @Override
        public void playerTypeCommand(String cmd) {}

        /**
         *
         * @param cmd
         */
        @Override
        public void changePlayerTypeCommand(String cmd) {}

        /**
         *
         * @param cmd
         */
        @Override
        public void okCommand(String cmd) {}

        /**
         *
         * @param cmd
         */
        @Override
        public void warningCommand(String cmd) {}
    }
}
