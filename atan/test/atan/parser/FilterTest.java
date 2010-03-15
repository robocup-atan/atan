/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package atan.parser;

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
public class FilterTest {

    public FilterTest() {
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
     * Test of run method, of class Filter.
     */
    @Test
    public void testRun() {
        System.out.println("run");
        String cmd = "";
        CommandFilter f = null;
        Filter instance = new Filter();
        instance.run(cmd, f);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

}