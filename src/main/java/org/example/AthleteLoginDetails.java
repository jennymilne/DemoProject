package org.example;

import lombok.Data;
import lombok.Setter;

public class AthleteLoginDetails {
    private String username;
    private String password;


    public AthleteLoginDetails(String username, String password) {
        this.username = username;
        this.password = password;

    }

    public AthleteLoginDetails(AthleteLoginDetails source) {
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