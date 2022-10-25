package org.example;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class LoginUserInterface implements ActionListener{

    private static JLabel userLabel;
    private static JTextField userText;
    private static JLabel passwordLabel;
    private static JPasswordField passwordText;
    private static JButton button;
    private static JLabel success;

    public LoginUserInterface() {

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
        button.addActionListener(this::actionPerformed);
        panel.add(button);

        success = new JLabel("");
        success.setBounds(10, 110, 300, 25);
        panel.add(success);

        frame.setVisible(true);

    }


    public String actionPerformed(ActionEvent e) {          // this will not let me return a string
        String inputUsername = userText.getText();
        String inputPassword = passwordText.getText();
        System.out.println("click");
        return inputUsername;

    }



//    public void actionPerformed(ActionEvent e, String username, String password) {
//        username = userText.getText();
//        password = passwordText.getText();
//        System.out.println(username + ", " + password);
//        if (username.equals("jenny") && password.equals("synalogik")) {
//            success.setText("Login successful");
//        } else {
//            success.setText("");
//        }
//    }

}