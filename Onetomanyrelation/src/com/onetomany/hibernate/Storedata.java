package com.onetomany.hibernate;

import java.util.ArrayList;    

import org.hibernate.Session;  
import org.hibernate.SessionFactory;  
import org.hibernate.Transaction;  
import org.hibernate.boot.Metadata;  
import org.hibernate.boot.MetadataSources;  
import org.hibernate.boot.registry.StandardServiceRegistry;  
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;  
public class Storedata {    
public static void main(String[] args) {    
     
    StandardServiceRegistry ssr=new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build();  
    Metadata meta=new MetadataSources(ssr).getMetadataBuilder().build();  
      
    SessionFactory factory=meta.getSessionFactoryBuilder().build();  
    Session session=factory.openSession();  
      
    Transaction t=session.beginTransaction();    
        
    Answer ans1=new Answer();    
    ans1.setAnswername("Java is a programming language");    
    ans1.setPostedBy("James");    
        
    Answer ans2=new Answer();    
    ans2.setAnswername("Java is a platform independent");    
    ans2.setPostedBy("George");    
        
    Answer ans3=new Answer();    
    ans3.setAnswername("Servlet is an Interface");    
    ans3.setPostedBy("Jain");    
        
    Answer ans4=new Answer();    
    ans4.setAnswername("Servlet is an API");    
    ans4.setPostedBy("Amen");    
        
    ArrayList<Answer> list1=new ArrayList<Answer>();    
    list1.add(ans1);    
    list1.add(ans2);    
        
    ArrayList<Answer> list2=new ArrayList<Answer>();    
    list2.add(ans3);    
    list2.add(ans4);    
        
    Question question1=new Question();    
    question1.setQname("What is Java?");    
    question1.setAnswers(list1);    
        
    Question question2=new Question();    
    question2.setQname("What is Servlet?");    
    question2.setAnswers(list2);    
        
    session.persist(question1);    
    session.persist(question2);    
        
    t.commit();    
    session.close();    
    System.out.println("success");    
}    
}   