package atan.model;

/**
 * A basic parser class.
 * @author Atan
 */
class Parser {
    private static Parser current = new Parser();

    /**
     * Parses the given message.
     * @param message The SServer Message.
     * @param pl A SServerPlayer object.
     */
    void parse(String message, SServerPlayer pl) {}

    /**
     * 
     * @return
     */
    static Parser current() {
        return current;
    }
}
