package com.ustglobal.collectionframework.list;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

public class TestB {
	
	public static void main(String[] args) {
		LinkedList<Laptop> ll = new LinkedList<Laptop>();
		
		Laptop lp1 = new Laptop(55000, 8, "hp");
		Laptop lp2 = new Laptop(35000, 6, "dell");
		Laptop lp3 = new Laptop(45000, 4, "levono");
		Laptop lp4 = new Laptop(30000, 8, "Asus");
		
		ll.add(lp1);
		ll.add(lp2);
		ll.add(lp3);
		ll.add(lp4);
		ll.add(new Laptop(20000, 4, "acer"));
		System.out.println("======before sorting=============");
		 displayLaptopDetails(ll);
		 Collections.sort(ll);
		 System.out.println("======after sorting===========");
		 displayLaptopDetails(ll);
		 
		

	}
	
	static void displayLaptopDetails(LinkedList<Laptop> ll) {
		Iterator<Laptop> it = ll.iterator();
		while(it.hasNext()) {
			Laptop lp = it.next();
			System.out.println("Brand name is"+lp.name);
			System.out.println("price is "+lp.price);
			System.out.println("ram is "+lp.ram);
		}
		
		
	}

}
