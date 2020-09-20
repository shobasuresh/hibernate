package com.pack;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class UpdateExample2 {

	public static void main(String[] args) {
		 SessionFactory factory=HibernateUtil.getSessionFactory();
		    Session session=factory.openSession(); 
		  try
		  {
		    Transaction tx=session.beginTransaction();
		    Login obj=(Login) session.load(Login.class,12); 
		   
		 //obj.setUsername("preetha");
		 // session.update(obj); 
		 tx.commit();
			  } 
			  catch(Exception e)
			  {
				  
				  System.out.println(e);
			  }
		  }
		

	}


