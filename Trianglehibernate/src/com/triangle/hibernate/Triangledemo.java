package com.triangle.hibernate;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
public class Triangledemo {
	public static void main(String[] args) {
		StandardServiceRegistry ssr = new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build();  
		Metadata meta = new MetadataSources(ssr).getMetadataBuilder().build();  
        
        SessionFactory factory = meta.getSessionFactoryBuilder().build();  
        Session s = factory.openSession();  
		Transaction t=s.beginTransaction();
		//t.begin();
		Pointer p1= new Pointer(2,3,4,5,6,4);
		
		double area= p1.CalcArea();
		
		Triangle t1=new Triangle(1,"t1",area);
		
		s.save(t1);
		
		t.commit(); 
		System.out.println("success...");
		factory.close(); 
		s.close();
		 		
	}
	}

