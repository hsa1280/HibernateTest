package fruit.com.hibernatetest.javabrains;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

import fruit.com.hibernatetest.self.Employee;

public class HibernateTest {

	public static void main(String args[]) {
		
//		UserDetails user = new UserDetails();
//		user.setUserName("First User");
		
		Vehicle vehicle = new Vehicle();
		vehicle.setVechicleName("car");
		
//		Vehicle vehicle2 = new Vehicle();
//		vehicle2.setVechicleName("Jeep");
		
//		user.getVehicles().add(vehicle);
//		user.getVehicles().add(vehicle2);
		
//		vehicle.getUsers().add(user);
//		vehicle2.getUsers().add(user);
		
		Configuration configuration = new Configuration().configure();
		StandardServiceRegistryBuilder builder = new StandardServiceRegistryBuilder().applySettings(configuration.getProperties());
		SessionFactory sessionFactory = configuration.buildSessionFactory(builder.build());
		Session session = sessionFactory.openSession();
		
		session.beginTransaction();
//		session.save(user);
		session.save(vehicle);
//		session.save(vehicle2);
		session.getTransaction().commit();
		
		session.close();
		
		session = sessionFactory.openSession();
		session.beginTransaction();
		Vehicle vh = (Vehicle)session.get(Vehicle.class, 1);
		vh.setVechicleName("Update Vehicle");
		session.update(vh);
		//session.getTransaction().commit();;
		
		session.close();
		
	}
}
