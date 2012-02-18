package com.github.robocup_atan.atan.parser;

//~--- non-JDK imports --------------------------------------------------------

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 * <p>ParserSuite class.</p>
 *
 * @author Atan
 * @since 1.0
 */
@RunWith(Suite.class)
@Suite.SuiteClasses({com.github.robocup_atan.atan.parser.CommandFilterTest.class, com.github.robocup_atan.atan.parser.objects.ObjectsSuite.class,
                     com.github.robocup_atan.atan.parser.FilterTest.class})
public class ParserSuite {

    /**
     * <p>setUpClass.</p>
     *
     * @throws java.lang.Exception if any.
     */
    @BeforeClass
    public static void setUpClass() throws Exception {}

    /**
     * <p>tearDownClass.</p>
     *
     * @throws java.lang.Exception if any.
     */
    @AfterClass
    public static void tearDownClass() throws Exception {}

    /**
     * <p>setUp.</p>
     *
     * @throws java.lang.Exception if any.
     */
    @Before
    public void setUp() throws Exception {}

    /**
     * <p>tearDown.</p>
     *
     * @throws java.lang.Exception if any.
     */
    @After
    public void tearDown() throws Exception {}
}
