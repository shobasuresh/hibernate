package com.pack;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

 

public class MyMain {
	public static void main(String args[])
	{
	 
    
    SessionFactory factory=HibernateUtil.getSessionFactory();
    Session session=factory.openSession();  
    Transaction tx = null; 
    
   tx= session.beginTransaction();
 	Login obj=new Login();
 	
   	obj.setUsername("sharan");
 	obj.setPassword("cc");
 
  
      	                        
 	session.save(obj);
 	tx.commit();
		System.out.println("Saved");
		session.close(); 
      

}
}
