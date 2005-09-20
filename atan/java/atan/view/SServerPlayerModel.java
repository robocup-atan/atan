package atan.view;

import atan.model.*;
import javax.swing.*;
import javax.swing.text.*;
import javax.swing.event.*;
import java.awt.event.*;


class SServerPlayerModel implements ActionListener, ChangeListener{

  private Document state;
  private Document logging;
  private BoundedRangeModel loglevel;
  private ButtonModel start;

  private SServerPlayer player = new NullPlayer();

  SServerPlayerModel(){
    state = new PlainDocument();
    logging = new PlainDocument();
    loglevel = new DefaultBoundedRangeModel(5, 0, 0, 10);
    start = new DefaultButtonModel();
    start.addActionListener(this);
    loglevel.addChangeListener(this);
  }
  void setModel(SServerPlayer p) throws BadLocationException {
    player.setLogger(new NullLogger());
    player = p;
    player.setLogger(new DocumentWriter(logging));
    logging.remove(0, logging.getLength());
    updateFromModel();
  }
  SServerPlayer getModel() {
    return player;
  }
  public Document getState() {
    return state;
  }
  public Document getLoging() {
    return logging;
  }
  public BoundedRangeModel getLoglevel() {
    return loglevel;
  }
  public ButtonModel getStart() {
    return start;
  }
  public void stateChanged(ChangeEvent e){
    try {
      if (e.getSource() == loglevel) {
        player.setLoglevel(loglevel.getValue());
        updateFromModel();
      }
    } catch (Exception ex) {
      ex.printStackTrace();
      player.handleError(ex.getMessage());
    }
  }

  public void actionPerformed(ActionEvent e){
    try {
      if (e.getSource() == start) {
        player.connect();
        updateFromModel();
      }
    } catch (Exception ex) {
      ex.printStackTrace();
      player.handleError(ex.getMessage());
    }
  }
  public void updateFromModel() throws BadLocationException {
    state.remove(0, state.getLength());
    state.insertString(0, player.toStateString(), null);
    loglevel.setValue(player.getLoglevel());
  }
}