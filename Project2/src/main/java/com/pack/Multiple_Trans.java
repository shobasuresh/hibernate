package com.pack;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class Multiple_Trans {

	public static void main(String[] args) {
		Session session=null;
		 try
		    {
		 SessionFactory factory=HibernateUtil.getSessionFactory();
		  session=factory.openSession(); 
		   
		    Transaction tx=session.beginTransaction();
			 // tx.begin();
			 
			 Login obj=(Login) session.get(Login.class,4);
		 
			 obj.setPassword("krit");
			 session.update(obj);
			 tx.commit();
			 tx=null;
			 session.close();
			 
			 System.out.println("Login Object now detatched");
			 //Reattach and update
			
			 session=factory.openSession();
			  tx=session.beginTransaction();
			  obj.setPassword("loaf");
			  session.update(obj);
			  tx.commit();
			 session.close();
			 System.out.println("Login object synchronized again");
			 
		  }catch(Exception e){
			  System.out.println(e.getMessage());
			}finally{
				//  session.close();
				 HibernateUtil.shutdown();
			  }
	}
	
	}


