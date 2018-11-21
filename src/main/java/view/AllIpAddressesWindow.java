package view;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AllIpAddressesWindow extends JFrame {
    private JPanel jPanel;
    private JTextArea jTextArea;
    //  private JButton jButton;

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
        jTextArea.requestFocus();
        //   jButton = new JButton("Close");
        // jPanel.add(jButton);
        jPanel.add(jTextArea);
        add(jPanel);
        setVisible(true);

     /*   jButton.addActionListener(new ActionListener() {     //    завершить игру
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });*/
    }
}
