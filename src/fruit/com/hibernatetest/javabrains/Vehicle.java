package fruit.com.hibernatetest.javabrains;

import java.util.ArrayList;
import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

@Entity
public class Vehicle {
	@Id 
	@GeneratedValue
	private int vechicleID;
	private String vechicleName;
	
	@ManyToMany
	@JoinTable(
			name="USER_VEHICLE",
			joinColumns=@JoinColumn(name="VEHICLE_ID"),
			inverseJoinColumns=@JoinColumn(name="USER_ID")
	)
	private Collection<UserDetails> users = new ArrayList<UserDetails>();
	
	public int getVechicleID() {
		return vechicleID;
	}
	public void setVechicleID(int vechicleID) {
		this.vechicleID = vechicleID;
	}
	public String getVechicleName() {
		return vechicleName;
	}
	public void setVechicleName(String vechicleName) {
		this.vechicleName = vechicleName;
	}
	public Collection<UserDetails> getUsers() {
		return users;
	}
	public void setUsers(Collection<UserDetails> users) {
		this.users = users;
	}
	
	
}
