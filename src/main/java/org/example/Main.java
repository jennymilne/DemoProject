package org.example;

import java.awt.event.ActionEvent;

public class Main {
    public static void main(String[] args) {

        AthleteLoginDetails[] athleteLoginDetails = new AthleteLoginDetails[] {
                new AthleteLoginDetails("jenny", "java"),
                new AthleteLoginDetails("mofarah", "olympics")
        };

        LoginUserInterface loginUserInterface = new LoginUserInterface();
//      loginUserInterface.actionPerformed();
        Authenticate authenticate = new Authenticate();
        authenticate.compareCredentials();









    }

}