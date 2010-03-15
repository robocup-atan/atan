package atan.model;

//~--- non-JDK imports --------------------------------------------------------

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 *
 * @author Atan
 */
@RunWith(Suite.class)
@Suite.SuiteClasses( {
    atan.model.ControllerTrainerTest.class, atan.model.AbstractTeamTest.class, atan.model.ControllerCoachTest.class,
    atan.model.enums.EnumsSuite.class, atan.model.ByteBufferTest.class, atan.model.AbstractUDPClientTest.class,
    atan.model.XPMImageTest.class, atan.model.ActionsCoachTest.class, atan.model.ActionsPlayerTest.class,
    atan.model.ControllerPlayerTest.class, atan.model.SServerPlayerTest.class, atan.model.SServerCoachTest.class,
    atan.model.CommandFactoryTest.class, atan.model.ActionsTrainerTest.class, atan.model.SServerTrainerTest.class
})
public class ModelSuite {

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
     * @throws Exception
     */
    @Before
    public void setUp() throws Exception {}

    /**
     *
     * @throws Exception
     */
    @After
    public void tearDown() throws Exception {}
}
