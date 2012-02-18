package atan.model;

//~--- non-JDK imports --------------------------------------------------------

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
 * @author Atan
 */
public class CommandFactoryTest {

    /**
     *
     */
    public CommandFactoryTest() {}

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
     * Test of addPlayerInitCommand method, of class CommandFactory.
     */
    @Test
    public void testAddPlayerInitCommand() {
        System.out.println("addPlayerInitCommand");
        String         teamName = "superteam";
        boolean        isGoalie = true;
        String         version  = "13";
        CommandFactory instance = new CommandFactory();
        instance.addPlayerInitCommand(teamName, isGoalie, version);
        assertEquals("(init superteam (version 13) (goalie))", instance.next());
        isGoalie = false;
        instance.addPlayerInitCommand(teamName, isGoalie, version);
        assertEquals("(init superteam (version 13))", instance.next());
    }

    /**
     * Test of addTrainerInitCommand method, of class CommandFactory.
     */
    @Test
    public void testAddTrainerInitCommand() {
        System.out.println("addTrainerInitCommand");
        String         version  = "13";
        CommandFactory instance = new CommandFactory();
        instance.addTrainerInitCommand(version);
        assertEquals("(init (version 13))", instance.next());
    }

    /**
     * Test of addCoachInitCommand method, of class CommandFactory.
     */
    @Test
    public void testAddCoachInitCommand() {
        System.out.println("addCoachInitCommand");
        String         teamName = "superteam";
        String         version  = "13";
        CommandFactory instance = new CommandFactory();
        instance.addCoachInitCommand(teamName, version);
        assertEquals("(init superteam (version 13))", instance.next());
    }

    /**
     * Test of addReconnectCommand method, of class CommandFactory.
     */
    @Test
    public void testAddReconnectCommand() {
        System.out.println("addReconnectCommand");
        String         teamName = "superteam";
        int            num      = 11;
        CommandFactory instance = new CommandFactory();
        instance.addReconnectCommand(teamName, num);
        assertEquals("(reconnect superteam 11)", instance.next());
    }

    /**
     * Test of addCatchCommand method, of class CommandFactory.
     */
    @Test
    public void testAddCatchCommand() {
        System.out.println("addCatchCommand");
        int            direction = -5;
        CommandFactory instance  = new CommandFactory();
        instance.addCatchCommand(direction);
        assertEquals("(catch -5)", instance.next());
    }

    /**
     * Test of addChangeViewCommand method, of class CommandFactory.
     */
    @Test
    public void testAddChangeViewCommand() {
        System.out.println("addChangeViewCommand");
        ViewAngle      angle    = ViewAngle.WIDE;
        ViewQuality    quality  = ViewQuality.HIGH;
        CommandFactory instance = new CommandFactory();
        instance.addChangeViewCommand(angle, quality);
        assertEquals("(change_view wide high)", instance.next());
    }

    /**
     * Test of addDashCommand method, of class CommandFactory.
     */
    @Test
    public void testAddDashCommand() {
        System.out.println("addDashCommand");
        int            power    = 56;
        CommandFactory instance = new CommandFactory();
        instance.addDashCommand(power);
        assertEquals("(dash 56)", instance.next());
    }

    /**
     * Test of addKickCommand method, of class CommandFactory.
     */
    @Test
    public void testAddKickCommand() {
        System.out.println("addKickCommand");
        int            power     = 100;
        int            direction = 12;
        CommandFactory instance  = new CommandFactory();
        instance.addKickCommand(power, direction);
        assertEquals("(kick 100 12)", instance.next());
    }

    /**
     * Test of addMoveCommand method, of class CommandFactory.
     */
    @Test
    public void testAddMoveCommand() {
        System.out.println("addMoveCommand");
        int            x        = -12;
        int            y        = 12;
        CommandFactory instance = new CommandFactory();
        instance.addMoveCommand(x, y);
        assertEquals("(move -12 12)", instance.next());
    }

    /**
     * Test of addTurnCommand method, of class CommandFactory.
     */
    @Test
    public void testAddTurnCommand() {
        System.out.println("addTurnCommand");
        int            angle    = -4;
        CommandFactory instance = new CommandFactory();
        instance.addTurnCommand(angle);
        assertEquals("(turn -4)", instance.next());
    }

    /**
     * Test of addTurnNeckCommand method, of class CommandFactory.
     */
    @Test
    public void testAddTurnNeckCommand() {
        System.out.println("addTurnNeckCommand");
        int            angle    = 55;
        CommandFactory instance = new CommandFactory();
        instance.addTurnNeckCommand(angle);
        assertEquals("(turn_neck 55)", instance.next());
    }

    /**
     * Test of addSayCommand method, of class CommandFactory.
     */
    @Test
    public void testAddSayCommand() {
        System.out.println("addSayCommand");
        String         message  = "hello inferior soccer team";
        CommandFactory instance = new CommandFactory();
        instance.addSayCommand(message);
        assertEquals("(say hello inferior soccer team)", instance.next());
    }

    /**
     * Test of addChangePlayModeCommand method, of class CommandFactory.
     */
    @Test
    public void testAddChangePlayModeCommand() {
        System.out.println("addChangePlayModeCommand");
        PlayMode       playMode = PlayMode.FREE_KICK_L;
        CommandFactory instance = new CommandFactory();
        instance.addChangePlayModeCommand(playMode);
        assertEquals("(change_mode FREE_KICK_L)", instance.next());
    }

    /**
     * Test of addMovePlayerCommand method, of class CommandFactory.
     */
    @Test(expected = UnsupportedOperationException.class)
    public void testAddMovePlayerCommand() {
        System.out.println("addMovePlayerCommand");
        ActionsPlayer  p        = null;
        double         x        = 0.0;
        double         y        = 0.0;
        CommandFactory instance = new CommandFactory();
        instance.addMovePlayerCommand(p, x, y);
    }

    /**
     * Test of addMoveBallCommand method, of class CommandFactory.
     */
    @Test
    public void testAddMoveBallCommand() {
        System.out.println("addMoveBallCommand");
        double         x        = 25.7;
        double         y        = -9;
        CommandFactory instance = new CommandFactory();
        instance.addMoveBallCommand(x, y);
        assertEquals("(move ball 25.7 -9.0)", instance.next());
    }

    /**
     * Test of addCheckBallCommand method, of class CommandFactory.
     */
    @Test
    public void testAddCheckBallCommand() {
        System.out.println("addCheckBallCommand");
        CommandFactory instance = new CommandFactory();
        instance.addCheckBallCommand();
        assertEquals("(check_ball)", instance.next());
    }

    /**
     * Test of addStartCommand method, of class CommandFactory.
     */
    @Test
    public void testAddStartCommand() {
        System.out.println("addStartCommand");
        CommandFactory instance = new CommandFactory();
        instance.addStartCommand();
        assertEquals("(start)", instance.next());
    }

    /**
     * Test of addRecoverCommand method, of class CommandFactory.
     */
    @Test
    public void testAddRecoverCommand() {
        System.out.println("addRecoverCommand");
        CommandFactory instance = new CommandFactory();
        instance.addRecoverCommand();
        assertEquals("(recover)", instance.next());
    }

    /**
     * Test of addEarCommand method, of class CommandFactory.
     */
    @Test
    public void testAddEarCommand() {
        System.out.println("addEarCommand");
        boolean        earOn    = false;
        CommandFactory instance = new CommandFactory();
        instance.addEarCommand(earOn);
        assertEquals("(ear off)", instance.next());
        earOn = true;
        instance.addEarCommand(earOn);
        assertEquals("(ear on)", instance.next());
    }

    /**
     * Test of addChangePlayerTypeCommand method, of class CommandFactory.
     */
    @Test
    public void testAddChangePlayerTypeCommand_3args() {
        System.out.println("addChangePlayerTypeCommand");
        String         teamName   = "superteam";
        int            unum       = 8;
        int            playerType = 14;
        CommandFactory instance   = new CommandFactory();
        instance.addChangePlayerTypeCommand(teamName, unum, playerType);
        assertEquals("(change_player_type superteam 8 14)", instance.next());
    }

    /**
     * Test of addEyeCommand method, of class CommandFactory.
     */
    @Test
    public void testAddEyeCommand() {
        System.out.println("addEyeCommand");
        boolean        eyeOn    = false;
        CommandFactory instance = new CommandFactory();
        instance.addEyeCommand(eyeOn);
        assertEquals("(eye off)", instance.next());
        eyeOn = true;
        instance.addEyeCommand(eyeOn);
        assertEquals("(eye on)", instance.next());
    }

    /**
     * Test of addLookCommand method, of class CommandFactory.
     */
    @Test
    public void testAddLookCommand() {
        System.out.println("addLookCommand");
        CommandFactory instance = new CommandFactory();
        instance.addLookCommand();
        assertEquals("(look)", instance.next());
    }

    /**
     * Test of addTeamNamesCommand method, of class CommandFactory.
     */
    @Test
    public void testAddTeamNamesCommand() {
        System.out.println("addTeamNamesCommand");
        CommandFactory instance = new CommandFactory();
        instance.addTeamNamesCommand();
        assertEquals("(team_names)", instance.next());
    }

    /**
     * Test of addChangePlayerTypeCommand method, of class CommandFactory.
     */
    @Test(expected = UnsupportedOperationException.class)
    public void testAddChangePlayerTypeCommand_int_Object() {
        System.out.println("addChangePlayerTypeCommand");
        int            unum       = 0;
        Object         playerType = null;
        CommandFactory instance   = new CommandFactory();
        instance.addChangePlayerTypeCommand(unum, playerType);
    }

    /**
     * Test of addTeamGraphicCommand method, of class CommandFactory.
     */
    @Test
    public void testAddTeamGraphicCommand() {
        System.out.println("addTeamGraphicCommand");
        XPMImage       xpm      = new XPMImage();
        CommandFactory instance = new CommandFactory();
        instance.addTeamGraphicCommand(xpm);
    }

    /**
     * Test of addByeCommand method, of class CommandFactory.
     */
    @Test
    public void testAddByeCommand() {
        System.out.println("addByeCommand");
        CommandFactory instance = new CommandFactory();
        instance.addByeCommand();
        assertEquals("(bye)", instance.next());
    }

    /**
     * Test of next method, of class CommandFactory.
     */
    @Test(expected = RuntimeException.class)
    public void testNext() {
        CommandFactory f = new CommandFactory();
        f.addPlayerInitCommand("superteam", true, "13");
        f.addPlayerInitCommand("superteam", false, "13");
        f.addPlayerInitCommand("superteam", true, "13");
        f.addPlayerInitCommand("superteam", true, "13");
        assertEquals("(init superteam (version 13) (goalie))", f.next());
        assertEquals("(init superteam (version 13))", f.next());
        assertEquals("(init superteam (version 13) (goalie))", f.next());
        assertEquals("(init superteam (version 13) (goalie))", f.next());
        f.next();
    }

    /**
     * Test of hasNext method, of class CommandFactory.
     */
    @Test
    public void testHasNext() {
        System.out.println("hasNext");
        CommandFactory f = new CommandFactory();
        f.addPlayerInitCommand("superteam", true, "13");
        assertTrue("no command", f.hasNext());
        f.next();
        assertTrue("a command", !f.hasNext());
        f.addPlayerInitCommand("superteam", false, "13");
        assertTrue("no command", f.hasNext());
        f.next();
        assertTrue("a command", !f.hasNext());
    }
}
