package org.example;

public class Authenticate {
    String username;
    String password;
    String inputUsername;
    String inputPassword;

    public Authenticate(String username, String password) {
        this.username = username;
        this.password = password;

    }
    public Authenticate(Authenticate source) {
        this.username = source.username;
        this.password = source.password;

    }
    public String getUsername() {

        return this.username;
    }
    public String getPassword() {

        return this.password;
    }
    public void setUsername(String username) {

        this.username = username;
    }
    public void setPassword(String password) {

        this.password = password;
    }
    public String toString() {
        return this.username + " : " + this.password;
    }

    public void compareCredentials() {
        if (inputUsername.equals(username)) { //null pointer exception here - all fields are null
            System.out.println("Login successful!");
        } else {
            System.out.println("Login unsuccessful, please try again.");
        }
    }
}
