package animalManager.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.JoinColumn;

@Entity // This tells Hibernate to make a table out of this class
public class Masterinfo {
    @Id
    private String pet_id;

    private String master_name;

    private String master_gender;

    private Integer master_age;

    private String master_addr;

    private String master_phonenumber;

    private String master_email;

	public String getAnimalId() {
		return pet_id;
	}

	public void setAnimalId(String pet_id) {
		this.pet_id = pet_id;
	}

	public String getName() {
		return master_name;
	}

	public void setName(String master_name) {
		this.master_name = master_name;
	}

	public String getGender() {
		return master_gender;
	}

	public void setGender(String master_gender) {
		this.master_gender = master_gender;
	}

	public Integer getAge() {
		return master_age;
	}

	public void setAge(Integer master_age) {
		this.master_age = master_age;
	}

	public String getAddress() {
		return master_addr;
	}

	public void setAddress(String master_addr) {
		this.master_addr = master_addr;
	}

	public String getPhonenumber() {
		return master_phonenumber;
	}

	public void setPhonenumber(String master_phonenumber) {
		this.master_phonenumber = master_phonenumber;
	}

	public String getEmail() {
		return master_email;
	}

	public void setEmail(String master_email) {
		this.master_email = master_email;
	}
}