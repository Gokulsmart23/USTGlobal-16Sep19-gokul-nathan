package com.ustglobal.maps;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Set;

public class TestC {

	public static void main(String[] args) {
		
		LinkedHashMap<String, Integer> lh = new LinkedHashMap<>();
		
		lh.put("banglore", 560068);
		lh.put("hariyana", 134203);
		lh.put("hosur", 635109);
		
		System.out.println(lh);
		
		System.out.println("--------------------------------------------");
		
		Set<String> s = lh.keySet();	
		for (String key : s) {
			System.out.println("Key is "+key);
		}
		
		System.out.println("-------------------------------------------");
		
		Collection<Integer> c = lh.values();
		for (Integer i : c) {
			System.out.println("Value is "+i);
		}
		
		System.out.println("--------------------------------------------");
	}

}
