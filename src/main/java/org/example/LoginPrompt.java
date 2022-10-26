package org.example;
import javax.swing.*;

public class LoginPrompt {

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                String inputUsername = JOptionPane.showInputDialog(null, "Username");
                System.out.println("Username: " + inputUsername);

                JPasswordField passwordField = new JPasswordField();
                JOptionPane.showMessageDialog(null, passwordField, "Password",
                        JOptionPane.QUESTION_MESSAGE);
                char[] inputPassword = null;
                inputPassword = passwordField.getPassword();
                System.out.println("Password: " + inputPassword);
            }
        });
    }

}
