package atan.test;

public class TestClient00Runner extends Thread {

  TestClient00 client;

  public TestClient00Runner(TestClient00 client) {
    this.client = client;
  }
  public void run () {
    try {
      while (true) {
        client.takeStep();
      }
    } catch (Exception ex) {
      client.handleException(ex);
    }
  }
}