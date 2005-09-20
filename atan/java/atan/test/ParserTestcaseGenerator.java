package atan.test;

import java.io.*;

public class ParserTestcaseGenerator {

  public ParserTestcaseGenerator() {
  }
  private void generate () throws Exception {
    PrintWriter out = null;
    try {
      File f = new File("GeneratedTests.java");
      out = new PrintWriter(new FileOutputStream(f));
      writeHead(out);
      writeTestcases(out);
      writeEnd(out);
      System.out.println("generated: "+f.getAbsolutePath());
      out.close();
    } catch (Exception e) {
      if (out != null) out.close();
      throw e;
    }
  }
  private void writeHead(PrintWriter w){
    w.println("package atan.test;");
    w.println("");
    w.println("import junit.framework.*;");
    w.println("import atan.parser.*;");
    w.println("import atan.model.*;");
    w.println("import java.io.*;");
    w.println("import java.util.*;");
    w.println("");
    w.println("public class GeneratedTests extends TestCase {");
    w.println("");
    w.println("  private static CmdParser cmdp = null;");
    w.println("");
    w.println("  public GeneratedTests(String name) {");
    w.println("    super(name);");
    w.println("  }");
  }
  private void writeTestcases(PrintWriter w) throws Exception {
    BufferedReader r = null;
    try {
      File fi = new  File("commands.txt");
      r = new BufferedReader(new FileReader(fi));
      int count = 0;
      String s;
      while ((s=r.readLine()) != null) writeTestcase(w, s, count++);
      r.close();
    } catch (Exception e) {
      if (r != null) r.close();
      throw e;
    }
  }
  private void writeTestcase(PrintWriter w, String s, int count) {
    w.println("  public void test"+count+"() {");
    w.println("    String s = \""+s+"\";");
    w.println("    TestCommandFilter f = new TestCommandFilter();");
    w.println("    try {");
    w.println("      basicParseCmd(s);");
    w.println("    } catch (ParseException ex) {");
    w.println("      System.out.println(\"<\"+s+\">>\");");
    w.println("      System.out.println(ex.getMessage());");
    w.println("      System.out.println(\"-------------------------------------\");");
    w.println("    }");
    w.println("  }");
  }
  private void writeEnd(PrintWriter w){
    w.println("  private Set basicParseCmd(String s) throws ParseException {");
    w.println("    TestCommandFilter f = new TestCommandFilter();");
    w.println("    filterCommand(s, f);");
    w.println("    TestController c = new TestController();");
    w.println("    DummyPlayer player = new DummyPlayer();");
    w.println("    player.isTeamEast(true);");
    w.println("    player.setTeamName(\"teamEast\");");
    w.println("    if (f.isTypeSee()) getCmdParser().parseSeeCommand(f.getCommand(), c, player);");
    w.println("    else if (f.isTypeError()) getCmdParser().parseErrorCommand(f.getCommand(), player);");
    w.println("    else if (f.isTypeHear()) getCmdParser().parseHearCommand(f.getCommand(), c, player);");
    w.println("    else if (f.isTypeInit()) getCmdParser().parseInitCommand(f.getCommand(), c, player);");
    w.println("    else if (f.isTypeSenseBody()) getCmdParser().parseSenseBodyCommand(f.getCommand(), c, player);");
    w.println("    else if (f.isTypeUndefined()) this.fail(\"CommandFilter could not identify type of: \"+s);");
    w.println("    else this.fail(\"CommandFilter fails in: \"+s);");
    w.println("    return c.getResult();");
    w.println("  }");
    w.println("  private void filterCommand(String cmd, CommandFilter f) throws ParseException {");
    w.println("      getFilter().run(cmd, f);");
    w.println("  }");
    w.println("  private Filter getFilter (){");
    w.println("    return new Filter();");
    w.println("  }");
    w.println("  private CmdParser getCmdParser () throws ParseException {");
    w.println("    if (cmdp == null) cmdp = new CmdParser(new StringReader(\"\"));");
    w.println("    return cmdp;");
    w.println("  }");
    w.println("  static TestSuite suite () {");
    w.println("    try {");
    w.println("      return new TestSuite(Class.forName(\"atan.test.GeneratedTests\"));");
    w.println("    } catch (ClassNotFoundException ex) {");
    w.println("      throw new Error(ex.getMessage());");
    w.println("    }");
    w.println("  }");
    w.println("  public static void main (String[] arg) {");
    w.println("    junit.textui.TestRunner r = new junit.textui.TestRunner();");
    w.println("    r.run(suite());");
    w.println("  }");
    w.println("}");
  }

  public static void main(String[] args) {
    try {
      ParserTestcaseGenerator g = new ParserTestcaseGenerator();
      g.generate();
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}