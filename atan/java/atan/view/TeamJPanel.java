package atan.view;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JSplitPane;
import javax.swing.ListSelectionModel;
import javax.swing.SwingConstants;
import javax.swing.border.Border;

public class TeamJPanel extends JPanel {

    private static final long serialVersionUID = 1L;
    JPanel buttonsPanel = new JPanel();
    JButton connectAll = new JButton();

    TeamModel model = new TeamModel();
    Border border1;
    Border border2;
    Border border3;
    BorderLayout borderLayout1 = new BorderLayout();
    FlowLayout flowLayout2 = new FlowLayout();
    JSplitPane splitPane = new JSplitPane();
    JScrollPane playerListScrollPane = new JScrollPane();
    PlayerJPanel playerPanel = new PlayerJPanel();
    JList playerList = new JList();
    Border border4;
    JLabel logLevelLabel = new JLabel();
    JComboBox loglevelComboBox = new JComboBox();

    public TeamJPanel() {
        try {
            jbInit();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void setModel(TeamModel m) {
        model = m;
        playerPanel.setModel(model.getSelectedPlayer());
        playerList.setModel(model.getListModel());
        playerList.setSelectionModel(model.getPlayersSelection());
        connectAll.setModel(model.getConnectAll());
    }

    private void jbInit() throws Exception {
        border4 = BorderFactory.createEmptyBorder(4, 4, 4, 4);
        this.setLayout(borderLayout1);
        buttonsPanel.setLayout(flowLayout2);
        connectAll.setFont(new java.awt.Font("Dialog", 0, 10));
        connectAll.setActionCommand("CONNECT ALL");
        connectAll.setText("connect");
        flowLayout2.setAlignment(FlowLayout.LEFT);
        flowLayout2.setHgap(0);
        flowLayout2.setVgap(0);
        splitPane.setOrientation(JSplitPane.HORIZONTAL_SPLIT);
        splitPane.setDividerSize(4);
        playerList.setBorder(border4);
        playerList.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        buttonsPanel.setBorder(BorderFactory.createEmptyBorder(0, 0, 4, 0));
        logLevelLabel.setFont(new java.awt.Font("Dialog", 0, 10));
        logLevelLabel.setPreferredSize(new Dimension(50, 13));
        logLevelLabel.setHorizontalAlignment(SwingConstants.TRAILING);
        logLevelLabel.setText("Loglevel:");
        this.add(buttonsPanel, BorderLayout.NORTH);
        buttonsPanel.add(connectAll, null);
        buttonsPanel.add(logLevelLabel, null);
        buttonsPanel.add(loglevelComboBox, null);
        this.add(splitPane, BorderLayout.CENTER);
        splitPane.add(playerListScrollPane, JSplitPane.LEFT);
        playerListScrollPane.getViewport().add(playerList, null);
        splitPane.add(playerPanel, JSplitPane.RIGHT);
        splitPane.setDividerLocation(200);
    }

}