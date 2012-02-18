package atan.parser.objects;

//~--- non-JDK imports --------------------------------------------------------

import atan.model.ControllerCoach;
import atan.model.ControllerCoachTest.ControllerCoachImpl;
import atan.model.ControllerPlayer;
import atan.model.ControllerPlayerTest.ControllerPlayerImpl;
import atan.model.ControllerTrainer;
import atan.model.ControllerTrainerTest.ControllerTrainerImpl;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 *
 * @author Atan
 */
public class ObjNameFlagGoalLeftTest {

    /**
     *
     */
    public ObjNameFlagGoalLeftTest() {}

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
     * Test of infoSeeFromEast method, of class ObjNameFlagGoalLeft.
     */
    @Test
    public void testInfoSeeFromEast_7args_1() {
        System.out.println("infoSeeFromEast");
        ControllerPlayer    c                   = new ControllerPlayerImpl();
        double              distance            = 0.0;
        double              direction           = 0.0;
        double              distChange          = 0.0;
        double              dirChange           = 0.0;
        double              bodyFacingDirection = 0.0;
        double              headFacingDirection = 0.0;
        ObjNameFlagGoalLeft instance            = new ObjNameFlagGoalLeft('t');
        instance.infoSeeFromEast(c, distance, direction, distChange, dirChange, bodyFacingDirection,
                                 headFacingDirection);
    }

    /**
     * Test of infoSeeFromWest method, of class ObjNameFlagGoalLeft.
     */
    @Test
    public void testInfoSeeFromWest_7args_1() {
        System.out.println("infoSeeFromWest");
        ControllerPlayer    c                   = new ControllerPlayerImpl();
        double              distance            = 0.0;
        double              direction           = 0.0;
        double              distChange          = 0.0;
        double              dirChange           = 0.0;
        double              bodyFacingDirection = 0.0;
        double              headFacingDirection = 0.0;
        ObjNameFlagGoalLeft instance            = new ObjNameFlagGoalLeft('t');
        instance.infoSeeFromWest(c, distance, direction, distChange, dirChange, bodyFacingDirection,
                                 headFacingDirection);
    }

    /**
     * Test of infoSeeFromEast method, of class ObjNameFlagGoalLeft.
     */
    @Test
    public void testInfoSeeFromEast_7args_2() {
        System.out.println("infoSeeFromEast");
        ControllerCoach     c         = new ControllerCoachImpl();
        double              x         = 0.0;
        double              y         = 0.0;
        double              deltaX    = 0.0;
        double              deltaY    = 0.0;
        double              bodyAngle = 0.0;
        double              neckAngle = 0.0;
        ObjNameFlagGoalLeft instance  = new ObjNameFlagGoalLeft('t');
        instance.infoSeeFromEast(c, x, y, deltaX, deltaY, bodyAngle, neckAngle);
    }

    /**
     * Test of infoSeeFromWest method, of class ObjNameFlagGoalLeft.
     */
    @Test
    public void testInfoSeeFromWest_7args_2() {
        System.out.println("infoSeeFromWest");
        ControllerCoach     c         = new ControllerCoachImpl();
        double              x         = 0.0;
        double              y         = 0.0;
        double              deltaX    = 0.0;
        double              deltaY    = 0.0;
        double              bodyAngle = 0.0;
        double              neckAngle = 0.0;
        ObjNameFlagGoalLeft instance  = new ObjNameFlagGoalLeft('t');
        instance.infoSeeFromWest(c, x, y, deltaX, deltaY, bodyAngle, neckAngle);
    }

    /**
     * Test of infoSee method, of class ObjNameFlagGoalLeft.
     */
    @Test
    public void testInfoSee() {
        System.out.println("infoSee");
        ControllerTrainer   c        = new ControllerTrainerImpl();
        ObjNameFlagGoalLeft instance = new ObjNameFlagGoalLeft('t');
        instance.infoSee(c);
    }
}
