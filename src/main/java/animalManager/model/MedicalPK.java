package animalManager.model;

import java.io.Serializable;

public class MedicalPK implements Serializable{
    
    private String medical_username;

    private Integer medical_year;

    private Integer medical_month;

    private Integer medical_day;

    public String getUserName() {
    	return medical_username;
    }

    public void setUserName(String food_username) {
    	this.medical_username = medical_username;
    }

    public Integer getYear() {
    	return medical_year;
    }

    public void setYear(Integer medical_year) {
    	this.medical_year = medical_year;
    }

    public Integer getMonth() {
    	return medical_month;
    }

    public void setMonth(Integer medical_month) {
    	this.medical_month = medical_month;
    }

    public Integer getDay() {
    	return medical_day;
    }

    public void setDay(Integer medical_day) {
    	this.medical_day = medical_day;
    }
}