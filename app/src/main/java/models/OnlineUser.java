package models;

import java.util.Date;

/**
 * Created by Bito on 1/15/2017.
 */

public class OnlineUser {

    private double latitude;
    private double longitude;
    private Long timestamp;
    private Motorist motorist;

    public OnlineUser() {  }

    public OnlineUser(double latitude, double longitude, Long timestamp, Motorist motorist) {
        this.latitude = latitude;
        this.longitude = longitude;
        this.timestamp = timestamp;
        this.motorist = motorist;
    }

    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

    public Long getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }

    public Motorist getMotorist() {
        return motorist;
    }

    public void setMotorist(Motorist motorist) {
        this.motorist = motorist;
    }
}
