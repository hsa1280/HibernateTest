package fruit.com.hibernatetest.javabrains;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="USER_DETAILS", schema="vehicle")
public class UserDetails {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int userId;
	private String userName;
//	@OneToMany
//	@JoinTable(
//			name="USER_VEHICLE",
//			joinColumns=@JoinColumn(name="USER_ID"),
//			inverseJoinColumns=@JoinColumn(name="VEHICLE_ID")
//	)
	//@ManyToMany(mappedBy="users")
	//private Collection<Vehicle> vehicles = new ArrayList<Vehicle>();
	
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	
}
