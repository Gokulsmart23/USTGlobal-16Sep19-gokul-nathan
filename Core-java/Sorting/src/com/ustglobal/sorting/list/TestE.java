package com.ustglobal.sorting.list;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

public class TestE {

	public static void main(String[] args) {
		
		LinkedList<Pen> li = new LinkedList<Pen>();
		
		Pen p1 = new Pen(10, "cello");
		Pen p2 = new Pen(20, "flair");
		Pen p3 = new Pen(100, "parker");
		Pen p4 = new Pen(30, "hero");
		
		li.add(p1);
		li.add(p2);
		li.add(p3);
		li.add(p4);
		
		Collections.sort(li);
		displayDetails(li);
		
		
	}

	private static void displayDetails(LinkedList<Pen> li) {
		Iterator<Pen> it = li.iterator();
		while (it.hasNext()) {
			Pen p = it.next();
			System.out.println(p.brand);
			System.out.println(p.price);
		}
	}

}
