package com.ustglobal.maps;

import java.util.Hashtable;

public class TestH {

	public static void main(String[] args) {
		
		Hashtable<Integer, String> ht = new Hashtable<>();
		ht.put(501, "ajay");
		ht.put(102, "vijay");
		ht.put(103, "sonu");
		ht.put(104, "monu");
		ht.put(99, "sriram");
		ht.put(105, "ax");
		ht.put(208, "jj");
//		ht.put(null, "john");  NullPointerException
//		ht.put(98, null);	NullPointerException
		
		System.out.println("Data "+ht);
	}

}
