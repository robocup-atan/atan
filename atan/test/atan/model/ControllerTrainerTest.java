package atan.model;

//~--- non-JDK imports --------------------------------------------------------

import atan.model.enums.Errors;
import atan.model.enums.Ok;
import atan.model.enums.PlayMode;
import atan.model.enums.RefereeMessage;
import atan.model.enums.Warning;

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
public class ControllerTrainerTest {

    /**
     *
     */
    public ControllerTrainerTest() {}

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
     * Test of infoHearPlayer method, of class ControllerTrainer.
     */
    @Test
    public void testInfoHearPlayer() {
        System.out.println("infoHearPlayer");
        double            direction = 0.0;
        String            message   = "Test";
        ControllerTrainer instance  = new ControllerTrainerImpl();
        instance.infoHearPlayer(direction, message);
    }

    /**
     * Test of infoHearPlayMode method, of class ControllerTrainer.
     */
    @Test
    public void testInfoHearPlayMode() {
        System.out.println("infoHearPlayMode");
        PlayMode          playMode = PlayMode.BEFORE_KICK_OFF;
        ControllerTrainer instance = new ControllerTrainerImpl();
        instance.infoHearPlayMode(playMode);
    }

    /**
     * Test of infoHearReferee method, of class ControllerTrainer.
     */
    @Test
    public void testInfoHearReferee() {
        System.out.println("infoHearReferee");
        RefereeMessage    refereeMessage = RefereeMessage.DROP_BALL;
        ControllerTrainer instance       = new ControllerTrainerImpl();
        instance.infoHearReferee(refereeMessage);

    }

    /**
     * Test of infoHearError method, of class ControllerTrainer.
     */
    @Test
    public void testInfoHearError() {
        System.out.println("infoHearError");
        Errors            error    = Errors.ILLEGAL_COMMAND_FORM;
        ControllerTrainer instance = new ControllerTrainerImpl();
        instance.infoHearError(error);
    }

    /**
     * Test of infoHearOk method, of class ControllerTrainer.
     */
    @Test
    public void testInfoHearOk() {
        System.out.println("infoHearOk");
        Ok                ok       = Ok.CHANGE_MODE;
        ControllerTrainer instance = new ControllerTrainerImpl();
        instance.infoHearOk(ok);
    }

    /**
     * Test of infoHearWarning method, of class ControllerTrainer.
     */
    @Test
    public void testInfoHearWarning() {
        System.out.println("infoHearWarning");
        Warning           warning  = Warning.CANNOT_CHANGE_GOALIE;
        ControllerTrainer instance = new ControllerTrainerImpl();
        instance.infoHearWarning(warning);
    }

    /**
     *
     * @author Atan
     */
    public static class ControllerTrainerImpl implements ControllerTrainer {

        /**
         *
         * @param direction
         * @param message
         */
        @Override
        public void infoHearPlayer(double direction, String message) {}

        /**
         *
         * @param playMode
         */
        @Override
        public void infoHearPlayMode(PlayMode playMode) {}

        /**
         *
         * @param refereeMessage
         */
        @Override
        public void infoHearReferee(RefereeMessage refereeMessage) {}

        /**
         *
         * @param error
         */
        @Override
        public void infoHearError(Errors error) {}

        /**
         *
         * @param ok
         */
        @Override
        public void infoHearOk(Ok ok) {}

        /**
         *
         * @param warning
         */
        @Override
        public void infoHearWarning(Warning warning) {}
    }
}
