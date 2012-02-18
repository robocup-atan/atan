package com.github.robocup_atan.sample;

//~--- non-JDK imports --------------------------------------------------------

import com.github.robocup_atan.sample.Simple1Run;
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
public class Simple1RunTest {

    /**
     *
     */
    public Simple1RunTest() {}

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
     * Test of main method, of class Simple1Run.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = {};
        Simple1Run.main(args);
    }
}
