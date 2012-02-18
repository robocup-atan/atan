package com.github.robocup_atan.sample;

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
    com.github.robocup_atan.sample.SimpleTest.class, com.github.robocup_atan.sample.CoachTest.class, com.github.robocup_atan.sample.Simple2RunTest.class, com.github.robocup_atan.sample.SillyTest.class,
    com.github.robocup_atan.sample.Simple1RunTest.class, com.github.robocup_atan.sample.SimplySillyTeamTest.class
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
