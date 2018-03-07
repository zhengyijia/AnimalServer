package animalManager.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;

@Entity
@IdClass(AnimalLocPK.class)
public class Animalloc_Locinfo {

    @Id
    private String imei;
    @Id
    private String time;
    private Integer longitude;
    private Integer latitude;
    private Short track;

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

    public Integer getLongitude() {
        return longitude;
    }

    public void setLongitude(Integer longitude) {
        this.longitude = longitude;
    }

    public Integer getLatitude() {
        return latitude;
    }

    public void setLatitude(Integer latitude) {
        this.latitude = latitude;
    }

    public Short getTrack() {
        return track;
    }

    public void setTrack(Short track) {
        this.track = track;
    }

}
