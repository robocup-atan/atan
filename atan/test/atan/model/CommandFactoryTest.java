/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package atan.model;

import atan.model.enums.PlayMode;
import atan.model.enums.ViewAngle;
import atan.model.enums.ViewQuality;
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
public class CommandFactoryTest {

    public CommandFactoryTest() {
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
     * Test of addPlayerInitCommand method, of class CommandFactory.
     */
    @Test
    public void testAddPlayerInitCommand() {
        System.out.println("addPlayerInitCommand");
        String teamName = "";
        boolean isGoalie = false;
        String version = "";
        CommandFactory instance = new CommandFactory();
        instance.addPlayerInitCommand(teamName, isGoalie, version);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addTrainerInitCommand method, of class CommandFactory.
     */
    @Test
    public void testAddTrainerInitCommand() {
        System.out.println("addTrainerInitCommand");
        String version = "";
        CommandFactory instance = new CommandFactory();
        instance.addTrainerInitCommand(version);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addCoachInitCommand method, of class CommandFactory.
     */
    @Test
    public void testAddCoachInitCommand() {
        System.out.println("addCoachInitCommand");
        String teamName = "";
        String version = "";
        CommandFactory instance = new CommandFactory();
        instance.addCoachInitCommand(teamName, version);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addReconnectCommand method, of class CommandFactory.
     */
    @Test
    public void testAddReconnectCommand() {
        System.out.println("addReconnectCommand");
        String teamName = "";
        int num = 0;
        CommandFactory instance = new CommandFactory();
        instance.addReconnectCommand(teamName, num);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addCatchCommand method, of class CommandFactory.
     */
    @Test
    public void testAddCatchCommand() {
        System.out.println("addCatchCommand");
        int direction = 0;
        CommandFactory instance = new CommandFactory();
        instance.addCatchCommand(direction);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addChangeViewCommand method, of class CommandFactory.
     */
    @Test
    public void testAddChangeViewCommand() {
        System.out.println("addChangeViewCommand");
        ViewAngle angle = null;
        ViewQuality quality = null;
        CommandFactory instance = new CommandFactory();
        instance.addChangeViewCommand(angle, quality);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addDashCommand method, of class CommandFactory.
     */
    @Test
    public void testAddDashCommand() {
        System.out.println("addDashCommand");
        int power = 0;
        CommandFactory instance = new CommandFactory();
        instance.addDashCommand(power);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addKickCommand method, of class CommandFactory.
     */
    @Test
    public void testAddKickCommand() {
        System.out.println("addKickCommand");
        int power = 0;
        int direction = 0;
        CommandFactory instance = new CommandFactory();
        instance.addKickCommand(power, direction);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addMoveCommand method, of class CommandFactory.
     */
    @Test
    public void testAddMoveCommand() {
        System.out.println("addMoveCommand");
        int x = 0;
        int y = 0;
        CommandFactory instance = new CommandFactory();
        instance.addMoveCommand(x, y);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addTurnCommand method, of class CommandFactory.
     */
    @Test
    public void testAddTurnCommand() {
        System.out.println("addTurnCommand");
        int angle = 0;
        CommandFactory instance = new CommandFactory();
        instance.addTurnCommand(angle);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addTurnNeckCommand method, of class CommandFactory.
     */
    @Test
    public void testAddTurnNeckCommand() {
        System.out.println("addTurnNeckCommand");
        int angle = 0;
        CommandFactory instance = new CommandFactory();
        instance.addTurnNeckCommand(angle);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addSayCommand method, of class CommandFactory.
     */
    @Test
    public void testAddSayCommand() {
        System.out.println("addSayCommand");
        String message = "";
        CommandFactory instance = new CommandFactory();
        instance.addSayCommand(message);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addSenseBodyCommand method, of class CommandFactory.
     */
    @Test
    public void testAddSenseBodyCommand() {
        System.out.println("addSenseBodyCommand");
        CommandFactory instance = new CommandFactory();
        instance.addSenseBodyCommand();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addChangePlayModeCommand method, of class CommandFactory.
     */
    @Test
    public void testAddChangePlayModeCommand() {
        System.out.println("addChangePlayModeCommand");
        PlayMode playMode = null;
        CommandFactory instance = new CommandFactory();
        instance.addChangePlayModeCommand(playMode);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addMovePlayerCommand method, of class CommandFactory.
     */
    @Test
    public void testAddMovePlayerCommand() {
        System.out.println("addMovePlayerCommand");
        ActionsPlayer p = null;
        double x = 0.0;
        double y = 0.0;
        CommandFactory instance = new CommandFactory();
        instance.addMovePlayerCommand(p, x, y);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addMoveBallCommand method, of class CommandFactory.
     */
    @Test
    public void testAddMoveBallCommand() {
        System.out.println("addMoveBallCommand");
        double x = 0.0;
        double y = 0.0;
        CommandFactory instance = new CommandFactory();
        instance.addMoveBallCommand(x, y);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addCheckBallCommand method, of class CommandFactory.
     */
    @Test
    public void testAddCheckBallCommand() {
        System.out.println("addCheckBallCommand");
        CommandFactory instance = new CommandFactory();
        instance.addCheckBallCommand();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addStartCommand method, of class CommandFactory.
     */
    @Test
    public void testAddStartCommand() {
        System.out.println("addStartCommand");
        CommandFactory instance = new CommandFactory();
        instance.addStartCommand();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addRecoverCommand method, of class CommandFactory.
     */
    @Test
    public void testAddRecoverCommand() {
        System.out.println("addRecoverCommand");
        CommandFactory instance = new CommandFactory();
        instance.addRecoverCommand();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addEarCommand method, of class CommandFactory.
     */
    @Test
    public void testAddEarCommand() {
        System.out.println("addEarCommand");
        boolean earOn = false;
        CommandFactory instance = new CommandFactory();
        instance.addEarCommand(earOn);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addChangePlayerTypeCommand method, of class CommandFactory.
     */
    @Test
    public void testAddChangePlayerTypeCommand_3args() {
        System.out.println("addChangePlayerTypeCommand");
        String teamName = "";
        int unum = 0;
        int playerType = 0;
        CommandFactory instance = new CommandFactory();
        instance.addChangePlayerTypeCommand(teamName, unum, playerType);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addEyeCommand method, of class CommandFactory.
     */
    @Test
    public void testAddEyeCommand() {
        System.out.println("addEyeCommand");
        boolean eyeOn = false;
        CommandFactory instance = new CommandFactory();
        instance.addEyeCommand(eyeOn);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addLookCommand method, of class CommandFactory.
     */
    @Test
    public void testAddLookCommand() {
        System.out.println("addLookCommand");
        CommandFactory instance = new CommandFactory();
        instance.addLookCommand();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addTeamNamesCommand method, of class CommandFactory.
     */
    @Test
    public void testAddTeamNamesCommand() {
        System.out.println("addTeamNamesCommand");
        CommandFactory instance = new CommandFactory();
        instance.addTeamNamesCommand();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addChangePlayerTypeCommand method, of class CommandFactory.
     */
    @Test
    public void testAddChangePlayerTypeCommand_int_Object() {
        System.out.println("addChangePlayerTypeCommand");
        int unum = 0;
        Object playerType = null;
        CommandFactory instance = new CommandFactory();
        instance.addChangePlayerTypeCommand(unum, playerType);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addTeamGraphicCommand method, of class CommandFactory.
     */
    @Test
    public void testAddTeamGraphicCommand() {
        System.out.println("addTeamGraphicCommand");
        XPMImage xpm = null;
        CommandFactory instance = new CommandFactory();
        instance.addTeamGraphicCommand(xpm);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addByeCommand method, of class CommandFactory.
     */
    @Test
    public void testAddByeCommand() {
        System.out.println("addByeCommand");
        CommandFactory instance = new CommandFactory();
        instance.addByeCommand();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of next method, of class CommandFactory.
     */
    @Test
    public void testNext() {
        System.out.println("next");
        CommandFactory instance = new CommandFactory();
        String expResult = "";
        String result = instance.next();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of hasNext method, of class CommandFactory.
     */
    @Test
    public void testHasNext() {
        System.out.println("hasNext");
        CommandFactory instance = new CommandFactory();
        boolean expResult = false;
        boolean result = instance.hasNext();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

}