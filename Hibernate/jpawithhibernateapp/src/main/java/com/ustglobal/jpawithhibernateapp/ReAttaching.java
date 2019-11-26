package com.ustglobal.jpawithhibernateapp;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ustglobal.jpawithhibernateapp.dto.ProductInfo;

public class ReAttaching {

	public static void main(String[] args) {

		EntityManager entityManager = null; 
		EntityTransaction entityTransaction = null;

		try {
			EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("TestPersistence");
			entityManager = entityManagerFactory.createEntityManager();
			entityTransaction = entityManager.getTransaction();
			entityTransaction.begin();	// start transaction
			ProductInfo productInfo = entityManager.find(ProductInfo.class, 101);
			System.out.println(entityManager.contains(productInfo));
			entityManager.detach(productInfo);		// Object detach
			System.out.println(entityManager.contains(productInfo));
			
			ProductInfo productInfo2 = entityManager.merge(productInfo);	// Re-Attach the detached object
			
			productInfo2.setPname("Bag");
			productInfo.setPname("Pen");
			System.out.println("Record Updated");
			entityTransaction.commit();

		} catch (Exception e) {
			e.printStackTrace();
			entityTransaction.rollback();
		}
		entityManager.close();
	}

}
