package com.ustglobal.sorting.set;

import java.util.Iterator;
import java.util.TreeSet;

public class TestJ {

	public static void main(String[] args) {
		
		SortByCustomerName scn = new SortByCustomerName();
		SortByCustomerId sci = new SortByCustomerId();
		SortByCustomerSalary scs = new SortByCustomerSalary();
		
		TreeSet<Customer> ts = new TreeSet<>(sci);
		Customer c1 = new Customer("gokul", 1, 29000);
		Customer c2 = new Customer("mohan", 2, 20000);
		Customer c3 = new Customer("kavin", 3, 26000);
		Customer c4 = new Customer("ajay", 4, 23000);
		
		ts.add(c1);
		ts.add(c2);
		ts.add(c3);
		ts.add(c4);
		
		System.out.println("------------------- Using iterator ------------------");
		
		Iterator<Customer> it = ts.iterator();
		while (it.hasNext()) {
			Customer c = it.next();
			System.out.println("Customer id "+ c.id);
			System.out.println("customer name "+c.name);
			System.out.println("customer salary "+c.salary);
			System.out.println("---------------------------------------------");
		}
				
		 
	}

}
