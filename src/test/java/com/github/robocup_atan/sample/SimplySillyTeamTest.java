package com.github.robocup_atan.sample;

//~--- non-JDK imports --------------------------------------------------------

import com.github.robocup_atan.sample.Simple;
import com.github.robocup_atan.sample.Coach;
import com.github.robocup_atan.sample.SimplySillyTeam;
import com.github.robocup_atan.sample.Silly;
import com.github.robocup_atan.atan.model.ControllerCoach;
import com.github.robocup_atan.atan.model.ControllerPlayer;

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
public class SimplySillyTeamTest {
    private SimplySillyTeam sst;

    /**
     *
     */
    public SimplySillyTeamTest() {}

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
    public void setUp() {
        sst = new SimplySillyTeam("test", 6000, "localhost", true);
    }

    /**
     *
     */
    @After
    public void tearDown() {}

    /**
     * Test of getNewControllerPlayer method, of class SimplySillyTeam.
     */
    @Test
    public void testGetNewControllerPlayer() {
        System.out.println("getNewControllerPlayer");
        int              number = 0;
        ControllerPlayer result = sst.getNewControllerPlayer(number);
        assertTrue(Silly.class.isInstance(result));
        for (number = 1; number == 11; number++) {
            result = sst.getNewControllerPlayer(number);
            assertTrue(Simple.class.isInstance(result));
        }
    }

    /**
     * Test of getNewControllerCoach method, of class SimplySillyTeam.
     */
    @Test
    public void testGetNewControllerCoach() {
        System.out.println("getNewControllerCoach");
        ControllerCoach result = sst.getNewControllerCoach();
        assertTrue(Coach.class.isInstance(result));
    }
}
