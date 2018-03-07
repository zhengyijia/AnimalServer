package animalManager.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.JoinColumn;

@Entity // This tells Hibernate to make a table out of this class
public class Petinfo {
    @Id
    private String pet_id;

    private String pet_kinds;

    private String pet_gender;

    private Integer pet_age;

    private String pet_health;

    private String pet_vaccine;

    private String pet_remarks;

	public String getId() {
		return pet_id;
	}

	public void setId(String pet_id) {
		this.pet_id = pet_id;
	}

	public String getName() {
		return pet_kinds;
	}

	public void setName(String pet_kinds) {
		this.pet_kinds = pet_kinds;
	}

	public String getGender() {
		return pet_gender;
	}

	public void setGender(String pet_gender) {
		this.pet_gender = pet_gender;
	}

	public Integer getAge() {
		return pet_age;
	}

	public void setAge(Integer pet_age) {
		this.pet_age = pet_age;
	}

	public String getStatus() {
		return pet_health;
	}

	public void setStatus(String pet_health) {
		this.pet_health = pet_health;
	}

	public String getVaccine() {
		return pet_vaccine;
	}

	public void setVaccine(String pet_vaccine) {
		this.pet_vaccine = pet_vaccine;
	}

	public String getRemark() {
		return pet_remarks;
	}

	public void setRemark(String pet_remarks) {
		this.pet_remarks = pet_remarks;
	}
}