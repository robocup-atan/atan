package atan.model;

import java.net.*;
import java.io.*;

public abstract class UDPClient extends Thread {

  private DatagramSocket socket;
  private InetAddress host;
  private int port = 6000;
  private String hostname = "localhost";
  private ByteBuffer buf = null;
  private boolean isRunning = false;
  private Writer logger = new NullLogger();
  private int loglevel = 5;

  public UDPClient () {
    this(6000, "localhost");
  }
  public UDPClient (int port) {
    this(port, "localhost");
  }
  public UDPClient (int port, String hostname) {
    super();
    this.port = port;
    this.hostname = hostname;
  }
  public boolean isRunning() {
    return isRunning;
  }
  public void run () {
    try {
      isRunning = true;
      buf = new ByteBuffer(2000);
      buf.setString(getInitMessage());
      socket = new DatagramSocket();
      socket.setSoTimeout(3000);
      DatagramPacket p = new DatagramPacket(
        buf.getByteArray(), buf.getByteArray().length,
        InetAddress.getByName(hostname), port);
      socket.send(p);
      socket.receive(p);
      this.host = p.getAddress();
      this.port = p.getPort();
      getLogger().println("UDP - client started: "+host+":"+port);
      received(buf.getString());
      while (true) {
        buf.reset();
        DatagramPacket packet = new DatagramPacket(
          buf.getByteArray(), buf.getByteArray().length);
        socket.receive(packet);
        received(buf.getString());
      }
    } catch (Exception ex) {
      getLogger().println(ex.getMessage());
    }
  }
  public void send (String message) throws IOException {
    buf.setString(message);
    DatagramPacket packet = new DatagramPacket(
      buf.getByteArray(), buf.length(), host, port);
    socket.send(packet);
  }
  public abstract String getInitMessage ();
  public abstract void received (String msg) throws IOException;
  protected synchronized void pauseMilliseconds(int ms) {
    try {
      this.wait(ms);
    } catch (InterruptedException ex) {}
  }
  public void setLogger(Writer w){
    logger = w;
  }
  public PrintWriter getLogger(){
    return new PrintWriter(logger);
  }
  public int getLoglevel(){
    return loglevel;
  }
  public void setLoglevel(int val){
    if (val < 0) loglevel = 0;
    else if (val > 10) loglevel = 10;
    else loglevel = val;
  }
  public void start(){
    if (this.isRunning){
      getLogger().println("already running");
    }
    else super.start();
  }
  public String toStateString() {
    StringBuffer buf = new StringBuffer();
    buf.append("Host: ");
    buf.append(this.hostname);
    buf.append(":");
    buf.append(this.port);
    buf.append("\n");
    return buf.toString();
  }
}