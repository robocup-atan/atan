package atan.model;

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
public class ActionsCoachTest {

    /**
     *
     */
    public ActionsCoachTest() {}

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
     * Test of eye method, of class ActionsCoach.
     */
    @Test
    public void testEye() {
        System.out.println("eye");
        boolean      eyeOn    = false;
        ActionsCoach instance = new ActionsCoachImpl();
        instance.eye(eyeOn);

        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of look method, of class ActionsCoach.
     */
    @Test
    public void testLook() {
        System.out.println("look");
        ActionsCoach instance = new ActionsCoachImpl();
        instance.look();

        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of say method, of class ActionsCoach.
     */
    @Test
    public void testSay() {
        System.out.println("say");
        String       message  = "";
        ActionsCoach instance = new ActionsCoachImpl();
        instance.say(message);

        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of changePlayerType method, of class ActionsCoach.
     */
    @Test
    public void testChangePlayerType() {
        System.out.println("changePlayerType");
        int          unum       = 0;
        int          playerType = 0;
        ActionsCoach instance   = new ActionsCoachImpl();
        instance.changePlayerType(unum, playerType);

        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of teamGraphic method, of class ActionsCoach.
     */
    @Test
    public void testTeamGraphic() {
        System.out.println("teamGraphic");
        XPMImage     xpm      = null;
        ActionsCoach instance = new ActionsCoachImpl();
        instance.teamGraphic(xpm);

        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTeamNames method, of class ActionsCoach.
     */
    @Test
    public void testGetTeamNames() {
        System.out.println("getTeamNames");
        ActionsCoach instance = new ActionsCoachImpl();
        instance.getTeamNames();

        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of bye method, of class ActionsCoach.
     */
    @Test
    public void testBye() {
        System.out.println("bye");
        ActionsCoach instance = new ActionsCoachImpl();
        instance.bye();

        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of handleError method, of class ActionsCoach.
     */
    @Test
    public void testHandleError() {
        System.out.println("handleError");
        String       error    = "";
        ActionsCoach instance = new ActionsCoachImpl();
        instance.handleError(error);

        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isTeamEast method, of class ActionsCoach.
     */
    @Test
    public void testIsTeamEast() {
        System.out.println("isTeamEast");
        ActionsCoach instance  = new ActionsCoachImpl();
        boolean      expResult = false;
        boolean      result    = instance.isTeamEast();
        assertEquals(expResult, result);

        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setTeamEast method, of class ActionsCoach.
     */
    @Test
    public void testSetTeamEast() {
        System.out.println("setTeamEast");
        boolean      is       = false;
        ActionsCoach instance = new ActionsCoachImpl();
        instance.setTeamEast(is);

        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTeamName method, of class ActionsCoach.
     */
    @Test
    public void testGetTeamName() {
        System.out.println("getTeamName");
        ActionsCoach instance  = new ActionsCoachImpl();
        String       expResult = "";
        String       result    = instance.getTeamName();
        assertEquals(expResult, result);

        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     *
     * @author author
     */
    public class ActionsCoachImpl implements ActionsCoach {

        /**
         *
         * @param eyeOn
         */
        public void eye(boolean eyeOn) {}

        /**
         *
         */
        public void look() {}

        /**
         *
         * @param message
         */
        public void say(String message) {}

        /**
         *
         * @param unum
         * @param playerType
         */
        public void changePlayerType(int unum, int playerType) {}

        /**
         *
         * @param xpm
         */
        public void teamGraphic(XPMImage xpm) {}

        /**
         *
         */
        public void getTeamNames() {}

        /**
         *
         */
        public void bye() {}

        /**
         *
         * @param error
         */
        public void handleError(String error) {}

        /**
         *
         * @return
         */
        public boolean isTeamEast() {
            return false;
        }

        /**
         *
         * @param is
         */
        public void setTeamEast(boolean is) {}

        /**
         *
         * @return
         */
        public String getTeamName() {
            return "";
        }
    }
}
