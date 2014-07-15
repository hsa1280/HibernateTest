package fruit.com.hibernatetest;

import javax.persistence.Entity;

@Entity
public class Vechicle {

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
