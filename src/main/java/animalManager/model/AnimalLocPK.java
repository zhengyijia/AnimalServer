package animalManager.model;

import java.io.Serializable;

public class AnimalLocPK implements Serializable {

    private String imei;
    private String time;

    public String getImei() {
        return imei;
    }

    public void setImei(String imei) {
        this.imei = imei;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }
}
