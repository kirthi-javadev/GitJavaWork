package com.hibernate.mypackage;

import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.query.Query;

public class Select 
	{
	public static void main( String[] args )  
	{  
		StandardServiceRegistry ssr = new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build();  
		Metadata meta = new MetadataSources(ssr).getMetadataBuilder().build();  
		SessionFactory factory = meta.getSessionFactoryBuilder().build();  
		Session session = factory.openSession();  
		Transaction t = session.beginTransaction();
		Query q = session.createQuery("from emptable");

		List l = q.list();
		Iterator it = l.iterator();
		while (it.hasNext()) {
			Employee m = (Employee) it.next();
			System.out.println("FirstName    : " + m.getFirstName());
			System.out.println("LastName    : " + m.getLastName());
		factory.close();
	session.close();
	}
}
}


