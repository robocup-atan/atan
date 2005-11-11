package atan.test;

import java.io.StringReader;
import java.util.Set;

import junit.framework.TestCase;
import junit.framework.TestSuite;
import atan.parser.CmdParser;
import atan.parser.CommandFilter;
import atan.parser.Filter;
import atan.parser.ParseException;

public class PatternGeneratedTests extends TestCase {

  private static CmdParser cmdp = null;

  public PatternGeneratedTests(String name) {
    super(name);
  }
  public void test00() {
    String s = "(see 0 ((goal r) 82.3 0) ((flag r t) 89.1 -22) ((flag r b) 89.1 22) ((flag p r t) 68.7 -16) ((flag p r c) 66 0) ((flag p r b) 68.7 16) ((ball) 30 0 0 0) ((player A 2) 1.2 0 0 0) ((player A 3) 1.2 0 0 0) ((player A 4) 1.2 0 0 0) ((player A 5) 1.2 0 0 0) ((player A 6) 0.6 0 0 0) ((player A 7) 2.5 0 0 0) ((player A 8) 1.2 0 0 0) ((player A 9) 1.8 0 0 0) ((player A 10) 0.6 0 0 0) ((player A 11) 0.6 0 0 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 66.7 0) ((player) 66.7 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 60.3 0) ((player) 66.7 0) ((player) 66.7 0) ((line r) 82.3 -89))";
    TestCommandFilter f = new TestCommandFilter();
    try {
      basicParseCmd(s);
    } catch (ParseException ex) {
      System.out.println("<<"+s+">>");
      System.out.println(ex.getMessage());
      System.out.println("-------------------------------------");
    }
  }
  private Set basicParseCmd(String s) throws ParseException {
    TestCommandFilter f = new TestCommandFilter();
    filterCommand(s, f);
    TestController c = new TestController();
    DummyPlayer player = new DummyPlayer();
    player.setTeamEast(true);
    player.setTeamName("teamEast");
    if (f.isTypeSee()) getCmdParser().parseSeeCommand(f.getCommand(), c, player);
    else if (f.isTypeError()) getCmdParser().parseErrorCommand(f.getCommand(), player);
    else if (f.isTypeHear()) getCmdParser().parseHearCommand(f.getCommand(), c, player);
    else if (f.isTypeInit()) getCmdParser().parseInitCommand(f.getCommand(), c, player);
    else if (f.isTypeSenseBody()) getCmdParser().parseSenseBodyCommand(f.getCommand(), c, player);
    else if (f.isTypeUndefined()) fail("CommandFilter could not identify type of: "+s);
    else fail("CommandFilter fails in: "+s);
    return c.getResult();
  }
  private void filterCommand(String cmd, CommandFilter f) throws ParseException {
      getFilter().run(cmd, f);
  }
  private Filter getFilter (){
    return new Filter();
  }
  private CmdParser getCmdParser () throws ParseException {
    if (cmdp == null) cmdp = new CmdParser(new StringReader(""));
    return cmdp;
  }
  static TestSuite suite () {
    try {
      return new TestSuite(Class.forName("atan.test.PatternGeneratedTests"));
    } catch (ClassNotFoundException ex) {
      throw new Error(ex.getMessage());
    }
  }
}
