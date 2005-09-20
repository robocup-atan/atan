package atan.test;

import java.net.DatagramSocket;

import atan.model.ByteBuffer;

public class PingPongServer extends UDPServer{

  private int counter = 0;
  private ByteBuffer buf = new ByteBuffer(100);
  private DatagramSocket socket = null;

  public String respondTo (String msg) {
    System.out.println("received: "+msg);
    return "hallo client";
  }
  public static void main (String[] arg) {
    try {
      PingPongServer server = new PingPongServer();
      server.start(4000);
    } catch (Exception ex) {
      System.out.println(ex.getMessage());
    }
  }
}