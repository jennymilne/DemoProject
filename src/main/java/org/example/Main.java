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

        LoginUserInterface loginUserInterface = new LoginUserInterface();
        Authenticate authenticate = new Authenticate(jennyLogin.getUsername(), jennyLogin.getPassword());
        authenticate.compareCredentials();



//        if (loginUserInterface.actionPerformed() == true) {
//            Authenticate authenticate = new Authenticate(jennyLogin.getUsername(), jennyLogin.getPassword());
//            authenticate.compareCredentials();
//        }










    }

}