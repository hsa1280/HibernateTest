package fruit.com.hibernatetest.javabrains;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

import fruit.com.hibernatetest.self.Employee;

public class HibernateTest {

	public static void main(String args[]) {
		
		UserDetails user = new UserDetails();
		user.setUserName("First User");
		
		Vechicle vechicle = new Vechicle();
		vechicle.setVechicleName("car");
		user.setVechicle(vechicle);
		
		Configuration configuration = new Configuration().configure();
		StandardServiceRegistryBuilder builder = new StandardServiceRegistryBuilder().applySettings(configuration.getProperties());
		SessionFactory sessionFactory = configuration.buildSessionFactory(builder.build());
		Session session = sessionFactory.openSession();
		
		session.beginTransaction();
		session.save(user);
		session.save(vechicle);
		session.getTransaction().commit();
		
		session.close();
	}
}
