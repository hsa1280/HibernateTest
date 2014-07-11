package fruit.com.hibernatetest;

public class Employee1 {

	private int id;
	private String firstName;
	private String lastName;
	private int salary;
	
	public Employee1(){
		
	}
	
	public Employee1( String fname, String lname, int salary ) {
		
		this.firstName = fname;
		this.lastName = lname;
		this.salary = salary;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastNmae) {
		this.lastName = lastNmae;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	
}
