package org.example;

public class Strava {
    private Athlete[] athletes;

    public Strava(Athlete[] athletes) {
        this.athletes = new Athlete[athletes.length];
        for (int i = 0; i < athletes.length; i++) {
            this.athletes[i] = new Athlete(athletes[i]);

        }
    }

    public Athlete getAthlete(int memberNumber) {
        return new Athlete(athletes[memberNumber]);
    }

    public void setAthlete(Athlete athlete, int memberNumber) {
        this.athletes[memberNumber] = new Athlete(athlete);
    }
    public String toString() {
        String temp = "";
        for (int i = 0; i < athletes.length ; i++) {
            temp += this.athletes[i].toString();
            temp += "\n";
        }
        return temp;
    }
/*    public boolean login(int memberNumber) {
        if (this.athletes[memberNumber].getUsername())
    }*/
}
