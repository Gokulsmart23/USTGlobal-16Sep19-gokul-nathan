package com.ustglobal.jpawithhibernateapp.jpql;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class DynamicUpdateJPQL {

	public static void main(String[] args) {
		
		String qry = "update ProductInfo set pname=:name where pid=:id";
		
		EntityManager em= null;
		EntityTransaction et = null;

		try {
			EntityManagerFactory emf= Persistence.createEntityManagerFactory("TestPersistence");
			em = emf.createEntityManager();
			et = em.getTransaction();
			et.begin();
			Query query = em.createQuery(qry);		// other than select query 
			
			query.setParameter("name", "Book");		// setting values to the query
			query.setParameter("id", 101);
			
			int result = query.executeUpdate();
			System.out.println(result+" Row(s) updated");
			et.commit();

		} catch (Exception e) {
			e.printStackTrace();
			et.rollback();

		} finally {
			em.close();
		}
	}

}
