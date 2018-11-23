package view;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class IpAddressWindow extends JFrame {
    private JPanel jPanel;
    private JLabel jLabel1;
    private JLabel jLabel2;
    private JTextField jTextField1;
    private JTextField jTextField2;
    private String value1;
    private String value2;


    public String getValue1() {
        return value1;
    }

    public String getValue2() {
        return value2;
    }

    public IpAddressWindow() throws HeadlessException {
        setVisible(false);
        jPanel = new JPanel();
        jLabel1 = new JLabel("Укажите IP адреса");
        jLabel2 = new JLabel("");
        jTextField1 = new JTextField(15);
        jTextField2 = new JTextField(15);
        setTitle("IP адреса");
        setSize(230, 150);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jPanel.add(jLabel1);


        jPanel.add(jTextField1);
        jPanel.add(jTextField2);
        jPanel.add(jLabel2);
        add(jPanel);
        setVisible(true);

        jTextField1.addActionListener(new ActionListener() {  //   по  Enter
            @Override
            public void actionPerformed(ActionEvent e) {
                value1 = jTextField1.getText();
                jTextField2.requestFocus();
            }
        });

        jTextField2.addActionListener(new ActionListener() {          //   по  Enter
            @Override
            public void actionPerformed(ActionEvent e) {
                value2 = jTextField2.getText();
                jLabel2.setFocusable(true);
                jLabel2.setText("Составляется список IP адресов");
                // dispose();
            }
        });
    }
}
