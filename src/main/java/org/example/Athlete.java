package org.example;

public class Athlete {
    private String username;
    private String password;


    public Athlete(String username, String password) {
        this.username = username;
        this.password = password;

    }

    public Athlete(Athlete source) {
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
}