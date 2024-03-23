package online.game.beans;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="users")
public class Users {
	@Id
	String id;
	String firstname;
	String lastname;
	String mobilenumber;
	String country;
	String amount;

}
