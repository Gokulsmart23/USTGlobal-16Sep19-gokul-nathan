package com.ustglobal.jpawithhibernateapp;

import java.util.ArrayList;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ustglobal.jpawithhibernateapp.manytomany.Course;
import com.ustglobal.jpawithhibernateapp.manytomany.Student;

public class TestManyToMany {

	public static void main(String[] args) {
		
		Course c1 = new Course();
		c1.setCid(10);
		c1.setCname("java");
		
		Course c2 = new Course();
		c2.setCid(20);
		c2.setCname("js");
		
		ArrayList<Course> al = new ArrayList<Course>();
		al.add(c1);
		al.add(c2);
		
		Student s = new Student();
		s.setSid(1);
		s.setSname("gokul");
		s.setCourse(al);
		
		EntityManager em = null;
		EntityTransaction et = null;
		try {
			EntityManagerFactory emf = Persistence.createEntityManagerFactory("TestPersistence");
			em = emf.createEntityManager();
			et = em.getTransaction();
			
			et.begin();
			em.persist(s);
			System.out.println("Record Saved");
			et.commit();
			
		} catch (Exception e) {
			e.printStackTrace();   
			et.rollback();
		}
		em.close();
	}

}
