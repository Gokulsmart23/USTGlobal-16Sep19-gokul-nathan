package com.ustglobal.collection.first;

import java.util.ArrayList;
import java.util.Iterator;

public class TestC {

	public static void main(String[] args) {
		
		ArrayList al = new ArrayList();
		al.add(23);
		al.add(98.7);
		al.add(true);
		al.add("Good evening");
		
		Iterator it = al.iterator();
		Object o1 = it.next();
		System.out.println("obj1"+o1);
		
		Object o2 = it.next();
		System.out.println("obj2"+o2);
		
		Object o3 = it.next();
		System.out.println("obj3"+o3);
		
		Object o4 = it.next();
		System.out.println("obj4"+o4);
		
		boolean b = it.hasNext();
		System.out.println("hashNext "+b);
		
		/*Object o5 = it.next();
		System.out.println("obj5"+o5);*/
		
		System.out.println("----------------- Using for loop -----------------");
		
		for(int i=0; i<al.size(); i++) {
			Object o = al.get(i);
			System.out.println(o);
		}
		
		ArrayList a = new ArrayList();
		a.add(12);
		a.add(233.44);
		a.add("momo");
		a.add(false);
		
		System.out.println("------------------------- Using iterator ------------------");
		
		Iterator it1 = a.iterator();
		while(it1.hasNext()) {
			Object o = it1.next();
			System.out.println(o);
		}
		
		
	}

}
