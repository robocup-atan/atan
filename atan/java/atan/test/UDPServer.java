package atan.test;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

import atan.model.ByteBuffer;

public abstract class UDPServer {

  private ByteBuffer buf = new ByteBuffer(100);
  private DatagramSocket socket = null;

  public UDPServer()  {
    super();
  }
  public void start (int port) throws IOException{
    socket = new DatagramSocket(port, InetAddress.getByName("localhost"));
    socket.setSoTimeout(60000);
    while (true) {
      DatagramPacket p = new DatagramPacket(
        buf.getByteArray(), buf.length());
      socket.receive(p);
      buf.setString(respondTo(buf.getString()));
      p = new DatagramPacket(
        buf.getByteArray(), buf.length(), p.getAddress(), p.getPort());
      socket.send(p);
    }
  }
  public abstract String respondTo (String msg);
}