package atan.view;

import javax.swing.*;
import java.awt.*;
import javax.swing.border.*;

public class PlayerJPanel extends JPanel {

  SServerPlayerModel model;
  JSplitPane splitPane = new JSplitPane();
  BorderLayout borderLayout1 = new BorderLayout();
  JSlider loglevelSlider = new JSlider();
  TitledBorder loglevelTitledBorder;
  JScrollPane jScrollPane1 = new JScrollPane();
  JScrollPane jScrollPane2 = new JScrollPane();
  JTextArea stateTextArea = new JTextArea();
  JTextArea loggingTextArea = new JTextArea();
  TitledBorder playerTitledBorder;
  JPanel buttonPanel = new JPanel();
  JButton connectButton = new JButton();
  FlowLayout flowLayout1 = new FlowLayout();
  Border border1;
  Border border2;
  Border border3;
  Border border4;
  Border border5;

  public PlayerJPanel() {
    try {
      jbInit();
    }
    catch(Exception e) {
      e.printStackTrace();
    }
  }
  void setModel(SServerPlayerModel m){
    model = m;
    stateTextArea.setDocument(model.getState());
    loggingTextArea.setDocument(model.getLoging());
    loglevelSlider.setModel(model.getLoglevel());
    connectButton.setModel(model.getStart());
  }
  private void jbInit() throws Exception {
    loglevelTitledBorder = new TitledBorder(BorderFactory.createLineBorder(Color.gray,1),"Loglevel");
    playerTitledBorder = new TitledBorder(BorderFactory.createEmptyBorder(5,5,5,5),"");
    border1 = BorderFactory.createEmptyBorder();
    border2 = new TitledBorder(BorderFactory.createEmptyBorder(3,0,3,0),"");
    border3 = BorderFactory.createEmptyBorder(4,4,4,4);
    border4 = BorderFactory.createEmptyBorder(4,0,0,0);
    border5 = BorderFactory.createBevelBorder(BevelBorder.RAISED,Color.lightGray,Color.lightGray,Color.darkGray,Color.darkGray);
    this.setLayout(borderLayout1);
    splitPane.setOrientation(JSplitPane.VERTICAL_SPLIT);
    splitPane.setBorder(BorderFactory.createEmptyBorder(0,2,0,0));
    splitPane.setOpaque(false);
    splitPane.setDividerSize(5);
    loglevelSlider.setMinorTickSpacing(1);
    loglevelSlider.setMajorTickSpacing(1);
    loglevelSlider.setPaintLabels(true);
    loglevelSlider.setMaximum(10);
    loglevelSlider.setValueIsAdjusting(true);
    loglevelSlider.setSnapToTicks(true);
    loglevelSlider.setOpaque(false);
    loglevelSlider.setBorder(border4);
    loglevelSlider.setToolTipText("Loglevel");
    stateTextArea.setBorder(border3);
    stateTextArea.setEditable(false);
    loggingTextArea.setBorder(border3);
    loggingTextArea.setEditable(false);
    this.setBackground(Color.white);
    connectButton.setBorder(border5);
    connectButton.setOpaque(false);
    connectButton.setPreferredSize(new Dimension(100, 20));
    connectButton.setText("CONNECT");
    buttonPanel.setLayout(flowLayout1);
    flowLayout1.setAlignment(FlowLayout.LEFT);
    flowLayout1.setHgap(2);
    flowLayout1.setVgap(2);
    buttonPanel.setOpaque(false);
    this.add(splitPane, BorderLayout.CENTER);
    splitPane.add(jScrollPane1, JSplitPane.TOP);
    jScrollPane1.getViewport().add(stateTextArea, null);
    splitPane.add(jScrollPane2, JSplitPane.BOTTOM);
    this.add(loglevelSlider, BorderLayout.SOUTH);
    this.add(buttonPanel, BorderLayout.NORTH);
    buttonPanel.add(connectButton, null);
    jScrollPane2.getViewport().add(loggingTextArea, null);
    splitPane.setDividerLocation(160);
  }
}
