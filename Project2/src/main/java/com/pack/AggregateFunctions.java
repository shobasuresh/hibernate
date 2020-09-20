package com.pack;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;

public class AggregateFunctions {

	public static void main(String[] args) {
		 SessionFactory factory=HibernateUtil.getSessionFactory();
		    Session session=factory.openSession(); 
		    
		 //   Query q=session.createQuery("select round(sum(salary),2) from Login"); 
		    Query q=session.createQuery("select min(salary) from Login");  
		    List<Integer> list=q.list();  
		    System.out.println(list.get(0));  

	}

}
