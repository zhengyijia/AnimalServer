package animalManager.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;

@Entity // This tells Hibernate to make a table out of this class
@IdClass(FoodPK.class)
public class Foodinfo {

    @Id
    private String food_username;

    @Id
    private Integer food_year;

    @Id
    private Integer food_month;

    @Id
    private Integer food_day;

    @Id
    private String food_type;

    private Integer food_weight;

    private Integer food_energy;

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

	public Integer getWeight() {
		return food_weight;
	}

	public void setWeight(Integer food_weight) {
		this.food_weight = food_weight;
	}

	public Integer getEnergy() {
		return food_energy;
	}

	public void setEnergy(Integer food_energy) {
		this.food_energy = food_energy;
	}
}