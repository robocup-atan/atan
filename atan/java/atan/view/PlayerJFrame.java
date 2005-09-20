package atan.view;

import java.awt.BorderLayout;

import javax.swing.BorderFactory;
import javax.swing.JFrame;

public class PlayerJFrame extends JFrame {
    private static final long serialVersionUID = 1L;
    PlayerJPanel playerPanel = new PlayerJPanel();

    public PlayerJFrame() {
        try {
            setSize(600, 500);
            setLocation(50, 50);
            jbInit();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void setModel(SServerPlayerModel m) {
        setTitle("Atan Player " + m.getModel().getTeamName() + " " + m.getModel().getNumber());
        playerPanel.setModel(m);
    }

    private void jbInit() throws Exception {
        playerPanel.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
        this.getContentPane().add(playerPanel, BorderLayout.CENTER);
    }
}