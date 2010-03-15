package atan.test;

//~--- non-JDK imports --------------------------------------------------------

import atan.model.CommandFactory;
import atan.model.enums.ViewAngle;
import atan.model.enums.ViewQuality;

import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 *
 * @author Atan
 */
public class CommandFactoryTest extends TestCase {

    /**
     *
     * @param name
     */
    public CommandFactoryTest(String name) {
        super(name);
    }

    /**
     *
     */
    public void test00() {
        CommandFactory f = new CommandFactory();
        f.addPlayerInitCommand("hallo", false, "13");
        assertTrue("no command", f.hasNext());
        assertEquals("(init hallo (version 13))", f.next());
        assertTrue("a command", !f.hasNext());
    }

    /**
     *
     */
    public void test01() {
        CommandFactory f = new CommandFactory();
        f.addPlayerInitCommand("hallo", true, "13");
        assertTrue("no command", f.hasNext());
        assertEquals("(init hallo (version 13) (goalie))", f.next());
        assertTrue("a command", !f.hasNext());
        f.addPlayerInitCommand("hello", false, "13");
        assertTrue("no command", f.hasNext());
        assertEquals("(init hello (version 13))", f.next());
        assertTrue("a command", !f.hasNext());
    }

    /**
     *
     */
    public void test02() {
        CommandFactory f = new CommandFactory();
        f.addPlayerInitCommand("hallo", true, "13");
        f.addPlayerInitCommand("hello", false, "13");
        assertEquals("(init hallo (version 13) (goalie))", f.next());
        assertEquals("(init hello (version 13))", f.next());
    }

    /**
     *
     */
    public void test03() {
        CommandFactory f = new CommandFactory();
        f.addReconnectCommand("hallo", 1);
        assertEquals("(reconnect hallo 1)", f.next());
    }

    /**
     *
     */
    public void test04() {
        CommandFactory f = new CommandFactory();
        f.addReconnectCommand("hallo", 2);
        assertEquals("(reconnect hallo 2)", f.next());
    }

    /**
     *
     */
    public void test05() {
        CommandFactory f = new CommandFactory();
        f.addCatchCommand(22);
        assertEquals("(catch 22)", f.next());
        f.addCatchCommand(-22);
        assertEquals("(catch -22)", f.next());
        f.addChangeViewCommand(ViewAngle.NARROW, ViewQuality.HIGH);
        assertEquals("(change_view narrow high)", f.next());
        f.addChangeViewCommand(ViewAngle.WIDE, ViewQuality.LOW);
        assertEquals("(change_view wide low)", f.next());
        f.addChangeViewCommand(ViewAngle.NORMAL, ViewQuality.LOW);
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

    /**
     *
     * @return
     */
    static TestSuite suite() {
        try {
            return new TestSuite(Class.forName("atan.test.CommandFactoryTest"));
        } catch (ClassNotFoundException ex) {
            throw new Error(ex.getMessage());
        }
    }
}
