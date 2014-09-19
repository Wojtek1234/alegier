package view;

import model.AccountProperties;

import javax.swing.*;
import java.awt.*;

/**
 * Created by Wojtek on 2014-09-19.
 */
public class LoginDialog extends JDialog {

    private final JTextField loginField = new JTextField();
    private final JPasswordField passwordField = new JPasswordField();

    public LoginDialog() {


        final JButton loginBut=new JButton("Login");
        final JButton loginAsNoUser=new JButton("Login as guest");
        this.setLayout(new BorderLayout());
        JPanel logPanel=new JPanel(new FlowLayout());
        JPanel butPanel=new JPanel(new FlowLayout());
        logPanel.add(loginField);
        logPanel.add(passwordField);
        butPanel.add(loginBut);
        butPanel.add(loginAsNoUser);
        this.add(logPanel,BorderLayout.NORTH);
        this.add(logPanel,BorderLayout.SOUTH);

    }


    public AccountProperties getAccountProps(){

        return new AccountProperties(loginField.getText(),String.copyValueOf(passwordField.getPassword()));

    }


}
