package atan.model;

class Parser {

  private static Parser current = new Parser();

  void parse (String message, SServerPlayer pl) {
  }
  static Parser current () {
    return current;
  }
}