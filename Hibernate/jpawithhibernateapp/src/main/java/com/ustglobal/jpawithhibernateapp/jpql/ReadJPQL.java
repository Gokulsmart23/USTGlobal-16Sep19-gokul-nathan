package com.ustglobal.jpawithhibernateapp.jpql;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.ustglobal.jpawithhibernateapp.dto.ProductInfo;

public class ReadJPQL {

	public static void main(String[] args) {

		String jpql = "from ProductInfo";
		String njpql = "select pname from ProductInfo";
		EntityManager entityManager = null;

		try {
			EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("TestPersistence");
			entityManager = entityManagerFactory.createEntityManager();

			Query query = entityManager.createQuery(njpql);
			List<String> li = query.getResultList();		// only for select query

			for (String s : li) {
				System.out.println(s);
			}
			
//			for (ProductInfo productInfo : al) {
//				System.out.println("ID = "+productInfo.getPid());
//				System.out.println("Name = "+productInfo.getPname());
//				System.out.println("Quantity = "+productInfo.getQuantity());
//				System.out.println("--------------------------------------");
//			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		entityManager.close();
	}

}
