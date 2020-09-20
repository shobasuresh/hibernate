package com.pack;
 
import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;


public class CriteriaDemo2 {
 
	public static void main(String[] args) {
		 SessionFactory factory=HibernateUtil.getSessionFactory();
		    Session session=factory.openSession(); 
		    
		    CriteriaBuilder builder = session.getCriteriaBuilder();
	         CriteriaQuery<String> query = builder.createQuery(String.class);
	         Root<Login> root = query.from(Login.class);
	       
	         query.select(root.get("username"));
	       
	         Query<String> q=session.createQuery(query);
	        
	         List<String> list=q.getResultList();
	         for (String name : list) {
	            System.out.println(name);
	         }
		    	

	}

}
