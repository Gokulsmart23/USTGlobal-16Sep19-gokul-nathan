package com.ustglobal.jpawithhibernateapp;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ustglobal.jpawithhibernateapp.onetomany.Pencil;
import com.ustglobal.jpawithhibernateapp.onetomany.PencilBox;

public class TestOneToMany {

	public static void main(String[] args) {
		
		PencilBox pb = new PencilBox();
		pb.setBid(1);
		pb.setBname("Apsara");
		
		Pencil p1 = new Pencil();
		p1.setPid(11);
		p1.setColor("black");
		p1.setPencilBox(pb);
		
		Pencil p2 = new Pencil();
		p2.setPid(12);
		p2.setColor("grey");
		p2.setPencilBox(pb);
		
		EntityManager em = null;
		EntityTransaction et = null;
		try {
			EntityManagerFactory emf = Persistence.createEntityManagerFactory("TestPersistence");
			em = emf.createEntityManager();
			et = em.getTransaction();
			
			et.begin();
			em.persist(p1);
			em.persist(p2);
			System.out.println("Record Saved");
			et.commit();
			
		} catch (Exception e) {
			e.printStackTrace();   
			et.rollback();
		}
		em.close();
	}

}
