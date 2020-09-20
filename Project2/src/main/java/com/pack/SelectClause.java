package com.pack;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;

public class SelectClause {

	public static void main(String[] args) {
		try
		{
		   SessionFactory factory=HibernateUtil.getSessionFactory();
		    Session session=factory.openSession(); 
		    
		   
			 
		 			 
				 Query<Object[]> query=session.createQuery("Select id, username  from Login");  
				// List<?>  list=query.list();  
				 List<Object[]>  list= query.getResultList();
				
				 Iterator<?> itr=list.iterator();
				 
				  while (itr.hasNext())
				 {
					 Object[] row = (Object[]) itr.next();
				       System.out.println("ID: " + row[0]);
				       System.out.println("Name: " + row[1]);
					 
				 }
				  
				   for(Object[] object:list)
				   {
					   System.out.println(object[0]);
				   }
		}
		catch(Exception e){
			  System.out.println(e.getMessage());
			}finally{
				//  session.close();
				 HibernateUtil.shutdown();
			  }

	}

}
