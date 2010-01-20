package atan.test;

//~--- non-JDK imports --------------------------------------------------------

import junit.framework.TestCase;
import junit.framework.TestSuite;

import junit.textui.TestRunner;

/**
 *
 * @author Atan
 */
public class AllTest extends TestCase {

    /**
     *
     * @param name
     */
    public AllTest(String name) {
        super(name);
    }

    /**
     *
     * @return
     */
    static TestSuite suite() {
        TestSuite s = new TestSuite();
        s.addTest(CommandFactoryTest.suite());
        s.addTest(ParserTest.suite());
        s.addTest(GeneratedTests.suite());
        return s;
    }

    /**
     *
     * @param arg
     */
    public static void main(String[] arg) {
        TestRunner.run(suite());
    }

    /**
     *
     */
    public void test() {

        // to be
    }
}
