package com.pack;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;

import java.util.List;

import javax.persistence.criteria.*;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
 

public class CriteriaDemo {

	public static void main(String[] args) {
	 
		 SessionFactory factory=HibernateUtil.getSessionFactory();
		    Session session=factory.openSession(); 
		    
		    CriteriaBuilder builder = session.getCriteriaBuilder();
	         CriteriaQuery<Login> query = builder.createQuery(Login.class);
	         Root<Login> root = query.from(Login.class);
	         query.select(root);
	      
	         Query<Login> q=session.createQuery(query);
	         List<Login> users=q.getResultList();
	     	         for (Login login : users) {
	            System.out.println(login.getUsername());
	         }
	}

}
