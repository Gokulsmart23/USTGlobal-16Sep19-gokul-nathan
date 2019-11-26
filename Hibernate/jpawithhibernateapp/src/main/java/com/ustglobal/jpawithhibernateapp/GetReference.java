package com.ustglobal.jpawithhibernateapp;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ustglobal.jpawithhibernateapp.dto.ProductInfo;

public class GetReference {
	public static void main(String[] args) {

		EntityManager entityManager = null;
		EntityTransaction entityTransaction = null;

		try {
			EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("TestPersistence");
			entityManager = entityManagerFactory.createEntityManager();
			ProductInfo productDetails = entityManager.getReference(ProductInfo.class, 102);

			System.out.println("ID = "+productDetails.getPid());
			System.out.println("Name = "+productDetails.getPname());
			System.out.println("Quantity = "+productDetails.getQuantity());
			System.out.println(productDetails.getClass());
			System.out.println("--------------------------------");
		} catch (Exception e) {
			e.printStackTrace();
		}
		entityManager.close();
	}

}
