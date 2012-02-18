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
    com.github.robocup_atan.atan.model.ModelSuite.class, com.github.robocup_atan.atan.model.enums.EnumsSuite.class, com.github.robocup_atan.atan.parser.ParserSuite.class,
    com.github.robocup_atan.atan.parser.objects.ObjectsSuite.class
})
public class FullTestSuite {

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
