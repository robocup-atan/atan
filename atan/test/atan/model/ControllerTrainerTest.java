/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package atan.model;

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
 * @author Nick
 */
public class ControllerTrainerTest {

    public ControllerTrainerTest() {
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
     * Test of infoHearPlayer method, of class ControllerTrainer.
     */
    @Test
    public void testInfoHearPlayer() {
        System.out.println("infoHearPlayer");
        double direction = 0.0;
        String message = "";
        ControllerTrainer instance = new ControllerTrainerImpl();
        instance.infoHearPlayer(direction, message);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of infoHearPlayMode method, of class ControllerTrainer.
     */
    @Test
    public void testInfoHearPlayMode() {
        System.out.println("infoHearPlayMode");
        PlayMode playMode = null;
        ControllerTrainer instance = new ControllerTrainerImpl();
        instance.infoHearPlayMode(playMode);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of infoHearReferee method, of class ControllerTrainer.
     */
    @Test
    public void testInfoHearReferee() {
        System.out.println("infoHearReferee");
        RefereeMessage refereeMessage = null;
        ControllerTrainer instance = new ControllerTrainerImpl();
        instance.infoHearReferee(refereeMessage);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of infoHearError method, of class ControllerTrainer.
     */
    @Test
    public void testInfoHearError() {
        System.out.println("infoHearError");
        Errors error = null;
        ControllerTrainer instance = new ControllerTrainerImpl();
        instance.infoHearError(error);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of infoHearOk method, of class ControllerTrainer.
     */
    @Test
    public void testInfoHearOk() {
        System.out.println("infoHearOk");
        Ok ok = null;
        ControllerTrainer instance = new ControllerTrainerImpl();
        instance.infoHearOk(ok);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of infoHearWarning method, of class ControllerTrainer.
     */
    @Test
    public void testInfoHearWarning() {
        System.out.println("infoHearWarning");
        Warning warning = null;
        ControllerTrainer instance = new ControllerTrainerImpl();
        instance.infoHearWarning(warning);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    public class ControllerTrainerImpl implements ControllerTrainer {

        public void infoHearPlayer(double direction, String message) {
        }

        public void infoHearPlayMode(PlayMode playMode) {
        }

        public void infoHearReferee(RefereeMessage refereeMessage) {
        }

        public void infoHearError(Errors error) {
        }

        public void infoHearOk(Ok ok) {
        }

        public void infoHearWarning(Warning warning) {
        }
    }

}