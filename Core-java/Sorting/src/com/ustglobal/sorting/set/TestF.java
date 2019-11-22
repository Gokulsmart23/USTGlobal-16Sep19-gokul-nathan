package com.ustglobal.sorting.set;

import java.util.Iterator;
import java.util.TreeSet;

public class TestF {

	public static void main(String[] args) {
		
		TreeSet<String> ts = new TreeSet<>();
		
		ts.add("gokul");
		ts.add("mohan");
		ts.add("kavin");
		ts.add("sathi");
		ts.add("ajay");
		
		System.out.println("----------------- Using for each ---------------");
		
		for (String s : ts) {
			System.out.println(s);
		}
		
		System.out.println("------------------ Using iterator ------------------");
		
		Iterator<String> it = ts.iterator();
		while (it.hasNext()) {
			String s = it.next();
			System.out.println(s);
		}
	}

}
