package fruit.com.hibernatetest.javabrains;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "vehicle", schema = "vehicle")
public class Vehicle {
	@Id 
	@GeneratedValue
	private int vechicleID;
	private String vechicleName;
	
//	@ManyToMany
//	@JoinTable(
//			name="USER_VEHICLE",
//			joinColumns=@JoinColumn(name="VEHICLE_ID"),
//			inverseJoinColumns=@JoinColumn(name="USER_ID")
//	)
//	private Collection<UserDetails> users = new ArrayList<UserDetails>();
	
	@ManyToOne
	private UserDetails user;
	
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
	public UserDetails getUser() {
		return user;
	}
	public void setUser(UserDetails user) {
		this.user = user;
	}
	
}
