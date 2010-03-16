package atan.parser;

//~--- non-JDK imports --------------------------------------------------------

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 *
 * @author Atan
 */
public class CommandFilterTest {

    /**
     *
     */
    public CommandFilterTest() {}

    /**
     *
     * @throws Exception
     */
    @BeforeClass
    public static void setUpClass() throws Exception {}

    /**
     *
     * @throws Exception
     */
    @AfterClass
    public static void tearDownClass() throws Exception {}

    /**
     *
     */
    @Before
    public void setUp() {}

    /**
     *
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

        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
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

        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
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

        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
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

        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
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

        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
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

        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
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

        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
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

        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
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

        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
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

        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
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

        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     *
     * @author author
     */
    public class CommandFilterImpl implements CommandFilter {

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
