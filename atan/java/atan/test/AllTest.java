package atan.test;

import junit.framework.TestCase;
import junit.framework.TestSuite;
import junit.textui.TestRunner;

public class AllTest extends TestCase {

	public AllTest(String name) {
		super(name);
	}

	static TestSuite suite() {
		TestSuite s = new TestSuite();
		s.addTest(CommandFactoryTest.suite());
		s.addTest(ParserTest.suite());
		s.addTest(GeneratedTests.suite());
		return s;
	}

	public static void main(String[] arg) {
		TestRunner.run(suite());
	}

	public void test() {
		// to be
	}
	
}
