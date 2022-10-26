package org.example;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JOptionPane;


public class GUI extends Component implements ActionListener{

    private static JLabel userLabel;
    private static JTextField userText;
    private static JLabel passwordLabel;
    private static JPasswordField passwordText;
    private static JButton button;
    private static JLabel success;

    public static void main(String[] args) {

        JFrame frame = new JFrame();

        frame.setSize(350, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


        JPanel panel = new JPanel();
        frame.add(panel);

        panel.setLayout(null);

        userLabel = new JLabel("User");
        userLabel.setBounds(10, 20, 80, 25);
        panel.add(userLabel);

        userText = new JTextField(20);
        userText.setBounds(100, 20, 165, 25);
        panel.add(userText);

        passwordLabel = new JLabel("Password");
        passwordLabel.setBounds(10, 50, 80, 25);
        panel.add(passwordLabel);

        passwordText = new JPasswordField(20);
        passwordText.setBounds(100, 50, 165, 25);
        panel.add(passwordText);


        button = new JButton("Login");
        button.setBounds(10, 80, 80, 25);
        button.addActionListener(new GUI());
        panel.add(button);

        success = new JLabel("");
        success.setBounds(10, 110, 300, 25);
        panel.add(success);

        frame.setVisible(true);

    }

    public void actionPerformed(ActionEvent e) {
        String inputUsername = userText.getText();
        String inputPassword = String.valueOf(passwordText.getText());

        if("".equals(inputPassword) || "".equals(inputUsername)) {
            JOptionPane.showMessageDialog(this, "Name of password is empty!", "Incorrect Input", JOptionPane.ERROR_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(this, "Hello " + inputUsername + " with password " + inputPassword, "Login Successful", JOptionPane.PLAIN_MESSAGE);
        }
    }

}