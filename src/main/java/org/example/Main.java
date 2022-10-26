package org.example;

import java.awt.event.ActionEvent;

public class Main {
    public static void main(String[] args) {
        AthleteLoginDetails jennyLogin = new AthleteLoginDetails("jenny", "java");
//        AthleteLoginDetails[] athleteLoginDetails = new AthleteLoginDetails[] {
//                new AthleteLoginDetails("jenny", "java"),
//                new AthleteLoginDetails("mofarah", "olympics")
//        };

        String username = jennyLogin.getUsername();
        String password = jennyLogin.getPassword();

        GUI loginUI = new GUI();

//        Authenticate authenticate = new Authenticate(username, password);
//        authenticate.compareCredentials();



    }

}