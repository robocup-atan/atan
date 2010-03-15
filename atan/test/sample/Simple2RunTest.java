package sample;

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
public class Simple2RunTest {

    /**
     *
     */
    public Simple2RunTest() {}

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
     * Test of main method, of class Simple2Run.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        Simple2Run.main(args);

        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
}
