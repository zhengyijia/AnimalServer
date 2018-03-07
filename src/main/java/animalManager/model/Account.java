package animalManager.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity // This tells Hibernate to make a table out of this class
public class Account {
    @Id
    private String username;

    private String password;

	public String getName() {
		return username;
	}

	public void setName(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}


}