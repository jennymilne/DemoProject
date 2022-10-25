package org.example;

import org.example.LoginUserInterface;

public class Authenticate {
    String username;
    String password;
    String inputUsername;
    String inputPassword;


    public void compareCredentials() {
        if (inputUsername.equals(username) && inputPassword.equals(password)) {
            System.out.println("Login successful!");
        } else {
            System.out.println("Login unsuccessful, please try again.");
        }
    }
}
