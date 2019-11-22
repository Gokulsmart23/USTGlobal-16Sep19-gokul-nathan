package com.ustglobal.sorting.set;

import java.util.Iterator;
import java.util.TreeSet;

public class TestI {

	public static void main(String[] args) {
		
		SortByName sb = new SortByName();
		SortByPincode sp = new SortByPincode();
		SortByMICR sm = new SortByMICR();
		
		
		TreeSet<Bank> ts = new TreeSet<>(sp);
		Bank b1 = new Bank("HDFC", 560068, 67999494);
		Bank b2 = new Bank("SBI", 560071, 905434535);
		Bank b3 = new Bank("CITI", 560054, 424234223);
		Bank b4 = new Bank("CANADA", 560076, 34355453);
		Bank b5 = new Bank("CANADA", 560076, 34355453);
		
		ts.add(b1);	
		ts.add(b2);	
		ts.add(b3);	
		ts.add(b4);	
		ts.add(b5);
		
		System.out.println(ts.size());
		
		System.out.println("---------------- Using iterator -----------------");
		
		Iterator<Bank> it = ts.iterator();
		while (it.hasNext()) {
			Bank b = it.next();
			System.out.println("Name is "+b.name);
			System.out.println("Pincode is "+b.pincode);
			System.out.println("MICR is "+b.micr);
			System.out.println("-------------------------------------------------");
			
		}
	}

}
