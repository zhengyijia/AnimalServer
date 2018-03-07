package animalManager.model;

import java.io.Serializable;

public class FoodPK implements Serializable{
    
    private String food_username;

    private Integer food_year;

    private Integer food_month;

    private Integer food_day;

    private String food_type;

    public String getUserName() {
    	return food_username;
    }

    public void setUserName(String food_username) {
    	this.food_username = food_username;
    }

    public Integer getYear() {
    	return food_year;
    }

    public void setYear(Integer food_year) {
    	this.food_year = food_year;
    }

    public Integer getMonth() {
    	return food_month;
    }

    public void setMonth(Integer food_month) {
    	this.food_month = food_month;
    }

    public Integer getDay() {
    	return food_day;
    }

    public void setDay(Integer food_day) {
    	this.food_day = food_day;
    }

    public String getType() {
    	return food_type;
    }

    public void setType(String food_type) {
    	this.food_type = food_type;
    }
}