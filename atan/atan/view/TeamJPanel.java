package atan.view;

import javax.swing.*;
import java.awt.*;
import javax.swing.border.*;


public class TeamJPanel extends JPanel {
  GridBagLayout gridBagLayout1 = new GridBagLayout();
  PlayerJPanel playerPanel = new PlayerJPanel();
  JPanel fillerPanel = new JPanel();
  JPanel commandsPanel = new JPanel();
  FlowLayout flowLayout1 = new FlowLayout();
  JButton connectAll = new JButton();
  JButton newButton = new JButton();

  TeamModel model = new TeamModel();
  JScrollPane playerListScrollPane = new JScrollPane();
  JList playerList = new JList();
  JButton openButton = new JButton();
  Border border1;
  Border border2;
  Border border3;

  public TeamJPanel() {
    try {
      jbInit();
    }
    catch(Exception e) {
      e.printStackTrace();
    }
  }
  public void setModel(TeamModel m){
    model = m;
    playerPanel.setModel(model.getSelectedPlayer());
    playerList.setModel(model.getListModel());
    playerList.setSelectionModel(model.getPlayersSelection());
    connectAll.setModel(model.getConnectAll());
    newButton.setModel(model.newPlayers());
    openButton.setModel(model.openSelected());
  }
  private void jbInit() throws Exception {
    border1 = BorderFactory.createCompoundBorder(BorderFactory.createLineBorder(Color.darkGray,1),BorderFactory.createEmptyBorder(4,4,4,4));
    border2 = BorderFactory.createEmptyBorder(4,4,4,4);
    border3 = BorderFactory.createBevelBorder(BevelBorder.RAISED,Color.lightGray,Color.lightGray,Color.darkGray,Color.darkGray);
    this.setLayout(gridBagLayout1);
    fillerPanel.setOpaque(false);
    commandsPanel.setOpaque(false);
    commandsPanel.setLayout(flowLayout1);
    flowLayout1.setAlignment(FlowLayout.LEFT);
    flowLayout1.setHgap(2);
    flowLayout1.setVgap(1);
    connectAll.setOpaque(false);
    connectAll.setBorder(border3);
    connectAll.setPreferredSize(new Dimension(100, 20));
    connectAll.setText("CONNECT ALL");
    newButton.setOpaque(false);
    newButton.setBorder(border3);
    newButton.setPreferredSize(new Dimension(80, 20));
    newButton.setText("NEW");
    playerPanel.setOpaque(false);
    this.setBackground(Color.white);
    playerList.setBorder(border2);
    playerList.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
    playerListScrollPane.setBorder(BorderFactory.createLineBorder(Color.darkGray,1));
    openButton.setText("OPEN");
    openButton.setBorder(border3);
    openButton.setPreferredSize(new Dimension(80, 20));
    openButton.setOpaque(false);
    this.add(playerPanel, new GridBagConstraints(1, 1, 1, 1, 1.0, 1.0
            ,GridBagConstraints.CENTER, GridBagConstraints.BOTH, new Insets(0, 0, 0, 0), 0, 0));
    this.add(fillerPanel, new GridBagConstraints(0, 0, 1, 1, 0.0, 0.0
            ,GridBagConstraints.CENTER, GridBagConstraints.BOTH, new Insets(0, 0, 0, 0), 120, 0));
    this.add(commandsPanel, new GridBagConstraints(1, 0, 1, 1, 0.0, 0.0
            ,GridBagConstraints.CENTER, GridBagConstraints.BOTH, new Insets(0, 0, 0, 0), 0, 0));
    commandsPanel.add(connectAll, null);
    commandsPanel.add(newButton, null);
    commandsPanel.add(openButton, null);
    this.add(playerListScrollPane, new GridBagConstraints(0, 1, 1, 1, 0.0, 0.0
            ,GridBagConstraints.CENTER, GridBagConstraints.BOTH, new Insets(24, 0, 36, 2), 0, 0));
    playerListScrollPane.getViewport().add(playerList, null);
  }

}