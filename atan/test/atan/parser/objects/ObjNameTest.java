package atan.parser.objects;

//~--- non-JDK imports --------------------------------------------------------

import atan.model.ControllerCoach;
import atan.model.ControllerPlayer;
import atan.model.ControllerTrainer;

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
public class ObjNameTest {

    /**
     *
     */
    public ObjNameTest() {}

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
     * Test of infoSeeFromEast method, of class ObjName.
     */
    @Test
    public void testInfoSeeFromEast_7args_1() {
        System.out.println("infoSeeFromEast");
        ControllerPlayer c                   = null;
        double           distance            = 0.0;
        double           direction           = 0.0;
        double           distChange          = 0.0;
        double           dirChange           = 0.0;
        double           bodyFacingDirection = 0.0;
        double           headFacingDirection = 0.0;
        ObjName          instance            = new ObjNameImpl();
        instance.infoSeeFromEast(c, distance, direction, distChange, dirChange, bodyFacingDirection,
                                 headFacingDirection);

        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of infoSeeFromWest method, of class ObjName.
     */
    @Test
    public void testInfoSeeFromWest_7args_1() {
        System.out.println("infoSeeFromWest");
        ControllerPlayer c                   = null;
        double           distance            = 0.0;
        double           direction           = 0.0;
        double           distChange          = 0.0;
        double           dirChange           = 0.0;
        double           bodyFacingDirection = 0.0;
        double           headFacingDirection = 0.0;
        ObjName          instance            = new ObjNameImpl();
        instance.infoSeeFromWest(c, distance, direction, distChange, dirChange, bodyFacingDirection,
                                 headFacingDirection);

        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of infoSeeFromEast method, of class ObjName.
     */
    @Test
    public void testInfoSeeFromEast_7args_2() {
        System.out.println("infoSeeFromEast");
        ControllerCoach c         = null;
        double          x         = 0.0;
        double          y         = 0.0;
        double          deltaX    = 0.0;
        double          deltaY    = 0.0;
        double          bodyAngle = 0.0;
        double          neckAngle = 0.0;
        ObjName         instance  = new ObjNameImpl();
        instance.infoSeeFromEast(c, x, y, deltaX, deltaY, bodyAngle, neckAngle);

        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of infoSeeFromWest method, of class ObjName.
     */
    @Test
    public void testInfoSeeFromWest_7args_2() {
        System.out.println("infoSeeFromWest");
        ControllerCoach c         = null;
        double          x         = 0.0;
        double          y         = 0.0;
        double          deltaX    = 0.0;
        double          deltaY    = 0.0;
        double          bodyAngle = 0.0;
        double          neckAngle = 0.0;
        ObjName         instance  = new ObjNameImpl();
        instance.infoSeeFromWest(c, x, y, deltaX, deltaY, bodyAngle, neckAngle);

        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of infoSee method, of class ObjName.
     */
    @Test
    public void testInfoSee() {
        System.out.println("infoSee");
        ControllerTrainer c        = null;
        ObjName           instance = new ObjNameImpl();
        instance.infoSee(c);

        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     *
     * @author author
     */
    public class ObjNameImpl implements ObjName {

        /**
         *
         * @param c
         * @param distance
         * @param direction
         * @param distChange
         * @param dirChange
         * @param bodyFacingDirection
         * @param headFacingDirection
         */
        public void infoSeeFromEast(ControllerPlayer c, double distance, double direction, double distChange,
                                    double dirChange, double bodyFacingDirection, double headFacingDirection) {}

        /**
         *
         * @param c
         * @param distance
         * @param direction
         * @param distChange
         * @param dirChange
         * @param bodyFacingDirection
         * @param headFacingDirection
         */
        public void infoSeeFromWest(ControllerPlayer c, double distance, double direction, double distChange,
                                    double dirChange, double bodyFacingDirection, double headFacingDirection) {}

        /**
         *
         * @param c
         * @param x
         * @param y
         * @param deltaX
         * @param deltaY
         * @param bodyAngle
         * @param neckAngle
         */
        public void infoSeeFromEast(ControllerCoach c, double x, double y, double deltaX, double deltaY,
                                    double bodyAngle, double neckAngle) {}

        /**
         *
         * @param c
         * @param x
         * @param y
         * @param deltaX
         * @param deltaY
         * @param bodyAngle
         * @param neckAngle
         */
        public void infoSeeFromWest(ControllerCoach c, double x, double y, double deltaX, double deltaY,
                                    double bodyAngle, double neckAngle) {}

        /**
         *
         * @param c
         */
        public void infoSee(ControllerTrainer c) {}
    }
}