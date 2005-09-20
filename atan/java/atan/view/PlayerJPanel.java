package atan.view;

import java.awt.BorderLayout;

import javax.swing.BorderFactory;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JSplitPane;
import javax.swing.JTextArea;
import javax.swing.border.Border;

public class PlayerJPanel extends JPanel {

    private static final long serialVersionUID = 1L;
    SServerPlayerModel model;
    JSplitPane splitPane = new JSplitPane();
    BorderLayout borderLayout1 = new BorderLayout();
    JScrollPane jScrollPane1 = new JScrollPane();
    JScrollPane jScrollPane2 = new JScrollPane();
    JTextArea stateTextArea = new JTextArea();
    JTextArea loggingTextArea = new JTextArea();
    Border border1;

    public PlayerJPanel() {
        try {
            jbInit();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    void setModel(SServerPlayerModel m) {
        model = m;
        stateTextArea.setDocument(model.getState());
        loggingTextArea.setDocument(model.getLoging());
    }

    private void jbInit() throws Exception {
        border1 = BorderFactory.createEmptyBorder(4, 4, 4, 4);
        this.setLayout(borderLayout1);
        splitPane.setOrientation(JSplitPane.VERTICAL_SPLIT);
        splitPane.setDividerSize(4);
        stateTextArea.setFont(new java.awt.Font("Dialog", 0, 10));
        stateTextArea.setBorder(border1);
        stateTextArea.setEditable(false);
        loggingTextArea.setFont(new java.awt.Font("Dialog", 0, 10));
        loggingTextArea.setBorder(border1);
        loggingTextArea.setEditable(false);
        this.setFont(new java.awt.Font("Dialog", 0, 10));
        splitPane.add(jScrollPane1, JSplitPane.TOP);
        splitPane.add(jScrollPane2, JSplitPane.BOTTOM);
        jScrollPane2.getViewport().add(loggingTextArea, null);
        jScrollPane1.getViewport().add(stateTextArea, null);
        this.add(splitPane, BorderLayout.CENTER);
        splitPane.setDividerLocation(150);
    }
}
