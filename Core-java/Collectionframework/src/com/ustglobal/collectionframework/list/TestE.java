package com.ustglobal.collectionframework.list;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class TestE {
	public static void main(String[] args) {
		LinkedList<Pen> ll = new LinkedList<Pen>();

		Pen p1 = new Pen(20.2,"cello");
		Pen p2 = new Pen(40.2,"Flair");
		Pen p3 = new Pen(30.2,"pinpoint");
		Pen p4 = new Pen(10.2,"writo meter");
		
		ll.add(p1);
		ll.add(p2);
		ll.add(p3);
		ll.add(p4);
		System.out.println("before sorting");
		displayPenDetails(ll);
		
		SortByPrice sb = new SortByPrice();
		SortByBrand sbb = new SortByBrand();
//		Collections.sort( ll,sb);
		Collections.sort(ll,sbb);
		
		System.out.println("after sorting ");
		displayPenDetails(ll);

	}
	
	static void displayPenDetails(LinkedList<Pen> ll) {
		Iterator<Pen> it = ll.iterator();
		while(it.hasNext()) {
			Pen p= it.next();
			System.out.println("price is "+p.price);
			System.out.println("brand is "+p.brand);
			System.out.println("======================");
			
		}
		
	}

}
