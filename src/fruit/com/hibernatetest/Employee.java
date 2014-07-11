package fruit.com.hibernatetest;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "EMPLOYEE")
@SequenceGenerator(name="my_seq", sequenceName="my_seq", allocationSize = 1)
public class Employee {
	//There are other ways to generate sequence
	/*
	 * 1.@GenericGenerator(name="generator", strategy="increment")
	 * 	 @GeneratedValue(generator="generator")
	 */
	/*
	 * 2.@GeneratedValue(strategy=GenerationType.SEQUENCE)
	 * type canbe AUTO, IDENTITY, SEQUENCE, or TABLE
	 * a sequence for Oracle, an identity for MS SQL
	 */
	@Id 
	@GeneratedValue( strategy = GenerationType.SEQUENCE, generator = "my_seq" )
	@Column(name= "id")
	private int id;
	
	@Column(name = "first_name")
	private String firstName;
	
	@Column(name = "last_name")
	private String lastName;
	
	@Column(name = "salary")
	private int salary;

	public Employee() {
		
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

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}
	
}
