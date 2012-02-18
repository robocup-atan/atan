package sample;

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
    sample.SimpleTest.class, sample.CoachTest.class, sample.Simple2RunTest.class, sample.SillyTest.class,
    sample.Simple1RunTest.class, sample.SimplySillyTeamTest.class
})
public class SampleSuite {

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
