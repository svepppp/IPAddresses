package view;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class IpAddressWindow extends JFrame {
    private JPanel jPanel;
    private JLabel jLabel;
    private JTextField jTextField1;
    private JTextField jTextField2;
    private String value1;
    private String value2;
    private AllIpAddressesWindow allIpAddressesWindow;
    public IpAddressWindow() throws HeadlessException {
        setVisible(false);
        jPanel = new JPanel();
        jLabel = new JLabel("Укажите IP адреса");
        jTextField1 = new JTextField(15);
        jTextField2 = new JTextField(15);
        setTitle("IP адреса");
        setSize(200, 150);
        setLocationRelativeTo(null);
        //setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jPanel.add(jLabel);
        jPanel.add(jTextField1);
        jPanel.add(jTextField2);
        add(jPanel);
        setVisible(true);

        jTextField1.addActionListener(new ActionListener() {  //   по  Enter
            @Override
            public void actionPerformed(ActionEvent e) {
                value1 = jTextField1.getText();
                jTextField2.requestFocus();
            }
        });
        jTextField2.addActionListener(new ActionListener() {  //   по  Enter
            @Override
            public void actionPerformed(ActionEvent e) {
                value2 = jTextField2.getText();
               allIpAddressesWindow=new AllIpAddressesWindow();
                 dispose();

                           }
        });
    }
}
