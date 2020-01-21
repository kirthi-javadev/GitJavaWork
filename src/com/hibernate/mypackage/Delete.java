package com.hibernate.mypackage;

import org.hibernate.Session;  
import org.hibernate.SessionFactory;  
import org.hibernate.Transaction;  
import org.hibernate.boot.Metadata;  
import org.hibernate.boot.MetadataSources;  
import org.hibernate.boot.registry.StandardServiceRegistry;  
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;  
public class Delete 
{  
public static void main( String[] args )  
{ 
	//create registry for service
	StandardServiceRegistry ssr = new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build();  
	 
	// create meta data object from registry
	Metadata meta = new MetadataSources(ssr).getMetadataBuilder().build();  
	      
	//build a session factory from meta object    
	SessionFactory factory = meta.getSessionFactoryBuilder().build();  
	        
	//create session object from session factory
	Session session = factory.openSession();  
	        
	//create transaction object by calling beginTransaction() method of session
	Transaction t = session.beginTransaction();  
	        
	//create bean or pojo object  
	Employee e1=new Employee();
	
	e1.setId(3);    
    session.delete(e1);
    t.commit();

    System.out.println("successfully saved details");    
    factory.close();  
    session.close();     
}  
} 




