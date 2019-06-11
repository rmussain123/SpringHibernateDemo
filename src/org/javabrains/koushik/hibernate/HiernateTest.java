/**
 * 
 */
package org.javabrains.koushik.hibernate;

import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.javabrains.koushik.dto.Address;
import org.javabrains.koushik.dto.UserDetails;

/**
 * @author ussainaslee
 *
 */
public class HiernateTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		UserDetails usd = new UserDetails();
		usd.setDescription("Bigger Description..");
		usd.setJoinedDate(new Date());
		usd.setUserName("Hussain");
		
		Address address = new Address();
		address.setCity("Chennai");
		address.setState("TamilNadu");
		address.setStreet("Chennai Street");
		usd.setHomeAddress(address);
		
		Address address2 = new Address();
		address2.setCity("Chennai1");
		address2.setState("TamilNadu1");
		address2.setStreet("Chennai Street1");
		usd.setOfficeAddress(address2);
		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		session.save(usd);
		session.getTransaction().commit();	
		session.close();
		
		usd = null;
		session = sessionFactory.openSession();
		session.beginTransaction();
		usd = session.get(UserDetails.class, 16);

	}

}
