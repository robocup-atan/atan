//~--- non-JDK imports --------------------------------------------------------

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 * A test suite to run all tests.
 * @author Atan
 */
@RunWith(Suite.class)
@Suite.SuiteClasses( {
    atan.model.ModelSuite.class, atan.model.enums.EnumsSuite.class, atan.parser.ParserSuite.class,
    atan.parser.objects.ObjectsSuite.class, sample.SampleSuite.class
})
public class AllTests {

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
