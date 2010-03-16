//~RoboCup Project - Nick James (nsj3), Daniel Wood (dw224), Stuart Wood (sw262)

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
    }

    /**
     * Test of look method, of class ActionsCoach.
     */
    @Test
    public void testLook() {
        System.out.println("look");
        ActionsCoach instance = new ActionsCoachImpl();
        instance.look();
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
    }

    /**
     * Test of changePlayerType method, of class ActionsCoach.
     */
    @Test
    public void testChangePlayerType() {
        System.out.println("changePlayerType");
        int          unum       = 10;
        int          playerType = 10;
        ActionsCoach instance   = new ActionsCoachImpl();
        instance.changePlayerType(unum, playerType);
    }

    /**
     * Test of teamGraphic method, of class ActionsCoach.
     */
    @Test
    public void testTeamGraphic() {
        System.out.println("teamGraphic");
        XPMImage     xpm      = new XPMImage();
        ActionsCoach instance = new ActionsCoachImpl();
        instance.teamGraphic(xpm);
    }

    /**
     * Test of getTeamNames method, of class ActionsCoach.
     */
    @Test
    public void testGetTeamNames() {
        System.out.println("getTeamNames");
        ActionsCoach instance = new ActionsCoachImpl();
        instance.getTeamNames();
    }

    /**
     * Test of bye method, of class ActionsCoach.
     */
    @Test
    public void testBye() {
        System.out.println("bye");
        ActionsCoach instance = new ActionsCoachImpl();
        instance.bye();
    }

    /**
     * Test of handleError method, of class ActionsCoach.
     */
    @Test
    public void testHandleError() {
        System.out.println("handleError");
        String       error    = "Error";
        ActionsCoach instance = new ActionsCoachImpl();
        instance.handleError(error);
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
    }

    /**
     *
     * @author author
     */
    public static class ActionsCoachImpl implements ActionsCoach {

        /**
         *
         * @param eyeOn
         */
        @Override
        public void eye(boolean eyeOn) {}

        /**
         *
         */
        @Override
        public void look() {}

        /**
         *
         * @param message
         */
        @Override
        public void say(String message) {}

        /**
         *
         * @param unum
         * @param playerType
         */
        @Override
        public void changePlayerType(int unum, int playerType) {}

        /**
         *
         * @param xpm
         */
        @Override
        public void teamGraphic(XPMImage xpm) {}

        /**
         *
         */
        @Override
        public void getTeamNames() {}

        /**
         *
         */
        @Override
        public void bye() {}

        /**
         *
         * @param error
         */
        @Override
        public void handleError(String error) {}

        /**
         *
         * @return
         */
        @Override
        public boolean isTeamEast() {
            return false;
        }

        /**
         *
         * @param is
         */
        @Override
        public void setTeamEast(boolean is) {}

        /**
         *
         * @return
         */
        @Override
        public String getTeamName() {
            return "";
        }
    }
}
