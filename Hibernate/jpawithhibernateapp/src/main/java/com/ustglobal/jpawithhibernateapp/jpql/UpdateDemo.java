package com.ustglobal.jpawithhibernateapp.jpql;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class UpdateDemo {

	public static void main(String[] args) {

		String qry = "update ProductInfo set pname='Notepad' where pid=101";
		EntityManager em= null;
		EntityTransaction et = null;

		try {
			EntityManagerFactory emf= Persistence.createEntityManagerFactory("TestPersistence");
			em = emf.createEntityManager();
			et = em.getTransaction();
			et.begin();
			Query query = em.createQuery(qry);		// other than select query 
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
