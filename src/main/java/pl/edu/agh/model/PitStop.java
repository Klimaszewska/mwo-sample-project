package pl.edu.agh.model;

public class PitStop {

    int sessionKey;

    int driverNumber;

    double pitDuration;

    int lapNumber;


    public PitStop(int sessionKey, int driverNumber, double pitDuration, int lapNumber) {
        this.sessionKey = sessionKey;
        this.driverNumber = driverNumber;
        this.pitDuration = pitDuration;
        this.lapNumber = lapNumber;
    }

    public int getSessionKey() {
        return sessionKey;
    }

    public int getDriverNumber() {
        return driverNumber;
    }

    public double getPitDuration() {
        return pitDuration;
    }

    public int getLapNumber() {
        return lapNumber;
    }


}
