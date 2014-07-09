import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;


public class ManageEmployee {

	private static SessionFactory factory;
	public static void main(String args[]) {
		
		try{
			//the buildSessionFactory() was deprecated.  
			//factory = new Configuration().configure().buildSessionFactory();
			Configuration configuration = new Configuration().configure();
			StandardServiceRegistryBuilder builder = new StandardServiceRegistryBuilder().
			applySettings(configuration.getProperties());
			factory = configuration.buildSessionFactory(builder.build());
		}catch (Throwable ex) {
			System.err.println("Failed to create sessionFactory object." + ex);
			throw new ExceptionInInitializerError(ex);
		}
		ManageEmployee me = new ManageEmployee();
		
		/*Add few employee records in database*/
		Integer empID1 = me.addEmployee("Zara", "Ali", 1000);
	    Integer empID2 = me.addEmployee("Daisy", "Das", 5000);
	    Integer empID3 = me.addEmployee("John", "Paul", 10000);
	    
	    /*List down all the employees*/
	    me.listEmployees();
	}
	
    
    public Integer addEmployee( String fname, String lname, int salary) {
    	
    	Session session = factory.openSession();
    	Transaction tx = null;
    	Integer employeeID = null;
    	try{
    		tx = session.beginTransaction();
    		Employee employee = new Employee(fname, lname, salary);
    		employeeID = (Integer)session.save(employee);
    		tx.commit();
    	}catch(HibernateException e) {
    		if(tx != null) 
    			tx.rollback();
    		e.printStackTrace();
    	}finally {
    		session.close();
    	}
    	return employeeID;
    }
     
    public void listEmployees() {
    	
    	Session session = factory.openSession();
    	Transaction tx = null;
    	try{
    		tx = session.beginTransaction();
    		List<Employee> employees = session.createQuery("From Employee").list();
    		for( Employee employee : employees ) {
    	           System.out.print("First Name: " + employee.getFirstName()); 
    	           System.out.print("  Last Name: " + employee.getLastName()); 
    	           System.out.println("  Salary: " + employee.getSalary()); 
    		}
    	}catch(HibernateException e) {
    		if(tx != null)
    			tx.rollback();
    		e.printStackTrace();
    	}
    }
}
