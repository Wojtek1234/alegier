package view;

import model.AccountProperties;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by Wojtek on 2014-09-19.
 */
public class LoginDialog extends JDialog {

    private final JTextField loginField = new JTextField();
    private final JPasswordField passwordField = new JPasswordField();

    public LoginDialog(JFrame parent,String title) {
        super(parent, title, true);

        final JButton loginBut=new JButton("Login");
        final JButton loginAsNoUser=new JButton("Login as guest");
        this.setLayout(new BorderLayout());

        JPanel logPanel=new JPanel(new GridLayout(0,2));
        JPanel butPanel=new JPanel(new GridLayout(0,2));

        logPanel.add(loginField);
        logPanel.add(passwordField);
        butPanel.add(loginBut);
        butPanel.add(loginAsNoUser);
        this.add(logPanel,BorderLayout.CENTER);
        this.add(butPanel,BorderLayout.SOUTH);


        loginBut.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                closeDialog();
            }
        });
        loginAsNoUser.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                closeDialog();
            }
        });
        initGUI();
    }


    private void closeDialog(){
        setVisible(false);
        dispose();
    }

    public AccountProperties getAccountProps(){

        this.dispose();
        return new AccountProperties(loginField.getText(),String.copyValueOf(passwordField.getPassword()));
    }
    private void initGUI(){
        this.setSize(400,200);
        this.setVisible(true);
        pack();
    }



}
