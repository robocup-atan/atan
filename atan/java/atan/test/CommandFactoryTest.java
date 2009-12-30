package atan.test;

//~--- non-JDK imports --------------------------------------------------------

import atan.model.CommandFactory;
import atan.model.ViewAngle;
import atan.model.ViewQuality;

import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Class description
 * @author Atan
 */
public class CommandFactoryTest extends TestCase {

    /**
     * Constructs ...
     * @param name
     */
    public CommandFactoryTest(String name) {
        super(name);
    }

    /**
     * Method description
     */
    public void test00() {
        CommandFactory f = new CommandFactory();
        f.addPlayerInitCommand("hallo", false);
        assertTrue("no command", f.hasNext());
        assertEquals("(init (version 13) hallo)", f.next());
        assertTrue("a command", !f.hasNext());
    }

    /**
     * Method description
     */
    public void test01() {
        CommandFactory f = new CommandFactory();
        f.addPlayerInitCommand("hallo", true);
        assertTrue("no command", f.hasNext());
        assertEquals("(init hallo g)", f.next());
        assertTrue("a command", !f.hasNext());
        f.addPlayerInitCommand("hello", false);
        assertTrue("no command", f.hasNext());
        assertEquals("(init (version 13) hello)", f.next());
        assertTrue("a command", !f.hasNext());
    }

    /**
     * Method description
     */
    public void test02() {
        CommandFactory f = new CommandFactory();
        f.addPlayerInitCommand("hallo", false);
        f.addPlayerInitCommand("hello", false);
        assertEquals("(init (version 13) hallo)", f.next());
        assertEquals("(init (version 13) hello)", f.next());
    }

    /**
     * Method description
     */
    public void test03() {
        CommandFactory f = new CommandFactory();
        f.addReconnectCommand("hallo", 1);
        assertEquals("(reconnect hallo 1)", f.next());
    }

    /**
     * Method description
     */
    public void test04() {
        CommandFactory f = new CommandFactory();
        f.addReconnectCommand("hallo", 2);
        assertEquals("(reconnect hallo 2)", f.next());
    }

    /**
     * Method description
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
     * Method description
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
