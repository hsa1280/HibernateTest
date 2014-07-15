package fruit.com.hibernatetest.javabrains;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="USER_DETAILS")
public class UserDetails {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int userId;
	private String userName;
	@OneToOne
	@JoinColumn(name="VECHICLE_ID")
	private Vechicle vechicle;
	
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
	public Vechicle getVechicle() {
		return vechicle;
	}
	public void setVechicle(Vechicle vechicle) {
		this.vechicle = vechicle;
	}
	
}
