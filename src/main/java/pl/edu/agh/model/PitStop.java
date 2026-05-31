package pl.edu.agh.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class PitStop {


    @JsonProperty("session_key")
    int sessionKey;

    @JsonProperty("driver_number")
    int driverNumber;

    @JsonProperty("pit_duration")
    double pitDuration;

    @JsonProperty("lap_number")
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
