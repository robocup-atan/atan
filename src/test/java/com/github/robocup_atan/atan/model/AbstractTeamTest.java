package com.github.robocup_atan.atan.model;

//~--- non-JDK imports --------------------------------------------------------

import com.github.robocup_atan.atan.model.AbstractTeam;
import com.github.robocup_atan.atan.model.ControllerCoach;
import com.github.robocup_atan.atan.model.ControllerPlayer;
import com.github.robocup_atan.atan.model.ControllerCoachTest.ControllerCoachImpl;
import com.github.robocup_atan.atan.model.ControllerPlayerTest.ControllerPlayerImpl;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.*;

//~--- JDK imports ------------------------------------------------------------

import java.util.Properties;

/**
 * <p>AbstractTeamTest class.</p>
 *
 * @author Atan
 * @since 1.0
 */
public class AbstractTeamTest {
    private ControllerCoachImpl  coachTest;
    private ControllerPlayerImpl playerTest;

    /**
     * <p>Constructor for AbstractTeamTest.</p>
     */
    public AbstractTeamTest() {}

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
    public void setUp() {
        playerTest = new ControllerPlayerImpl();
        coachTest  = new ControllerCoachImpl();
    }

    /**
     * <p>tearDown.</p>
     */
    @After
    public void tearDown() {}

    /**
     * Test of getTeamName method, of class AbstractTeam.
     */
    @Test
    public void testGetTeamName() {
        System.out.println("getTeamName");
        AbstractTeam instance  = new AbstractTeamImpl();
        String       expResult = "TestTeam";
        String       result    = instance.getTeamName();
        assertEquals(expResult, result);
    }

    /**
     * Test of getProperties method, of class AbstractTeam.
     */
    @Test
    public void testGetProperties() {
        System.out.println("getProperties");
        AbstractTeam instance  = new AbstractTeamImpl();
        Properties   expResult = new Properties();
        Properties   result    = instance.getProperties();
        assertEquals(expResult, result);
    }

    /**
     * Test of getNewControllerPlayer method, of class AbstractTeam.
     */
    @Test
    public void testGetNewControllerPlayer() {
        System.out.println("getNewControllerPlayer");
        int              i         = 0;
        AbstractTeam     instance  = new AbstractTeamImpl();
        ControllerPlayer expResult = playerTest;
        ControllerPlayer result    = instance.getNewControllerPlayer(i);
        assertEquals(expResult, result);
    }

    /**
     * Test of getNewControllerCoach method, of class AbstractTeam.
     */
    @Test
    public void testGetNewControllerCoach() {
        System.out.println("getNewControllerCoach");
        AbstractTeam    instance  = new AbstractTeamImpl();
        ControllerCoach expResult = coachTest;
        ControllerCoach result    = instance.getNewControllerCoach();
        assertEquals(expResult, result);
    }

    /**
     * Test of createNewPlayers method, of class AbstractTeam.
     */
    @Test
    public void testCreateNewPlayers() {
        System.out.println("createNewPlayers");
        AbstractTeam instance = new AbstractTeamImpl();
        instance.createNewPlayers();
    }

    /**
     * Test of createNewCoach method, of class AbstractTeam.
     */
    @Test
    public void testCreateNewCoach() {
        System.out.println("createNewCoach");
        AbstractTeam instance = new AbstractTeamImpl();
        instance.createNewCoach();
    }

    /**
     * Test of killAll method, of class AbstractTeam.
     */
    @Test
    public void testKillAll() {
        System.out.println("killAll");
        AbstractTeam instance = new AbstractTeamImpl();
        instance.killAll();
    }

    /**
     * Test of connectAll method, of class AbstractTeam.
     */
    @Test
    public void testConnectAll() {
        System.out.println("connectAll");
        AbstractTeam instance = new AbstractTeamImpl();
        instance.connectAll();
    }

    /**
     * Test of connect method, of class AbstractTeam.
     */
    @Test
    public void testConnect() {
        System.out.println("connect");
        int          index    = 0;
        AbstractTeam instance = new AbstractTeamImpl();
        instance.connect(index);
    }

    /**
     * Test of size method, of class AbstractTeam.
     */
    @Test
    public void testSize() {
        System.out.println("size");
        AbstractTeam instance  = new AbstractTeamImpl();
        int          expResult = 11;
        int          result    = instance.size();
        assertEquals(expResult, result);
    }

    /**
     *
     * @author Atan
     */
    public class AbstractTeamImpl extends AbstractTeam {

        /**
         *
         */
        public AbstractTeamImpl() {
            super("TestTeam", 6000, "localhost", true, new Properties());
        }

        /**
         *
         * @param i
         * @return
         */
        @Override
        public ControllerPlayer getNewControllerPlayer(int i) {
            return playerTest;
        }

        /**
         *
         * @return
         */
        @Override
        public ControllerCoach getNewControllerCoach() {
            return coachTest;
        }
    }
}
