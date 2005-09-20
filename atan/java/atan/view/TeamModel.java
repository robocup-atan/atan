package atan.view;

import javax.swing.*;
import javax.swing.event.*;
import java.awt.event.*;
import atan.model.*;

public class TeamModel implements ListSelectionListener, ActionListener {

  private ListSelectionModel playersSelection = new DefaultListSelectionModel();
  private DefaultListModel players = new DefaultListModel();
  private SServerPlayerModel selectedPlayer = new SServerPlayerModel();
  private ButtonModel connectAll = new DefaultButtonModel();
  private ButtonModel newPlayers = new DefaultButtonModel();
  private ButtonModel openSelected = new DefaultButtonModel();
  private Team team;

  public ListSelectionModel getPlayersSelection(){
    return playersSelection;
  }
  public ListModel getListModel(){
    return players;
  }
  public SServerPlayerModel getSelectedPlayer(){
    return selectedPlayer;
  }
  public ButtonModel getConnectAll(){
    return connectAll;
  }
  public ButtonModel newPlayers(){
    return newPlayers;
  }
  public ButtonModel openSelected(){
    return openSelected;
  }
  public TeamModel() {
    try {
      selectedPlayer.setModel(new NullPlayer());
      playersSelection.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
      playersSelection.addListSelectionListener(this);
      connectAll.addActionListener(this);
      newPlayers.addActionListener(this);
      openSelected.addActionListener(this);
    } catch (Exception ex) {
      System.out.println(ex.getMessage());
    }
  }
  public void setModel(Team t){
    team = t;
    players.clear();
    for (int i=0; i<team.size(); i++){
      players.add(i, team.getPlayer(i).toListString());
    }
    playersSelection.clearSelection();
  }
  public Team getModel(){
    return team;
  }
  public void valueChanged(ListSelectionEvent e) {
    try {
      if (e.getSource() == playersSelection) {
        selectedPlayer.setModel(team.getPlayer(playersSelection.getMinSelectionIndex()));
      }
    } catch (Exception ex) {
      ex.printStackTrace();
    }
  }
  public void actionPerformed(ActionEvent e){
    try {
      if (e.getSource() == connectAll) {
        team.connectAll();
        setModel(team);
      }
      else if (e.getSource() == newPlayers){
        team.createNewPlayers();
        selectedPlayer.updateFromModel();
      }
      else if (e.getSource() == openSelected){
        if (!playersSelection.isSelectionEmpty()){
          SServerPlayer c = team.getPlayer(playersSelection.getMinSelectionIndex());
          SServerPlayerModel m = new SServerPlayerModel();
          m.setModel(c);
          PlayerJFrame f = new PlayerJFrame();
          f.setModel(m);
          f.setVisible(true);
        }
      }
    } catch (Exception ex){
      Error err = new Error();
      err.fillInStackTrace();
      throw err;
    }
  }
}