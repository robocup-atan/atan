package atan.view;

import javax.swing.*;
import atan.model.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.border.Border;


public class PlayerJFrame extends JFrame {
  PlayerJPanel playerPanel = new PlayerJPanel();

  public PlayerJFrame() {
    try {
      setSize(600, 500);
      setLocation(50, 50);
      jbInit();
    }
    catch(Exception e) {
      e.printStackTrace();
    }
  }
  public void setModel(SServerPlayerModel m){
    setTitle("Atan Player "+m.getModel().getTeamName()+" "+m.getModel().getNumber());
    playerPanel.setModel(m);
  }
  private void jbInit() throws Exception {
    playerPanel.setBorder(BorderFactory.createEmptyBorder(5,5,5,5));
    this.getContentPane().add(playerPanel, BorderLayout.CENTER);
  }
}