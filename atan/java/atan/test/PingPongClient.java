package atan.test;

import java.io.IOException;

import atan.model.UDPClient;

public class PingPongClient extends UDPClient {

  private static int counter = 0;

  public PingPongClient(int port){
    super(port);
  }
  public String getInitMessage() {
    return "hallo server";
  }
  public void received (String msg) throws IOException {
    System.out.println("Client received: "+msg+" count: "+counter++);
    send("hallo server. Received already "+counter);
    this.pauseMilliseconds(200);
  }
  public static void main (String[] arg) {
    try {
      PingPongClient client = new PingPongClient(4000);
      client.start();
    } catch (Exception ex) {
      System.out.println(ex.getMessage());
    }
  }
}