package view;

import javax.swing.*;
import java.awt.*;

public class AllIpAddressesWindow extends JFrame {
    private JPanel jPanel;
    private JTextArea jTextArea;

    public JTextArea getjTextArea() {
        return jTextArea;
    }

    public void setjTextArea(JTextArea jTextArea) {
        this.jTextArea = jTextArea;
    }

    public AllIpAddressesWindow() throws HeadlessException {
        setVisible(false);
        setTitle("Все IP адреса");
        setSize(240, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jPanel = new JPanel();
        jTextArea = new JTextArea();
        jTextArea.setRows(40);

        jPanel.add(jTextArea);
        add(jPanel);
        setVisible(true);
    }
}
