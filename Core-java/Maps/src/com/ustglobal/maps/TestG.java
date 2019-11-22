package com.ustglobal.maps;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

public class TestG {

	public static void main(String[] args) {
		
		Employee e1 = new Employee(1, "gokul", 29000);
		Employee e2 = new Employee(2, "mohan", 22000);
		Employee e3 = new Employee(3, "kavin", 25000);
		Employee e4 = new Employee(4, "sathi", 19000);
		Employee e5 = new Employee(5, "sasi", 15000);
		Employee e6 = new Employee(6, "ajay", 20000);
		Employee e7 = new Employee(7, "praji", 12000);
		Employee e8 = new Employee(8, "vinoth", 24000);
		Employee e9 = new Employee(9, "karthik", 39000);
		
		ArrayList<Employee> al1 = new  ArrayList<Employee>();
		al1.add(e1);
		al1.add(e2);
		al1.add(e3);
		
		ArrayList<Employee> al2 = new  ArrayList<Employee>();
		al2.add(e4);
		al2.add(e5);
		al2.add(e6);
		
		ArrayList<Employee> al3 = new  ArrayList<Employee>();
		al3.add(e7);
		al3.add(e8);
		al3.add(e9);
		
		HashMap<Integer, ArrayList<Employee>> hm = new HashMap<>();
		hm.put(1, al1);
		hm.put(2, al2);
		hm.put(3, al3);
		
		ArrayList<Employee> al = hm.get(1);
		Iterator<Employee> it = al.iterator();
		while(it.hasNext()) {
			Employee e = it.next();
			System.out.println("Id is "+e.id);
			System.out.println("Name is "+e.name);
			System.out.println("Salary is "+e.salary);
			System.out.println("------------------------------------");
		}
		
	}

}
