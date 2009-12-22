package atan.model;

/**
 * Class description
 * @author Atan
 */
class Parser {
    private static Parser current = new Parser();

    /**
     * Method description
     * @param message
     * @param pl
     */
    void parse(String message, SServerPlayer pl) {}

    /**
     * Method description
     * @return
     */
    static Parser current() {
        return current;
    }
}
