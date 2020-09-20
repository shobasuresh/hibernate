package com.pack;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

public class UpdateExample {
	public static void main(String args[])
	{
	 
      try
      {
    SessionFactory factory=HibernateUtil.getSessionFactory();
    Session session=factory.openSession(); 
    
    Transaction	tx= session.beginTransaction(); 
      
 // 	String hql="update Login set salary=6000 where id=3";
	String hql="update Login set salary=6600 where id=:eno";
	
	
  
  	 Query query = session.createQuery(hql);
     query.setParameter("eno", 3);
   
       int row = query.executeUpdate();
      
       if (row == 0){
         System.out.println("Has not updated any row!");
       }
       else{
         System.out.println("updated  Rows: " + row);
         tx.commit();
       }
      
  	}
       catch(Exception e){
    	      System.out.println(e.getMessage());
    	    }
  }
}



