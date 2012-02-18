package com.github.robocup_atan.atan.parser.objects;

//~--- non-JDK imports --------------------------------------------------------

import com.github.robocup_atan.atan.parser.objects.ObjNameFlagRight;
import com.github.robocup_atan.atan.model.ControllerCoach;
import com.github.robocup_atan.atan.model.ControllerCoachTest.ControllerCoachImpl;
import com.github.robocup_atan.atan.model.ControllerPlayer;
import com.github.robocup_atan.atan.model.ControllerPlayerTest.ControllerPlayerImpl;
import com.github.robocup_atan.atan.model.ControllerTrainer;
import com.github.robocup_atan.atan.model.ControllerTrainerTest.ControllerTrainerImpl;
import com.github.robocup_atan.atan.parser.objects.ObjNameFlagRight;

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
public class ObjNameFlagRightTest {

    /**
     *
     */
    public ObjNameFlagRightTest() {}

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
     * Test of infoSeeFromEast method, of class ObjNameFlagRight.
     */
    @Test
    public void testInfoSeeFromEast_7args_1() {
        System.out.println("infoSeeFromEast");
        ControllerPlayer c                   = new ControllerPlayerImpl();
        double           distance            = 0.0;
        double           direction           = 0.0;
        double           distChange          = 0.0;
        double           dirChange           = 0.0;
        double           bodyFacingDirection = 0.0;
        double           headFacingDirection = 0.0;
        ObjNameFlagRight instance            = new ObjNameFlagRight('l', 10);
        instance.infoSeeFromEast(c, distance, direction, distChange, dirChange, bodyFacingDirection,
                                 headFacingDirection);
    }

    /**
     * Test of infoSeeFromWest method, of class ObjNameFlagRight.
     */
    @Test
    public void testInfoSeeFromWest_7args_1() {
        System.out.println("infoSeeFromWest");
        ControllerPlayer c                   = new ControllerPlayerImpl();
        double           distance            = 0.0;
        double           direction           = 0.0;
        double           distChange          = 0.0;
        double           dirChange           = 0.0;
        double           bodyFacingDirection = 0.0;
        double           headFacingDirection = 0.0;
        ObjNameFlagRight instance            = new ObjNameFlagRight('l', 10);
        instance.infoSeeFromWest(c, distance, direction, distChange, dirChange, bodyFacingDirection,
                                 headFacingDirection);
    }

    /**
     * Test of infoSeeFromEast method, of class ObjNameFlagRight.
     */
    @Test(expected = UnsupportedOperationException.class)
    public void testInfoSeeFromEast_7args_2() {
        System.out.println("infoSeeFromEast");
        ControllerCoach  c         = new ControllerCoachImpl();
        double           x         = 0.0;
        double           y         = 0.0;
        double           deltaX    = 0.0;
        double           deltaY    = 0.0;
        double           bodyAngle = 0.0;
        double           neckAngle = 0.0;
        ObjNameFlagRight instance  = new ObjNameFlagRight('l', 10);
        instance.infoSeeFromEast(c, x, y, deltaX, deltaY, bodyAngle, neckAngle);
    }

    /**
     * Test of infoSeeFromWest method, of class ObjNameFlagRight.
     */
    @Test(expected = UnsupportedOperationException.class)
    public void testInfoSeeFromWest_7args_2() {
        System.out.println("infoSeeFromWest");
        ControllerCoach  c         = new ControllerCoachImpl();
        double           x         = 0.0;
        double           y         = 0.0;
        double           deltaX    = 0.0;
        double           deltaY    = 0.0;
        double           bodyAngle = 0.0;
        double           neckAngle = 0.0;
        ObjNameFlagRight instance  = new ObjNameFlagRight('l', 10);
        instance.infoSeeFromWest(c, x, y, deltaX, deltaY, bodyAngle, neckAngle);
    }

    /**
     * Test of infoSee method, of class ObjNameFlagRight.
     */
    @Test(expected = UnsupportedOperationException.class)
    public void testInfoSee() {
        System.out.println("infoSee");
        ControllerTrainer c        = new ControllerTrainerImpl();
        ObjNameFlagRight  instance = new ObjNameFlagRight('l', 10);
        instance.infoSee(c);
    }
}