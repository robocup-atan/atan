package atan.model.enums;

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
    atan.model.enums.RefereeMessageTest.class, atan.model.enums.FlagTest.class, atan.model.enums.PlayModeTest.class,
    atan.model.enums.LineTest.class, atan.model.enums.WarningTest.class, atan.model.enums.ErrorsTest.class,
    atan.model.enums.ViewQualityTest.class, atan.model.enums.ViewAngleTest.class, atan.model.enums.OkTest.class,
    atan.model.enums.ServerParamsTest.class
})
public class EnumsSuite {

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
