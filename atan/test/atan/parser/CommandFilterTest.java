/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package atan.parser;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Nick
 */
public class CommandFilterTest {

    public CommandFilterTest() {
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    /**
     * Test of seeCommand method, of class CommandFilter.
     */
    @Test
    public void testSeeCommand() {
        System.out.println("seeCommand");
        String cmd = "";
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
        String cmd = "";
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
        String cmd = "";
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
        String cmd = "";
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
        String cmd = "";
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
        String cmd = "";
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
        String cmd = "";
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
        String cmd = "";
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
        String cmd = "";
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
        String cmd = "";
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
        String cmd = "";
        CommandFilter instance = new CommandFilterImpl();
        instance.warningCommand(cmd);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    public class CommandFilterImpl implements CommandFilter {

        public void seeCommand(String cmd) {
        }

        public void hearCommand(String cmd) {
        }

        public void senseBodyCommand(String cmd) {
        }

        public void initCommand(String cmd) {
        }

        public void errorCommand(String cmd) {
        }

        public void serverParamCommand(String cmd) {
        }

        public void playerParamCommand(String cmd) {
        }

        public void playerTypeCommand(String cmd) {
        }

        public void changePlayerTypeCommand(String cmd) {
        }

        public void okCommand(String cmd) {
        }

        public void warningCommand(String cmd) {
        }
    }

}