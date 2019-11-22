package com.ustglobal.sorting.list;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

public class TestB {

	public static void main(String[] args) {
		
		LinkedList<Laptop> li = new LinkedList<>();
		Laptop lp1 = new Laptop(25000, 4, "HP");
		Laptop lp2 = new Laptop(35000, 6, "Dell");
		Laptop lp3 = new Laptop(100000, 12, "Mac");
		Laptop lp4 = new Laptop(50000, 8, "Asus");
		
		li.add(lp1);
		li.add(lp2);
		li.add(lp3);
		li.add(lp4);
		li.add(new Laptop(20000, 2, "acer"));
		
		System.out.println("Before sort "+li);
		displayLaptopDetails(li);
		
		Collections.sort(li);
		System.out.println("After sort "+li);
		
		
	}
	
	public static void displayLaptopDetails (LinkedList<Laptop> l) {
		Iterator<Laptop> it = l.iterator();
		
		while(it.hasNext()) {
			Laptop lp = it.next();
			System.out.println("Brand is "+lp.name);
			System.out.println("Price is "+lp.price);
			System.out.println("Ram is "+lp.ram);
			System.out.println("---------------------------------");
		}
	}
	

}
