package atan.test;

import junit.framework.TestCase;
import junit.framework.TestSuite;
import atan.model.CommandFactory;
import atan.model.ViewAngle;
import atan.model.ViewQuality;

public class CommandFactoryTest extends TestCase {

  public CommandFactoryTest(String name) {
    super(name);
  }
  public void test00() {
    CommandFactory f = new CommandFactory();
    f.addInitCommand("hallo", false);
    assertTrue("no command", f.hasNext());
    assertEquals("(init hallo)", f.next());
    assertTrue("a command", !f.hasNext());
  }
  public void test01() {
    CommandFactory f = new CommandFactory();
    f.addInitCommand("hallo", true);
    assertTrue("no command", f.hasNext());
    assertEquals("(init hallo g)", f.next());
    assertTrue("a command", !f.hasNext());
    f.addInitCommand("hello", false);
    assertTrue("no command", f.hasNext());
    assertEquals("(init hello)", f.next());
    assertTrue("a command", !f.hasNext());
  }
  public void test02() {
    CommandFactory f = new CommandFactory();
    f.addInitCommand("hallo", false);
    f.addInitCommand("hello", false);
    assertEquals("(init hallo)", f.next());
    assertEquals("(init hello)", f.next());
  }
  public void test03() {
    CommandFactory f = new CommandFactory();
    f.addReconnectCommand("hallo", 1);
    assertEquals("(reconnect hallo 1)", f.next());
  }
  public void test04() {
    CommandFactory f = new CommandFactory();
    f.addReconnectCommand("hallo", 2);
    assertEquals("(reconnect hallo 2)", f.next());
  }
  public void test05() {
    CommandFactory f = new CommandFactory();
    f.addCatchCommand(22);
    assertEquals("(catch 22)", f.next());
    f.addCatchCommand(-22);
    assertEquals("(catch -22)", f.next());
    f.addChangeViewCommand(ViewQuality.HIGH, ViewAngle.NARROW);
    assertEquals("(change_view narrow high)", f.next());
    f.addChangeViewCommand(ViewQuality.LOW, ViewAngle.WIDE);
    assertEquals("(change_view wide low)", f.next());
    f.addChangeViewCommand( ViewQuality.LOW, ViewAngle.NORMAL);
    assertEquals("(change_view normal low)", f.next());
    f.addDashCommand(23);
    assertEquals("(dash 23)", f.next());
    f.addDashCommand(-23);
    assertEquals("(dash -23)", f.next());
    f.addKickCommand(-23, 100);
    assertEquals("(kick -23 100)", f.next());
    f.addKickCommand(23, 100);
    assertEquals("(kick 23 100)", f.next());
    f.addKickCommand(23, -100);
    assertEquals("(kick 23 -100)", f.next());
    f.addMoveCommand(10, 34);
    assertEquals("(move 10 34)", f.next());
    f.addMoveCommand(-10, -34);
    assertEquals("(move -10 -34)", f.next());
    f.addSayCommand("hallo_wie_gehts12345");
    assertEquals("(say hallo_wie_gehts12345)", f.next());
    f.addSayCommand("hallo_wie_gehts12345");
    assertEquals("(say hallo_wie_gehts12345)", f.next());
    f.addTurnCommand(123);
    assertEquals("(turn 123)", f.next());
    f.addTurnCommand(0);
    assertEquals("(turn 0)", f.next());
    f.addTurnCommand(-0);
    assertEquals("(turn 0)", f.next());
    f.addTurnCommand(-110);
    assertEquals("(turn -110)", f.next());
    f.addSenseBodyCommand();
    assertEquals("(sense_body)", f.next());
    f.addByeCommand();
    assertEquals("(bye)", f.next());
  }
  static TestSuite suite () {
    try {
      return new TestSuite(Class.forName("atan.test.CommandFactoryTest"));
    } catch (ClassNotFoundException ex) {
      throw new Error(ex.getMessage());
    }
  }
}
