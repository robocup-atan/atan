package atan.test;

import junit.framework.*;
import atan.parser.*;
import atan.model.*;
import java.io.*;
import java.util.*;

public class AllTest extends TestCase {

  public AllTest(String name) {
    super(name);
  }
  static TestSuite suite () {
    TestSuite s = new TestSuite();
    s.addTest(CommandFactoryTest.suite());
    s.addTest(ParserTest.suite());
    s.addTest(GeneratedTests.suite());
    return s;
  }
  public static void main (String[] arg) {
    junit.textui.TestRunner r = new junit.textui.TestRunner();
    r.run(suite());
  }
}
