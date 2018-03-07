package animalManager.model;

public class AnimalLocWithId {

    private String petId;
    private String time;
    private Integer longitude;
    private Integer latitude;
    private Short track;

    public String getPetId() {
        return petId;
    }

    public void setPetId(String petId) {
        this.petId = petId;
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
