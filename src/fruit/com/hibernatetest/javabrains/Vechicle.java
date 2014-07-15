package fruit.com.hibernatetest.javabrains;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Vechicle {
	@Id 
	@GeneratedValue
	private int vechicleID;
	private String vechicleName;
	
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
	
	
}
